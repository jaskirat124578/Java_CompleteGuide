import javax.swing.*;
import java.awt.*;

class BorderLayoutDemo
{

	BorderLayoutDemo()
	{
d
				JFrame f = new JFrame();
					f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					f.setTitle("My new frame");
					f.setSize(800,600);


					JButton b1 = new JButton("North");
					JButton b2 = new JButton("South");
					JButton b3 = new JButton("East");
					JButton b4 = new JButton("West");
					JButton b5 = new JButton("Center");


			f.add(b1,BorderLayout.NORTH);
			f.add(b2,BorderLayout.SOUTH);
			f.add(b3,BorderLayout.EAST);
			f.add(b4,BorderLayout.WEST);
			f.add(b5,BorderLayout.CENTER);


	f.setVisible(true);

		}

	public static void main(String[] args)
	{

		BorderLayoutDemo F = new BorderLayoutDemo();

		}

}
