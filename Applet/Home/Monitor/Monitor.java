import java.applet.*;
import java.awt.*;

public class Monitor extends Applet{

	public void paint(Graphics g){

		g.setColor(Color.black);
		g.fillRect(100,100,250,150);

		g.setColor(Color.blue);
		g.fillRect(125,112,200,120);

		g.setColor(Color.black);
		g.fillRect(205,250,40,40);
		
		g.setColor(Color.black);
		g.fillOval(168, 265, 110, 45);

		
	}
}
