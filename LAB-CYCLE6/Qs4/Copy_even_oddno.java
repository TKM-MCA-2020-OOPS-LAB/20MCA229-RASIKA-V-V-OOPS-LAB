import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Copy_even_oddno {

	public static void main(String args[]) throws IOException
	{ 
    FileInputStream fr = new FileInputStream("C:\\Users\\USER\\Desktop\\OOPS-LAB\\LAB-CYCLE6\\Qs4\\integers.txt");
    FileOutputStream fw1 = new FileOutputStream("C:\\Users\\USER\\Desktop\\OOPS-LAB\\LAB-CYCLE6\\Qs4\\even.txt");
    FileOutputStream fw2 = new FileOutputStream("C:\\Users\\USER\\Desktop\\OOPS-LAB\\LAB-CYCLE6\\Qs4\\odd.txt");
    System.out.println("\nFrom the file 'integers.txt' ,Odd Numbers are copied to 'odd.txt'file and Even numbers are copied to 'even.txt' file\n"); 
    int i;
    while((i=fr.read()) != -1) 
   	  
    {
     if(i%2==0)
     fw1.write(i);
     else
     fw2.write(i);
    }
    
    fr.close();
    fw1.close();
    fw2.close();
    
}
}