/*
Program: ${Assignment9}.java          Date: ${5/4/2022}
Author: Tarnpreet Chahal
School: CHHS
Course: Computer Science 10
 
*/


import java.util.Scanner;

public class Assignment9 {

public static void main(String[] args) {
	Scanner userinput = new Scanner(System.in);//Scanner class for keyboard input
	System.out.println("Please enter an integer: "); //asking user to enter an integer
	int number = userinput.nextInt();//stores information
	System.out.println("Please enter another integer: ");//asking user to enter another integer
	int numbertwo = userinput.nextInt(); //stores information
		
	System.out.println(" "); //spacing

		
	System.out.println(number + "/" + numbertwo + " = " + (number / numbertwo));//	division  
	System.out.println(number + "%" + numbertwo + "=" + (number % numbertwo));// remainder 

	System.out.println(" ");//spacing


	System.out.println(numbertwo + "/" + number + " = " + (numbertwo / number));// division 
	System.out.println(numbertwo + "%" + number + "=" + (numbertwo % number));// remainder 


	}

}



/* Screen Dump

Please enter an integer: 
1243
Please enter another integer: 
23
 
1243/23 = 54
1243%23=1
 
23/1243 = 0
23%1243=23

*/