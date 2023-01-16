package Test;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		
		findNumber();
	}
	
	
	public static void findNumber() {
		
		System.out.println("Enter a number to check if its a prime number");
		Scanner input = new Scanner(System.in);		
		int num = input.nextInt();		
		
		
		
		float num2 = num-1;
		float numDiv;
		int intDiv;

		while(num2 > 1) {
			numDiv = num/num2;
			intDiv = Math.round(numDiv);
			
				if(numDiv == intDiv) {
					System.out.println("Not a prime number\n");
					num2 = 0;
					findNumber();
				}else {
					num2--;
					if(num2 <=1) {
						System.out.println("prime number!!!\n");
						findNumber();
					}				
				}
			
		}		
	}	
	
	public static void enterNumber() {
		
	}
}
