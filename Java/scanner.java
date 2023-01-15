package Test;

import java.util.Random;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		System.out.println("Please enter your number to find if it will win the lottery... ");
		enterNumber();
	}
		
	public static void enterNumber() {
		
		//Get the user to input a number
		Scanner input = new Scanner(System.in);		
		int number = input.nextInt();		
		
		if (number <= 0) {
			//if the number is 0 or below, enter a new number
			System.out.println("Please enter a number above 0\n");
			enterNumber();
		}else{
			//load phase
			loadRandomPhase(number);			
		}
	}
	
	public static void loadRandomPhase(int number) {
				
		// generate random number from 0 to 3
		Random random = new Random();
		int randomNumber = random.nextInt(4);
		
		//Choose a phase based on the random number
		switch(randomNumber) {
		case 0: 
			//Print phase in console
			System.out.println(number + "?? Maybe\n");
			//allow the user to enter another number
			enterNumber();
			break;
			
		case 1: 
			System.out.println(number + "?? Try again!\n");
			enterNumber();
			break;
		
		case 2: 
			System.out.println(number + "?? Possibly\n");
			enterNumber();
			break;
			
		case 3: 
			System.out.println(number + "?? I don't think so\n");
			enterNumber();
			break;
		}		
	}	
}
