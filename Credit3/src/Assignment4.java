import java.util.Scanner;
/*
Program: $(Assignment4).java 		Data: $(4/28/2022)

Author: Tarnpreet Chahal
School: CHHS
Course: Computer Science 10



*/
public class Assignment4 {

	public static void main(String[] args) {
		float x = (float) 0.75;
		float y = (float) 1.00;
		float total = x + y;
		
		Scanner input = new Scanner(System.in); 
		
		System.out.println("What is the diameter(inches) of your pizza?");
		float diameter = input.nextInt();
		
		float diametertotal = (float) (diameter * diameter * 0.05);
		float totalvalue = diametertotal + total;
		System.out.println("Your total is $" + totalvalue);
	}

}
/*Screen Dump
What is the diameter(inches) of your pizza?
5
Your total is $3.0 
*/
