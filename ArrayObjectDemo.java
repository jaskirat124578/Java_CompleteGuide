import java.util.Scanner;

class Student
{

	int roll;
	String name;
	float mks;


	void getdata()
	{

		Scanner S = new Scanner(System.in);

		System.out.print("\n\n\tEnter Roll : ");
		roll= Integer.parseInt ( S.nextLine()  ) ;

		System.out.print("\n\n\tEnter Name : ");
		name= S.nextLine() ;

		System.out.print("\n\n\tEnter Marks : ");
		mks= Float.parseFloat ( S.nextLine()  ) ;

	}

	void putdata()
	{
		System.out.print("\n\n\tRoll : " + roll);
		System.out.print("\n\n\tName : " + name);
		System.out.print("\n\n\tMarks : " + mks);
	}
}



class ArrayObjectDemo
{
	public static void main(String[] args)
	{

					Student[] stu = new Student[3];

					for(int i=0;i<3;i++)
						stu[i] = new Student();


					for(int i=0;i<3;i++)
						stu[i].getdata();

					for(int i=0;i<3;i++)
						stu[i].putdata();


		}

	}
