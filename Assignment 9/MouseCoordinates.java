import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



class MouseGUI extends JFrame implements MouseListener, MouseMotionListener
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

		addMouseMotionListener(this);
	}

	public void mouseEntered(MouseEvent Me)
	{
		
	}
	public void mouseExited(MouseEvent Me)
	{

	}
	public void mousePressed(MouseEvent Me)
	{

	}

	public void mouseReleased(MouseEvent Me)
	{

	}

	public void mouseClicked(MouseEvent Me)
	{

	}

	public void mouseDragged(MouseEvent Me)
	{

	}
	public void mouseMoved(MouseEvent Me)
	{
		float X, Y;

		X = Me.getX();
		Y = Me.getY();


		l3.setText(Float.toString(X));
		l4.setText(Float.toString(Y));
	}

	
}




public class MouseCoordinates
{
	public static void main(String[] args) {
		new MouseGUI();
	}
}