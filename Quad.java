/*
Key-in
Programmer:  Lori Hunt
Program:  Quad
Purpose:  showing off all of the great skills you learned in semester 1


*/

import java.util.Scanner;
import javax.swing.*;
public class Quad 
{
	
	public static void main(String[] args) 
	{
		
			int num1=0,num2=0,num3=0;
			String result = "";
			double determinant, denominator, ans1=0, ans2=0;
		
	
			String nums = JOptionPane.showInputDialog(null,"Enter Coefficients to the quadratic equation (separate by spaces): ");
   	
			while(!nums.equals("q"))
			{
				Scanner numIn = new Scanner(nums);
	
				try{
			 		num1 = Integer.parseInt(numIn.next());
			 		num2 = Integer.parseInt(numIn.next());
			 		num3 = Integer.parseInt(numIn.next());	
				
					}
		//process improperly formatted input.  This error will be displayed
		// if the user puts in a letter or decimal number	
				catch(NumberFormatException numberFormatException)
				{
				
				JOptionPane.showMessageDialog(null, "You must enter 3 integers!!", "INVALID FORMAT", JOptionPane.ERROR_MESSAGE);
				}
	
				determinant = num2*num2 - 4*num1*num3;
				denominator = 2*num1;
	
				try
				{
					if(num1 == 0) ans1 = 5/0;
					if(determinant == 0)
					{
						ans1 = Math.sqrt(determinant)/denominator;
						result = "One solution: " + ans1;
					}
					else if(determinant >0)
						{
							ans1 = (-num2 + Math.sqrt(determinant))/denominator;
							ans2 = (-num2 - Math.sqrt(determinant))/denominator;
							result = "Two Real solutions:  " + ans1 + " and " + ans2;
						}
					else
						{
							determinant = (num2*num2 +4*num1*num3);
							result = -num2 +"+/-"+Math.sqrt(determinant) + "i";
						}
				}// end of 'try'
		// Process attempts to divide by zero
				catch(ArithmeticException arithmeticException)
				{
					JOptionPane.showMessageDialog(null, "This is linear!", "INVALID FORMAT", JOptionPane.ERROR_MESSAGE);
						
				}
		
		 	JOptionPane.showMessageDialog(null, result);	
			nums = JOptionPane.showInputDialog(null,"Enter Coefficients to the quadratic equation (separate by spaces): ");
  		}// end while loop

	}// end main 
}// end class

/*
Try answering these without running it first and then run it to check to see 
if you were right!
1.  What type of data is expected for the coefficients?
 
2.   What happens if you enter a 0 for number 2?  Can you fix that?

3.  What happens if the user accidentally enters an 'a' for number 3?

4.  What happens if the user enters a 'q' alone?

5.  What happens if the user enters a 'q' with 2 numbers? 

6.  What happens if you do not initialize num1, num2, or num3?

7.  How could you improve this program?
 


*/