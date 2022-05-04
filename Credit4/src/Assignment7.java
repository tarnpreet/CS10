/*
Program: ${Assignment7}.java          Date: ${5/4/2022}
Author: Tarnpreet Chahal
School: CHHS
Course: Computer Science 10
 
*/
import java.util.Scanner;

public class Assignment7 {

	public static void main(String[] args) 
	{
	@SuppressWarnings("resource")
	Scanner userinput = new Scanner(System.in); //Scanner class for keyboard input
		
	System.out.println("Enter the amount of change in cents: ");//asking user to input value
	
	int change = userinput.nextInt();
		
	int quarters = change / 25; //dividing input value by the value of a quarter
		
	int dimes =  ((change % 25)/10); // using modulo to find the total amount in dimes
		
	int nickels = ((change % 25)%10)/5;//  using modulo to find the total amount in nickels
		
	int pennys = ((change % 25)%10)%5/1 ;//  using modulo to find the total amount in pennys
	
	// displaying values
		
	System.out.println("Change provided : "  + change );
		
	System.out.println("Quarters : " + quarters);
		
	System.out.println("Dimes : " + dimes);
		
	System.out.println("Nickels : " + nickels);
		
	System.out.println("Pennys : " + pennys);
	
	}

}

/* Screen Dump
Enter the amount of change in cents: 
142
Change provided : 142
Quarters : 5
Dimes : 1
Nickels : 1
Pennys : 2

*/