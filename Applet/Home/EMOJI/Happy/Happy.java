import java.applet.*;
import java.awt.*;

public class Happy extends Applet{

	public void paint(Graphics g)
	{
		g.setColor(Color.yellow);
		g.fillOval(100, 100, 200, 220);

		g.setColor(Color.black);
		g.fillOval(140,150, 20,30);

		g.setColor(Color.black);
		g.fillOval(230,150, 20,30);

		g.setColor(new Color(122,22,22));
		g.fillArc(150,200,100,80,180,180);
		g.fillArc(150,200,100,80,0,180);





		g.setColor(Color.yellow);
		g.fillOval(450, 100, 200, 220);
	}
}