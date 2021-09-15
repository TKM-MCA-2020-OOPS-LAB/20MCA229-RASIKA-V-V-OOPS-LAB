import java.io.*;  
import java.util.*;  
 public class Filecopy {  
 public static void main(String arg[]) throws Exception {  
  Scanner sc = new Scanner(System.in);  
  System.out.print("Enter file1 :");  
  String f1 = sc.next();  
  System.out.print("Enter file2 :");  
  String f2 = sc.next();  
  sc.close();
  FileReader fr = new FileReader(f1);  
  FileWriter fw = new FileWriter(f2, true);  
  int c;  
  while ((c = fr.read()) != -1) {  
   fw.write(c);  
  }  
  System.out.println("File1 copied to file2"); 
  fr.close();  
  fw.close();  
 }  
}  