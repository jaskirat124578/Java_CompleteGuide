import javax.swing.*;
import java.awt.*;

class FlowLayoutDemo
{

	FlowLayoutDemo()
	{

				JFrame f = new JFrame();
					f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					f.setTitle("My new frame");
					f.setSize(800,600);


					f.setLayout(new FlowLayout(FlowLayout.CENTER,50,100));


					JButton b1 = new JButton("North");
					JButton b2 = new JButton("South");
					JButton b3 = new JButton("East");
					JButton b4 = new JButton("West");
					JButton b5 = new JButton("Center");


			f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(b4);
			f.add(b5);


	f.setVisible(true);

		}

	public static void main(String[] args)
	{

		FlowLayoutDemo F = new FlowLayoutDemo();

		}

}
