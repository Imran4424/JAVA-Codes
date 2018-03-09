import java.awt.*; 
import java.applet.*; 
import java.awt.geom.*; 
import java.text.SimpleDateFormat; 
import java.util.Date; 
import java.util.Calendar; 


public class LedApplet extends Applet { 

private long timer;
	
private GradientPaint gradient; 
//the drawings of my digital like numbers in rectangle form 
private Rectangle topRectangle = new Rectangle(23, 10, 66, 20); 
private Rectangle leftTopRectangle = new Rectangle(0, 13, 20, 76); 
private Rectangle leftBottomRectangle = new Rectangle(0, 92, 20, 76); 
private Rectangle bottomRectangle = new Rectangle(23, 151, 66, 20); 
private Rectangle rightBottomRectangle = new Rectangle(92, 92, 20, 76); 
private Rectangle rightTopRectangle = new Rectangle(92, 13, 20, 76); 
private Rectangle midRectangle = new Rectangle(23, 82, 66, 20); 
void displayzero(Graphics2D g2D) 
{ 
g2D.draw(topRectangle); 
g2D.draw(leftTopRectangle); 
g2D.draw(leftBottomRectangle); 
g2D.draw(bottomRectangle); 
g2D.draw(rightTopRectangle); 
g2D.draw(rightBottomRectangle); 
} 
void displayone(Graphics2D g2D) 
{ 
g2D.draw(rightTopRectangle); 
g2D.draw(rightBottomRectangle); 
} 
void displaytwo(Graphics2D g2D) 
{ 
g2D.draw(topRectangle); 
g2D.draw(midRectangle); 
g2D.draw(leftBottomRectangle); 
g2D.draw(bottomRectangle); 
g2D.draw(rightTopRectangle); 
} 
void displaythree(Graphics2D g2D) 
{ 
g2D.draw(topRectangle); 
g2D.draw(midRectangle); 
g2D.draw(bottomRectangle); 
g2D.draw(rightTopRectangle); 
g2D.draw(rightBottomRectangle); 
} 
void displayfour(Graphics2D g2D) 
{ 
g2D.draw(leftTopRectangle); 
g2D.draw(midRectangle); 
g2D.draw(rightTopRectangle); 
g2D.draw(rightBottomRectangle); 
} 
void displayfive(Graphics2D g2D) 
{ 
g2D.draw(topRectangle); 
g2D.draw(leftTopRectangle); 
g2D.draw(midRectangle); 
g2D.draw(bottomRectangle); 
g2D.draw(rightBottomRectangle); 
} 
void displaysix(Graphics2D g2D) 
{ 
g2D.draw(topRectangle); 
g2D.draw(leftTopRectangle); 
g2D.draw(midRectangle); 
g2D.draw(leftBottomRectangle); 
g2D.draw(bottomRectangle); 
g2D.draw(rightBottomRectangle); 
} 
void displayseven(Graphics2D g2D) 
{ 
g2D.draw(topRectangle); 
g2D.draw(rightTopRectangle); 
g2D.draw(rightBottomRectangle); 
} 
void displayeight(Graphics2D g2D) 
{ 
g2D.draw(topRectangle); 
g2D.draw(leftTopRectangle); 
g2D.draw(midRectangle); 
g2D.draw(leftBottomRectangle); 
g2D.draw(bottomRectangle); 
g2D.draw(rightTopRectangle); 
g2D.draw(rightBottomRectangle); 
} 
void displaynine(Graphics2D g2D) 
{ 
g2D.draw(topRectangle); 
g2D.draw(leftTopRectangle); 
g2D.draw(midRectangle); 
g2D.draw(bottomRectangle); 
g2D.draw(rightTopRectangle); 
g2D.draw(rightBottomRectangle); 
} 
public void paint(Graphics g) { 
Graphics2D g2D = (Graphics2D) g; // cast to 2D 


g2D.setBackground(Color.white); 
gradient=new GradientPaint(100,100,Color.blue,100,100,Color.blue);
g2D.setPaint(gradient); 
displayeight(g2D); // draw #8 
} }