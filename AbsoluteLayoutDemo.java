import javax.swing.*;
import java.awt.*;

class AbsoluteLayoutDemo
{

	AbsoluteLayoutDemo()
	{

				JFrame f = new JFrame();
					f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					f.setTitle("My new frame");
					f.setSize(800,600);


					f.setLayout(null);


					JButton b1 = new JButton("North");
					b1.setBounds(100,50,150,50);
					//b1.setBounds(x,y,width,height);


					JButton b2 = new JButton("South");
					b2.setBounds(100,150,150,50);


					JButton b3 = new JButton("East");
					b3.setBounds(100,250,150,50);

					JButton b4 = new JButton("West");
					b4.setBounds(100,350,150,50);

					JButton b5 = new JButton("Center");
					b5.setBounds(100,450,150,50);


			f.add(b1);
			f.add(b2);
			f.add(b3);
			f.add(b4);
			f.add(b5);


	f.setVisible(true);

		}

	public static void main(String[] args)
	{

		AbsoluteLayoutDemo F = new AbsoluteLayoutDemo();

		}

}
