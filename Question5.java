import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    Scanner in = new Scanner(System.in);
    System.out.print("Enter number of integers to input: ");
    Integer loops = in.nextInt();
    Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
    for(int i=1; i<=loops;i++)
    {
      Scanner in2 = new Scanner(System.in);
      System.out.print("Enter number "+String.valueOf(i)+": ");
      Integer temp = in2.nextInt();
      if(numbers.containsKey(temp))
      {
        numbers.put(temp, numbers.get(temp) + 1);
      }
      else{
        numbers.put(temp, 1);
      }
    }
    int maxcount=0;
    int maxno=0;
    for (int name: numbers.keySet())
    {
      int value = numbers.get(name);
      if(value>maxcount){
        maxno=name;
      }
    }
    if(maxno!=0)
    {
      System.out.println("Mode: " + String.valueOf(maxno));
    }
    else{
      System.out.println("No number entered, mode cant be found");
    }
  }
}
