import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereadwrite {
	 public static void main(String[] args) {

	  try {
          FileWriter writer = new FileWriter("D:\\Sample\\newfile",true);
          writer.write("Hello Welcome\n");
          writer.close();
          FileReader reader = new FileReader("D:\\Sample\\newfile");
          BufferedReader b= new BufferedReader(reader);
          String line;
          System.out.println("\n Data Read From The New File \n");
          while ((line = b.readLine()) != null) {
              System.out.println(line);
          }
          reader.close();

      } catch (IOException e) {
          System.out.println("\n Error Occured...");
      }

  }


}
