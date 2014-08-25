package Window;

import javax.swing.JFrame;

public class Window{

	private JFrame frame;
	
	public Window()
	{
		frame = new JFrame("Kill the Marty");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,600);
		frame.setResizable(false);
		frame.setVisible(true);
		
	
	}
}
