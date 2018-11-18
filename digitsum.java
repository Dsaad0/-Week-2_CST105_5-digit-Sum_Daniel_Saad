/* Program:  Assignment 2 Task 1
 * File:     digitsum.java
 * Summary:  Asks user for 5 digit number, validates, and adds sum
 * Author:   Daniel Saad
 * Date:     11/18/2018
*/
//Import Scannel Class
import java.util.Scanner;
//Declare New Java Class
public class digitsum 
{
   public static void main(String []args) 
   {
       //Initiate Scanner Class
      Scanner sc = new Scanner(System.in);
      int digits5;
       //Asks User for 5 Digit Sum
      System.out.println("Hello. Please Enter an integer with up to 5 Digits:");
      //Retrieves number into objevt digits5
      digits5 = sc.nextInt();
      //checks if digit is to large or to small
      if (digits5 <= 99999 && digits5 > 0)
      {
         //intialize integers used
         int power = 1;
         int total = 0;
        //Used to create highest power to seperate first digit.
        while (power <= digits5) 
        {
            power *= 10;
        }
        power /= 10;
        //checking power is not negative. Loop Digits and Add to Total
        while (power > 0) 
            {
            //outputs invididual digit
            System.out.println(digits5/power);
            //adds digit to sum
            total += (digits5/power);
            //seperates next digit with remainder
            digits5 %= power;
            //decreases power by one decimal
            power /= 10;
            }
        System.out.println("Your total is " + total);
      }
        else
        {
          //Outputs Error of number being invalid
          System.out.println("Please enter a valid Integer.");  
        }
           
   }
 }
