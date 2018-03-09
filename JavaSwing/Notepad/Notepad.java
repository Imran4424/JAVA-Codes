import java.swing.JFrame;


class Notepad extends JFrame{

	JTextArea mainarea;

	public Notepad() {
		initComponent();
	}

	private void initComponent()
	{
		mainarea = new JTextArea();
		getcontentPane().add(mainarea);
		getcontentPane().add(new JScrollPane(mainarea),BorderLayout.center);
		setTitle("Notes");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
	}
}