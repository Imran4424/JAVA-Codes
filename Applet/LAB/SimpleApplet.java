import java.applet.*;
import java.awt.*;

/*<applet code="SimpleApplet" width=400 height=400>
</applet>*/


public class SimpleApplet extends Applet  {

	public void paint(Graphics g)
	{
		g.setColor(new Color(0,155,0));
		g.fillRect(100, 100, 200, 120);

		g.setColor(Color.red);
		g.fillOval(150, 120, 80, 80);

		g.setColor(Color.black);
		g.setFont(new Font("Vrinda",Font.PLAIN, 20));
		g.drawString("Bangladesh", 150, 250);


        // g.draw3dRect(100,100,50,50, true);



	}
}