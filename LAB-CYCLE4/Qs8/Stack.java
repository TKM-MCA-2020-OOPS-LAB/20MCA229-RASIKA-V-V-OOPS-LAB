package Qs8;
import java.util.Scanner;
class Stackop {
int a[] = new int[20];
int top=-1,ch,item,i;
Scanner sc = new Scanner(System.in);
public void stackoperation()
{
	System.out.println("Enter the size of the array : ");
	int n=sc.nextInt();
do
{
System.out.println("\nCHOICES : "+"\n"+"---------------------");
System.out.println("\n" + "1.PUSH"+"\n" + "2.POP" + "\n" + "3.DISPLAY" + "\n" + "4.Exit");
System.out.println("\n Enter your choice : ");
ch=sc.nextInt();
switch(ch)
{
case 1: if(top >=n-1)
        {
		System.out.println("STACK OVERFLOW");
        }
        else
        {
        System.out.println("Enter the element :");
        item =sc.nextInt();
        top=top+1;
        a[top]=item;
        }
        break;
case 2 : if(top<0)
         {
		 System.out.println("STACK UNDERFLOW");
         }
         else
         {
         a[top]='\0';
         top=top-1;
         }
         break;
case 3:
        if(top < 0)
        {
        System.out.println("STACK IS EMPTY");
        }
        else
        {
        System.out.println("\nSTACK"+"\n"+"----------------");
        for(i=top;i>=0;i--)
        {
        System.out.println(a[i]);
        }
        }
        break;

case 4 : return;
default : System.out.println("\n Invalid choice");
}
}
while(ch!=4);
}
}

class Stack
{

public static void main(String[] args)
{
	Stackop s =new Stackop();
	s.stackoperation();
}
}