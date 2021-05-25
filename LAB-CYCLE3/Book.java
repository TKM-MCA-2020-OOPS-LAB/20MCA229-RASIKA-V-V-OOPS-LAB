import java.util.Scanner;

class publisher
{
	String pname;
	Scanner sc=new Scanner(System.in);
	public publisher()
	{
		
		System.out.println("Enter publisher name:");
		pname=sc.next();
	}
}
class books extends publisher
{
	String bname;
	String Author;
	public books()
	{
		System.out.println("Enter book name:");
		bname=sc.next();
		
		System.out.println("Enter Author name:");
		Author=sc.next();
		
		
	}
}
class literature extends books
{
	public literature()
	{
		System.out.println("category:literature");
		System.out.println("--------------------");
	}
	void display()
	{
		System.out.println("publishername:"+pname);
		System.out.println("book name:"+bname);
		System.out.println("Author name:"+Author);
	}
}
class fiction extends books
{
	public fiction()
	{
		System.out.println("category:fiction");
		System.out.println("---------------------");
		System.out.println("\n");
	}
	void display()
	{
		System.out.println("publishername:"+pname);
		System.out.println("book name:"+bname);
		System.out.println("Author name:"+Author);
	}
}
public class Book {
	
	public static void main(String[] args) {
	
		int i,n;
		
		Scanner b=new Scanner(System.in);
		System.out.println("Enter the no of literature books you need to store:");
		n=b.nextInt();
		literature l[]=new literature[n];
		for( i=0;i<n;i++)
		{
			l[i]=new literature();
			
		}
		System.out.println("Enter the no of fictional books you need to store:");
		int m;
		m=b.nextInt();
		fiction f[]=new fiction[m];
		for( i=0;i<m;i++)
		{
			f[i]=new fiction();
			
		}
		
		System.out.println("Displaying literature books:"+"\n------------------------------");
		for(i=0;i<n;i++)
		{
			System.out.println("Displaying details of book no:"+(i+1)+"\n-------");
			l[i].display();
		}
		System.out.println("Displaying fictional books:"+"\n--------------------------------");
		for(i=0;i<m;i++)
		{
			System.out.println("Displaying details of book no:"+(i+1)+"\n-------");
			f[i].display();
		}
	
		
		}
}