package Qs3;
import java.util.Scanner;

class UserAuthException extends Exception {
		
	private static final long serialVersionUID = 1L;

    UserAuthException(String s){
        super(s);
    }

}

public class User_validation {

    public static void main(String[] args) {
         String uname, pword,username, password;
         
            Scanner sc = new Scanner(System.in);
            System.out.print("Please Enter username and password. . ");
            System.out.print("\nENTER USERNAME:");
            uname = sc.nextLine();
            System.out.print("ENTER PASSWORD:");
            pword = sc.nextLine();
            System.out.print("\nYou are successfully registered!! Please login to continue. .");
            System.out.print("\nENTER USERNAME:");
            username = sc.nextLine();
            System.out.print("ENTER PASSWORD:");
            password = sc.nextLine();
            sc.close();
            try
            {
               validation(uname,pword,username,password);
                }catch(Exception e)
                  {
                       System.out.println("Exception Occurred. . "+e);
                  }
        

    }
    
    public static void validation(String name, String pwd, String u, String p) throws UserAuthException{
        
         if((u=="") || (p=="")) {
             throw new UserAuthException("Fields cannot be empty!");
         }
         else if(u.equals(name) && p.equals(pwd)){
             System.out.println("Login Successful!");
         }
         else if((u!=name) || (p!=pwd)) {
             throw new UserAuthException("Login Failed!! Please recheck!");
         }
         else {
             System.exit(0);
         }

}

}
