import java.util.Scanner;

class Employee
{
	int empid,salary;
	String name,address;
	public Employee()
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println(" Enter employee id : ");
		empid = sc1.nextInt();
		System.out.println("Enter name : ");
		name = sc1.next();
		System.out.println("Enter salary : ");
		salary = sc1.nextInt();
		System.out.println("Enter address : ");
		address = sc1.next();
			
	}
}

class Teacher extends Employee
{
	String dept,sub;
	public Teacher()
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Department : ");
		dept = sc1.next();
		System.out.println("Enter Subject : ");
		sub = sc1.next();
	}
	
	public void display()
	{
		System.out.println("Emp id : " + empid);
		System.out.println("Name : " + name);
		System.out.println("Address: " + address);
		System.out.println("Salary : " + salary);
		System.out.println("Department : " + dept);
		System.out.println("Subject : " + sub);
		
	}
}

public class Singleinheritance
{
	public static void main(String [] args)
	{
		int n;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter no of teachers : ");
		
		n = sc2.nextInt();
		Teacher obj[] = new Teacher[n];
		
		for(int i=0;i<n;i++)
		{
			obj[i] = new Teacher();
			
		}
		
		 
	    for(int i=0;i<n;i++)
	    {
	    	System.out.println("\nDetails of Employee no : " + (i+1));
	    	obj[i].display();
	    }
		
	}
}