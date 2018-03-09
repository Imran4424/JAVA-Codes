import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="MovingBalls" width=500 height=250> </applet>*/

public class MovingBalls extends Applet implements ActionListener, Runnable
{
    int d=100;
    Thread t;
    Button btnStart,btnStop,btnPause,btnResume;
    int i,m,j;
    TextField txtSpeed;
    Label lblSpeed;

    public void init()
    {
       lblSpeed = new Label("Enter speed in ms");
       txtSpeed = new TextField(5);

       btnStart  = new Button("Start");
       btnStop   = new Button("Stop");
       btnPause  = new Button("Pause");
       btnResume = new Button("Resume");

       btnStart.addActionListener(this);
       btnStop.addActionListener(this);
       btnPause.addActionListener(this);
       btnResume.addActionListener(this);

       add(lblSpeed);
       add(txtSpeed);
       add(btnStart);
       add(btnStop);
       add(btnPause);
       add(btnResume);
    }


    public void actionPerformed(ActionEvent ae)
    {

        if((ae.getSource()==btnStart)&&(t==null))
        {
          t = new Thread(this);
          t.start();
        }
        else if((ae.getSource()==btnStop)&&(t != null))
        {
          t.stop();
          t=null;
        }
        else if((ae.getSource()==btnPause)&&(t != null))
        {
          t.suspend();
        }
        else if((ae.getSource()==btnResume)&&(t != null))
        {
          t.resume();
        }

    }


    public void run()
    {
       m=((int)(Math.random()*1000))%700;

       for(j=500;;j--)
       {

          if(j<-1000)
          {
             m=((int)(Math.random()*1000))%700;
              j=500;
          }

          repaint();

          try
          {
              Thread.sleep(Integer.parseInt(txtSpeed.getText()));
          }
          catch(Exception e){}
        }


     }


      public void paint(Graphics g)
      {

          for(int k=0,i=d;i>0;i--,k++)
          {
               g.setColor(new Color(100+k,100,100+k));
               g.drawOval((m+200)%700+k/2,k/2+j,i,i);
           }


          for(int k=0,i=d;i>0;i--,k++)
          {
               g.setColor(new Color(100+k,200,80+k));
               g.drawOval(k/2+(m%700),k/2+j,i,i);
          }


          for(int k=0,i=d;i>0;i--,k++)
          {
             g.setColor(new Color(10+k,40,90+k));
             g.drawOval(k/2+(m+500)%700,k/2+j,i,i);
          }

      }


}
