package CollegeProject;

import java.util.Scanner;

public class Student 
{
	String name;
	int rollno;
	int []marks=new int[5];
	Scanner sc=new Scanner(System.in);
	public Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
		m1();
	}
	public void m1()
	{
		for(int i=0;i<=4;i++)
		{
			boolean b = false;
			while(!b){
				System.err.println("enter the marks of subject"+i);

				marks[i]=sc.nextInt();
				b = (marks[i]>0)&&(marks[i]<100);


			}
		}
	}

}
