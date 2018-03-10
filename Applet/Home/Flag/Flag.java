import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Flag extends Applet
{
	AudioClip national;

	public void paint(Graphics g)
	{
		national = getAudioClip(getCodeBase(), "song.wav");

        Color dark_green =new Color(0,128,0);


		g.setColor(dark_green);
		g.fillRect(0+125,0+125,640,384);

		

		g.setColor(Color.red);
		g.fillOval(160+125,64+125,256,256);

		national.play();
	}


}