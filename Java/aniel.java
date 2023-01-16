package Test;

public class aniel {

	public static void main(String[] args) {
		
		int prime =0;
		int num =0;
		int max = 1000000;
		
		for (prime = 1; prime <= max; prime++)
		{
			int counter=0;
			for(num =prime; num>=1; num--){ 
				
				if(prime%num==0){
					counter++;
				}
				num--;
				if(counter>2) {
					break;
				}
			}
			
			if (counter == 2){
				System.out.println(prime);
			}
			prime++;
		}
		
	}
	
	
}


