/*
Program: ${Assignment6}.java          Date: ${5/4/2022}
Author: Tarnpreet Chahal
School: CHHS
Course: Computer Science 10
 
*/
import java.util.Scanner;

public class Assignment6 {


	public static void main(String[] args) {

		
	
@SuppressWarnings("resource")
Scanner input = new Scanner(System.in); //Scanner class for keyboard input

System.out.println("What is your first name?");//asking for users first name
String name = input.next(); // store presented first name into variable

System.out.println("What is your last name?");//asking for users last name
String lname = input.next();// store presented last name into variable
lname += input.nextLine();//  used as a space between two questions

System.out.println("What grade are you in? ");//prompting user to input value
int grade = input.nextInt();// store presented grade into variable (int)

System.out.println("What school do you attend?");//prompting user to input value
String school = input.nextLine();// store presented school into a variable
school += input.nextLine();//  used as a space between two questions

System.out.println("What is your favorite hobby?");//prompting user to input value
String hobby = input.next();// store presented hobby into a variable
hobby += input.nextLine();//  used as a space between two questions


	
System.out.println("Your name is " + name + " " + lname + ", you are currently in grade " + grade + " at " + school + ", your favorite hobby is " + hobby + "."); //Displaying all values



}
	
	
}
	
/* Screen Dump
Your name is Leo Thein Maung, 
you are currently in grade 10 at Crescent Heights High School, 
your favorite hobby is Playing basketball with friends.
*/