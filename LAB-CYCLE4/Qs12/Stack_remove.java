package Qs12;
import java.util.*;
public class Stack_remove {
    public static void main(String[] args)
     {
        Stack<Integer> st=new Stack<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.print("how many Elements do you want to add: ");
        int num=sc.nextInt();
        for(int i=0;i<num;i++)
        {
            System.out.print("Add element: ");
            int s=sc.nextInt();
            st.add(s);
        }
        System.out.println("Original Stack:"+st);
        System.out.println("Enter the index to be removed:");
		int index = sc.nextInt();
		
		int rm = st.remove(index);
		
		System.out.println("Removed Element is:"+rm);
		
		System.out.println("\nStack after remove:\n"+st);
    }
}
