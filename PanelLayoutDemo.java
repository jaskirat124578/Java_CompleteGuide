import javax.swing.*;
import java.awt.*;

class PanelLayoutDemo
{

	PanelLayoutDemo()
	{

				JFrame f = new JFrame();
					f.setLayout(new GridLayout(1,2));
					f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					f.setTitle("My new frame");
					f.setSize(800,600);


					JPanel p1 = new JPanel();
							JButton b0 = new JButton("Center1");
							JButton b1 = new JButton("North1");
							JButton b2 = new JButton("South1");
							JButton b3 = new JButton("East1");
							JButton b4 = new JButton("West1");
					p1.add(b0);
					p1.add(b1);
					p1.add(b2);
					p1.add(b3);
					p1.add(b4);

					JPanel p2 = new JPanel();
					p2.setLayout(new GridLayout(3,2));
							JButton b5 = new JButton("Center2");
							JButton b6 = new JButton("North2");
							JButton b7 = new JButton("South2");
							JButton b8 = new JButton("East2");
							JButton b9 = new JButton("West2");
					p2.add(b5);
					p2.add(b6);
					p2.add(b7);
					p2.add(b8);
					p2.add(b9);


			f.add(p1);
			f.add(p2);


	f.setVisible(true);

		}

	public static void main(String[] args)
	{

		PanelLayoutDemo F = new PanelLayoutDemo();

		}

}
