package Test;
import java.util.Scanner;

public class AutoPrimeNumberGenerator {

	public static void main(String[] args) {
		
		findNumber();
	}
	
	public static void findNumber() {
		
		//Ask the user how many primme numbers they want to find
		System.out.println("How many prime numbers do you want to find");
		Scanner input = new Scanner(System.in);	
		int amount = input.nextInt();		
		
		//Ask the user if they want to see all prime numbers up tpo that amount
		Scanner in = new Scanner(System.in);
		System.out.println("Do you want to show all prime numbers up to that? ('yes' or 'no') ");
		String showAll = in.next();
		
		//Values
		float num = 3;
		float num2 = (num+1)/2;
		float numDiv;
		int intDiv;	
		int value = 2;
		
		
		while(amount > 1) {
		//Run this until the amount of prime numbers has been found
			numDiv = num/num2;
			intDiv = Math.round(numDiv);
			
			if(numDiv == intDiv) {
				//System.out.println(num + " is not a prime number");
				num++;
				num2 = (num+1)/2;
				
			}else {
				num2--;
				if(num2 <=1) {
					if(showAll.equals("yes")){
						System.out.println(num + " is the " + value + "th prime number");						
					}else if(amount == 2) {
						System.out.println(num + " is the " + value + "th prime number\n\n");						
					}
					num+=2;
					num2 = (num+1)/2;
					amount--;
					value++;
				}				
			}
			
			if(amount <=1) {
				findNumber();
			}
		}		
	}

}
