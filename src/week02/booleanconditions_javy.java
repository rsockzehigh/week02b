package week02;
import java.util.*;

public class booleanconditions_javy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner kb = new Scanner(System.in);
		
		//int
		//System.out.println("How old are you");
		//int age = kb.nextInt ();
		//int age = Integer.parseInt(kb.nextLine() );
		//System.out.println("Oh, you are " + age +" years old");
		
		//doubles
		//System.out.println("What is your GPA?");
		//double gpa = kb.nextDouble();
		//double gpa = Double.parseDouble(kb.nextLine());
				
		//System.out.println("Oh, " + gpa +" is very good!");
		
		//strings!!
		//System.out.println("What is your first name");
		//String fn = kb.next();
		//System.out.println("What is your last name");
		//String ln = kb.next();
		//System.out.println("HI " + fn + " "+ln);
		
		//multi word strings
		//System.out.println("what is your address");
		//String addy = kb.nextLine();
		
		//int number = (int)(Math.random() * 10 + 1);
		//modify line 35 to user input. whats user input?
		 //
		//System.out.println("number");
		//System.out.println("Guess my number"); //for testing purposes
		//int guess = 10;// user guessed
		//int (guess = kb.nextInt();
		//if(guess > number)
		//	System.out.println("to High");
	//	else if (guess < number)
		
	//		System.out.println("to low");
	//	else
	//		System.out.println("you got it");
		
		//confirm scanner, if statement, for loops, conditional expressions
		// logical operators and expressions
		
		//example
		//int x = 1;
		//System.out.println(x + 2);
		//however has the value of changed?
		//System.out.println(x);
		//x = x + 1; //the old value of x  + new value of x was mutated it to print 2
		
		//compound operators
		
		//int x1 = 1;
		
		//x1 = x1 + 5; //long hand in math
		//System.out.println( x1 );//6 x+=5 short hand in math
		//x1 = x1 - 5;
		//System.out.println( x1 );//1 x-=5 short hand in math
		//x1 = x1 * 5;
		//System.out.println( x1 );//5 x*=5 short hand in math
		//x1 = x1 / 5;
		//System.out.println( x1 );//1 x/=5 short hand in math
		//x1 = x1 % 5; //modular is equal to remainder short hand in math
		//System.out.println( x1 ); //1 x%= short hand in math
		
		//x2 = 5;
		//System.out.println(++x2); //multi part multi step project and run as a compiler in the backend
		
		//x2++;  add 1 same as c++
		//++x2; 
		
		//boolean or logical operators or conditionals (mainly used for inequalities think of a plot line)
		/*
		 * <
		 * >
		 * <=
		 * >=
		 * ==
		 * !=
		 * !
		 */
		// if statements
		
		/*int coin = (int)(Math.random() * 2);
		int number = 34;;
		int guess = 10;//user guessed
		
		//if you want to test something Heads or Tails or Equal too
		if (coin == 1) {
			System.out.println("to high");
		}
		
		else if  (guess < number) {
			System.out.println("to low");
		}
		else {
			System.out.println("you got it");
		*/
		
		//Loops repeat 1. for loop 2. while loop 3. if statements
		// 4 steps to a for loops
		//initialization step 1 - counter variable to keep track of your loop. for (int j = 0; this is a local variable
		// step 2 conditional expression = j  < 5; have to test against something 
		// step 3 run the code data structures j = a local variable anything made inside the data structure is archaic data structure
		//int  j = 0;
		//for (j = 0; j < 5; j++ ) {
		//	System.out.println("hello");
		
			//break out of the loop j proceed out of the curley bracket
		//System.out.println(j);  this is a global variable. this dont exist it dont know where to go
		// do this int j = 6; then it
		//print out 1 to 100?
		//System.out.print((j + 1) + " "); //Encapsulate j + 1 causes a landscape print 
		
		//for (int j = 0; j < 100; j++ ) {
		//System.out.print((j + 1) + " "); // "" causes it to go on one line
		//for (int j = 0; j < 100; j +=5) {
		//	System.out.print(j + " "); // increments in 5
			
		//for (int j = 0; j <= 100; j++) {
		//		if(j %5 !=0 ) {
		//			continue; //skip everything below and rerun
		//		}
			//	else 
		//			System.out.println(j + " ") ; // this goes through everysingle number
		//		for (int j = 0; j <= 100; j++) {
			//		if(j ==55) {
				//		break; //break is the key word to get out of the loop
				//	}
				//	else 
				//	System.out.println(j + " ") ;
		
		//Scanner kb = new Scanner(System.in);
		
		//int number = (int)(Math.random() * 10 + 1);
		//System.out.println(number); // give the user to guess 5 times!
		//System.out.println("Guess my number. you have 5 tries");
		
				//int guess = kb.nextInt();
		
		//for (int j = 0; j <5; j++) { //for loop here you will have only one guess because outside the loop!!!
			//int guess = kb.nextInt(); // now it will repeat and you can continue guessing!
		//if(guess > number)
		//	System.out.println("to High");
		//else if (guess < number)
	//		System.out.println("to low");
	//	else
		//	System.out.println("you got it");
		//	break;
			
		//while loop 
		//any for loop can be written as a while loop not every while loop can be written as a for loop
		
		//Scanner kb = new Scanner(System.in);
		
	//for(int j = 0; j < 5; j ++) System.out.println("hello");
	//steps are chronological global variables for while loops exception of boolean
	
	//System.out.println(""); //to see the separation
	//int j = 0;
	//while (j <5);{ //step 2 conditional (something about the curley bracket
	//System.out.println("hello"); //suppose to see a break after 5 hellos in the console
	//j++;
	//now to the meat and potatoes
	
		Scanner kb = new Scanner(System.in);
		
	int number = (int)(Math.random() * 10 + 1);
	System.out.println(number); 
	System.out.println("Guess my number. you have UNLIMITED tries");
	
	
	while(true) {
		int guess = kb.nextInt();
		if(guess > number)
		System.out.println("to high guess again");
		else if(guess< number) 
			System.out.println("to low. guess again");
			else{
				System.out.println("you got it");
				break;
				//codingbat code practice
			}
	
		}
	}
}
		
	
	

	


