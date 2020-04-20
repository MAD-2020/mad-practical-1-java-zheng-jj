import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter height: ");
    double height = in.nextDouble();
    Scanner in2 = new Scanner(System.in);
    System.out.print("Enter weight: ");
    double weight = in2.nextDouble();
    in.close();
    in2.close();
    System.out.println("Height: "+String.valueOf(height)+", Weight: "+ String.valueOf(weight));
  }
}
