import java.awt.*;
import java.awt.event.*;

class AwtControlDemo{
	private Frame mainframe;
	private Label header_label,status_label;
	private Panel control_panel;

	public AwtControlDemo()
	{
		initGUI();
	}

	public static void main(String[] args) {
		AwtControlDemo obj = new AwtControlDemo();
		obj.show();
	}

	private void initGUI()
	{
		mainframe = new Frame("Java AWT Examples 1");
		mainframe.setSize(1000,1000);
		mainframe.setLayout(new GridLayout(3,1));
		mainframe.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent windowevent)
			{
				System.exit(0);
			}

		});

		header_label = new Label();
		header_label.setAlignment(Label.CENTER);
		status_label = new Label();
		status_label.setAlignment(Label.CENTER);
		status_label.setSize(300,200);

		control_panel = new Panel();
		control_panel.setLayout(new FlowLayout());

		mainframe.add(header_label);
		mainframe.add(status_label);
		mainframe.add(control_panel);
		mainframe.setVisible(true);
		
	}

	private void show()
	{
		header_label.setText("Control in Action: Label");

		Label label = new Label();
		label.setText("that is awesome");
		label.setAlignment(Label.CENTER);
		label.setBackground(Color.GRAY);
		label.setForeground(Color.WHITE);
		control_panel.add(label);

		mainframe.setVisible(true);
	}


}