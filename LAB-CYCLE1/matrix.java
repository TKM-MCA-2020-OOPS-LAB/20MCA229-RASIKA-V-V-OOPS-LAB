
import java.util.Scanner; 
public class matrix 
{ 
    public static void main(String args[])
    {
    int row, column,i,j;
    Scanner in = new Scanner(System.in); 
    System.out.println("Enter the number of rows:");
    row = in.nextInt(); 
    System.out.println("Enter the number columns:");
    column = in.nextInt();
    int x[][] = new int[row][column];
    int y[][] = new int[row][column];
    int total[][] = new int[row][column];
    System.out.println("Enter the elements of first matrix:"); 
    for ( i= 0 ; i < row ; i++ )
    {  
    for ( j= 0 ; j < column ;j++ )
    x[i][j] = in.nextInt(); 
    System.out.println();
    }
    System.out.println("Enter the elements of second matrix");  
    for ( i= 0 ; i < row ; i++ )
    {   
    for ( j= 0 ; j < column ;j++ )
    y[i][j] = in.nextInt(); 
    System.out.println();
    }
    for ( i= 0 ; i < row ; i++ )
    for ( j= 0 ; j < column ;j++ )
    total[i][j] = x[i][j] + y[i][j] ; 
    System.out.println("Sum of matrices:");  
    for ( i= 0 ; i < row ; i++ )
    { 
    for ( j= 0 ; j < column ;j++ )
    System.out.print(total[i][j]+"\t");  
    System.out.println();
    }  
    }

}


