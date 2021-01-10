import java.util.Scanner;
public class Main{
  public static void main(String [] args) {
    Scanner in = new Scanner(System.in);
    while (true) {
      System.out.print("Please enter a number: ");
      int start = in.nextInt();
      System.out.print("Please enter another number: ");
      int end = in.nextInt();
      int sum = 0;
      for (int i = start; i <= end; i++){
        sum += i;
      }
      System.out.println("The sum of the numbers between: " + start + " and: " + end + " = " + sum);
      System.out.println();
    }  
  }
}