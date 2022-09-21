package java2909;


import java.util.Scanner;
public class LeapYear {
   public static void main(String[] args) {
      int my_input;
      boolean isLeap = false;
      System.out.println("Required packages have been imported");
      Scanner my_scanner = new Scanner(System.in);
      System.out.println("A reader object has been defined ");
      System.out.print("Enter the year : ");
      my_input = my_scanner.nextInt();
      if (my_input % 4 == 0) {
         if (my_input % 100 == 0) {
            if (my_input % 400 == 0)
               isLeap = true;
            else
               isLeap = false;
         }
         else
            isLeap = true;
      }
      else
         isLeap = false;
      if (isLeap)
         System.out.println(my_input + " is a Leap year");
      else
         System.out.println(my_input + " is not a Leap year");
   }
}