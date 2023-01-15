package Test;
public class LiftOff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		liftOff();
		
		letters("Hello my name is Daniel and I am the best Among us player in the global atmosphere");
	}
	
	public static void liftOff() {
		int countdown = 10;
		
		while(countdown>0) {
			System.out.print(countdown + ",");
			countdown--;
		}
		
		System.out.println("Liftoff!");		
	}
}





