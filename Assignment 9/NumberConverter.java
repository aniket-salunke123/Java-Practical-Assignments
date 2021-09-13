import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Converter extends JFrame implements ActionListener
{
	JLabel lblDec, lblBin, lblOct, lblHex, lblResBin, lblResOct, lblResHex;
	JTextField inputDec;
	JButton btnConvert, btnExit;

	Converter()
	{
		lblDec = new JLabel("Decimal");
		lblBin = new JLabel("Binary");
		lblOct = new JLabel("Octal");
		lblHex = new JLabel("Hexadecimal");

		lblResHex = new JLabel("Result in Hexadecimal");
		lblResBin = new JLabel("Result in Binary");
		lblResOct = new JLabel("Result in Octal");

		inputDec = new JTextField();

		btnConvert = new JButton("Convert");
		btnExit = new JButton("Exit");

		setSize(800, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new GridLayout(5, 2));


		// adding components to the frame
		add(lblDec);
		add(inputDec);
		add(lblBin);
		add(lblResBin);
		add(lblOct);
		add(lblResOct);
		add(lblHex);
		add(lblResHex);
		add(btnConvert);
		add(btnExit);

		btnConvert.addActionListener(this);
		btnExit.addActionListener(this);
	}

	public void actionPerformed(ActionEvent Ae)
	{
		if(Ae.getSource() == btnExit)
		{
			System.exit(0);
		}
		else
		{
			int n = Integer.parseInt(inputDec.getText());
			lblResBin.setText(Integer.toBinaryString(n));
			lblResOct.setText(Integer.toOctalString(n));
			lblResHex.setText(Integer.toHexString(n));
		}
	}


}



public class NumberConverter
{
	public static void main(String[] args) {
		new Converter();
	}
}