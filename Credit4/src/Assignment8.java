/*
Program: ${Assignment8}.java          Date: ${5/4/2022}
Author: Tarnpreet Chahal
School: CHHS
Course: Computer Science 10
 
*/

import java.util.Scanner;

public class Assignment8 {

public static void main(String[] args) {

@SuppressWarnings("resource")
Scanner userinput = new Scanner(System.in);//Scanner class for keyboard input
		
	System.out.println("Please enter a three digit number: ");//asking user to enter a 3 digit number
	
	int threeDigits = userinput.nextInt();
		
	int firstDigit = threeDigits / 100; // dividing given input by 100 in order to find the first digit
		
	int secondDigit =  (threeDigits % 100)/10; //using modulo to find second digit
		
	int thirdDigit =  (threeDigits % 100)%10; //using double modulo to find third digit

		
		//displaying values
	System.out.println("First Digit : "  + firstDigit);
		
	System.out.println("Second digit : " + secondDigit);
		
	System.out.println("Third digit : " + thirdDigit);
	}

}
/* Screen Dump
Please enter a three digit number: 
321
First Digit : 3
Second digit : 2
Third digit : 1
*/