/**
 * @(#)Notes.java
 *
 * Notes application
 *
 * @author 
 * @version 1.00 2016/11/14
 */
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
 
public class Notes extends JFrame implements WindowListener,ActionListener {
    private JTextArea text;
    private JButton exit,save;
    private JPanel bpanel;
    
    public Notes()
    {
    	init();
    }
    
    private void init()
    {
    	text = new JTextArea();
    	getContentPane().add(text);
    	getContentPane().add(new JScrollPane(text),BorderLayout.CENTER);
    	
    	bpanel = new JPanel(new FlowLayout());
    	save = new JButton("SAVE");
    	save.addActionListener(this);
    	exit = new JButton("EXIT");
    	exit.addActionListener(this);
    	bpanel.add(save,BorderLayout.SOUTH);
    	bpanel.add(exit,BorderLayout.SOUTH);
    	getContentPane().add(bpanel,BorderLayout.SOUTH);
    	
    	setTitle("Notepad");
    	setSize(1000,1000);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	setVisible(true);
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
    
    public static void main(String[] args) {
    	
    	Notes n = new Notes();
    }
    
    public void windowClosing(WindowEvent winevent){}
    public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
}
