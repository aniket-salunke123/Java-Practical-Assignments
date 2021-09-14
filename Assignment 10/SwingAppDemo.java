import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Board extends JFrame
{
	JPanel boxes[] = new JPanel[16];

	JButton btnUp, btnDown, btnLeft, btnRight;




	Board()
	{
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		setLayout(new GridLayout(4, 4));

		// int toggler = 1;
		for (int i=0; i<16; i++) {
			boxes[i] = new JPanel();
			
			if((i+1)%2 == 0)
			{
				boxes[i].setBackground(Color.BLACK);
				// toggler = 0;
			}
			else
			{
				boxes[i].setBackground(Color.WHITE);
				// toggler = 1;
			}

			add(boxes[i]);
		}
	}

}



public class SwingAppDemo
{
	public static void main(String[] args) {
		new Board();
	}
}