/*A useless program to demonstrate java input and output
*/

import java.util.Scanner;
import java.io.IOException;


public class InOut {

  public static void main(String[] args) throws IOException {

      @SuppressWarnings("resource")
	  Scanner scan = new Scanner(System.in);
      int i = scan.nextInt();
      double d = scan.nextDouble();
      scan.nextLine();
      String s = scan.nextLine();
      System.out.println("String: " + s);
      System.out.println("Double: " + d);
      System.out.println("Int: " + i);
  }
  
}
