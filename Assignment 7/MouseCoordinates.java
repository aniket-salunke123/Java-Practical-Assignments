import java.awt.*;
import javax.swing.*;



class MouseGUI extends JFrame
{
	JLabel l1, l2, l3, l4;

	MouseGUI()
	{
		l1 = new JLabel("Mouse X");
		l2 = new JLabel("Mouse Y");

		l3 = new JLabel("Mouse X Coordinate");
		l4 = new JLabel("Mouse Y Coordinate");

		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		setLayout(new GridLayout(2, 2));

		add(l1);
		add(l3);
		add(l2);
		add(l4);
	}
}




public class MouseCoordinates
{
	public static void main(String[] args) {
		new MouseGUI();
	}
}