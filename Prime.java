package week1.day2;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 44;
		boolean isPrime = true;
		
		for(int i=2; i <= input / 2; i++) {
			
			if(input % i == 0) {
				
				isPrime = false;
				break;
			}
		}
		
		if(isPrime == true) {
		System.out.println(input +" is a Prime number");
		}else {
		System.out.println(input +" is not a Prime number");
		}
	}

}
