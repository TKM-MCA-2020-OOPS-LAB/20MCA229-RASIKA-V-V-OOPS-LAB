import java.util.Scanner;
class Person
{
	String name,gender,address;
	int age;
	
	public Person()
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Name : ");
		name = sc1.next();
		System.out.println("Enter Age : ");
		age = sc1.nextInt();
		System.out.println("Enter Gender : ");
		gender = sc1.next();
		System.out.println("Enter Address : ");
		address = sc1.next();
		
		
	}
}

class Employee extends Person
{
	int empid,salary;
	String quali,cname;
	
	public Employee()
	{
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Emp_id : ");
		empid = sc2.nextInt();
		System.out.println("Enter Salary : ");
		salary = sc2.nextInt();
		System.out.println("Enter Qualification : ");
		quali = sc2.next();
		System.out.println("Enter Company Name : ");
		cname = sc2.next();
		
	}
}

class Teacher extends Employee
{
	String sub,dept;
	int teacher_id;
	
	public Teacher()
	{
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Enter Teacher_id : ");
		teacher_id = sc3.nextInt();
		System.out.println("Enter Subject: ");
		sub = sc3.next();
		System.out.println("Enter Department : ");
		dept = sc3.next();
		
	}
	
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
		System.out.println("Address : "+address);
		System.out.println("Emp id : "+empid);
		System.out.println("salary : "+salary);
		System.out.println("Qualification : "+quali);
		System.out.println("Company Name : "+cname);
		System.out.println("Teacher id : "+teacher_id);
		System.out.println("Subject : "+sub);
		System.out.println("Department : "+dept);
		
		
	}
}

public class Multilevel_inheritance {

	public static void main(String args[])
	{
		int n;
		
		Scanner sc4 = new Scanner(System.in);
		System.out.println("Enter number of teachers : ");
		n = sc4.nextInt();
		
		Teacher[] obj = new Teacher[n];
		
		for(int i=0;i<n;i++)
		{
			obj[i] = new Teacher();
		}
		
		 for(int i=0;i<n;i++)
		    {
		    	System.out.println("\nDetails of Employee  No : " + (i+1));
		    	obj[i].display();
		    }
		
		
	}
}