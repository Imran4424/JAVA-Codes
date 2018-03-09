/**
 * @(#)Notepad.java
 *
 * Notepad application
 *
 * @author 
 * @version 1.00 2016/11/13
 */
 import java.awt.*;
 import java.awt.event.*;
 import java.io.*;
 
 
public class Notepad implements WindowListener,ActionListener{
	
	private Frame mainframe;
	private TextArea text;
	private Button exit,save;
	
	public  Notepad()
	{
		init();
	}
	
    
    public static void main(String[] args) {
    	Notepad ob = new Notepad();
    	
    	ob.show();
    }
    
    private void init()
    {
    	mainframe = new Frame("Notepad");
    	mainframe.setSize(1000,1000);
    	mainframe.setLayout(new BorderLayout());
    
    
    	mainframe.addWindowListener(new WindowAdapter(){
    		public void windowClosing(WindowEvent winevent)
    		{
    			System.exit(0);
    		}
    		
    	});
    	
    	
    	Panel bpanel = new Panel(new FlowLayout());

    	
    	
    	text = new TextArea();
    	text.setBackground(Color.WHITE);
    
    	exit = new Button("EXIT");
    	exit.addActionListener(this);
    	
    	save = new Button("SAVE");
    	save.addActionListener(this);
    	
    	
    	
    	mainframe.add(text);
    	
    	bpanel.add(save,BorderLayout.SOUTH);
    	bpanel.add(exit,BorderLayout.SOUTH);
    	mainframe.add(bpanel,BorderLayout.SOUTH);
    	mainframe.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==exit)
    	{
    		System.exit(0);
    	}
    	
    	if(e.getSource()==save)
    	{
    		BufferedWriter wr;
            try { wr = new BufferedWriter(new FileWriter("out.txt"));
                wr.write(text.getText());
                wr.close();
            } catch (IOException ex) {
                //Logger.getLogger(Okno.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.exit(0);
    	}
    
    }
    
    public void windowClosing(WindowEvent winevent)
    {
    	System.exit(0);
    }
    
    
    private void show()
    {
    	mainframe.setVisible(true);
    }
    
    
    
    
    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
}
