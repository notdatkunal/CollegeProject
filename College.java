package CollegeProject;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class College
{
	List l=new ArrayList();
	Student s;
	static Scanner sc=new Scanner(System.in);
	void addStudent()
	{
		if(l.size()<3)
		{
			System.out.println("enter name");
			String name=sc.next();
			System.out.println("enter rollno");
			int rollno=sc.nextInt();
			 s=new Student(name,rollno);
			if(marks(s.marks))
			{
				 l.add(s);
				 System.err.println("studetn is added");
			}
			else
			{
				System.out.println("student admission is cancelled");
			}
			 
			
			
		}
		else
		{
			System.err.println("admission is closed please wait for u r next slot");
		}
	}
	void removeStudent()
	{

		System.out.println("enter roll number ");
		int i = sc.nextInt();
		for (int j = 0; j < l.size(); j++) {
			Student s =(Student) l.get(j);
			if(s.rollno==i){
				l.remove(j);
				System.out.println("account is removed");
				return;
			}
		}
		System.out.println("roll number does not exist");
		
	}
	public void display()
	{

		System.out.println("enter roll number ");
		int i = sc.nextInt();
		for (int j = 0; j < l.size(); j++) {
			Student s =(Student) l.get(j);
			if(s.rollno==i){

				System.out.printf("name %s %n",s.name);
				System.out.printf("roll no: %d %n",s.rollno);
				System.out.printf("marks : %d %n",s.marks[0]);
				System.out.printf("marks : %d %n",s.marks[1]);
				System.out.printf("marks : %d %n",s.marks[2]);
				System.out.printf("marks : %d %n",s.marks[3]);
				System.out.printf("marks : %d %n",s.marks[4]);
				return;
			}
		}
		System.out.println("roll number does not exist");
	}
	public boolean marks(int[]a)
	{
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=35)
				c++;
		}
		if(c==5)
			return true;
		else
			return false;
	}
	public static void main(String[]args)
	{
		College c=new College();
		for(;;)
		{
			System.out.println("1.add student  2. remove student 3. display student 10.exit");
			switch(sc.nextInt())
			{
			case 1:
				c.addStudent();
				break;
			case 2: c.removeStudent();break;
			case 3: c.display(); break;
			case 10:
				System.out.println("application is closed");
				System.exit(0);
				
			}
			
		}
	}

}
