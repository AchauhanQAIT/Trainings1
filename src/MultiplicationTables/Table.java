package MultiplicationTables;

import java.util.Scanner;

/**
 *
 * @author qainfotech Abhinav Chauhan
 */
public class Table {
    public static void main(String args[]){
    int num1, num2, c, d;
 
    System.out.println ("Enter numbers for which you need tables");
    Scanner in = new Scanner(System.in);
 
    num1 = in.nextInt();
    num2 = in.nextInt();
 
    for (c = num1; c <= num2; c++) {
      System.out.println("Table of Number"+c);
 
      for (d = 1; d <= 10; d++) {
         System.out.println(c+"*"+d+" = "+(c*d));
      }
    }
}