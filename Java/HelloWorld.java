package Test;

public class HelloWorld {

	
	
	public static void main(String[] args) {
		//looooops();
		
		arrrrraaaaayyyy();
	}
	
	
	public static void arrrrraaaaayyyy() {
		int[] numbers = {1,2,3,4};
		
		for(int i =0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		int[] listNum = new int[9];
		for(int i=0; i<listNum.length; i++) {
			
			listNum[i] = i;
			System.out.println(listNum[i]);
		}
		
	}
	
	public static void looooops() {
		int num = 2;
		
		while(num <= 10) {
			System.out.println(num);
			num ++;
		}
		
		//for(create variable; condition; increment
		for(int i = 0; i<= 10; i++) {
			System.out.println(i);
		}
		
		
		
	}
		
	public static void helloWorld() {
		
		System.out.println("Hello World"); // sysout
		System.out.println("Hi guys");
		System.out.println("\n \t this makes a new line\n\n");
		
		int mynum = 1;
		int mynum2 = 3;
		
		if(mynum>mynum2) {
			System.out.println(mynum + " is greater than" + mynum2);
		}else if(mynum == mynum2){
			System.out.println(mynum + " is equal to " + mynum2);
		}else{
			System.out.println(mynum + " is not greater than " + mynum2);			
		}
	}
	

}
