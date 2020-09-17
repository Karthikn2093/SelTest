package week1.day2;

public class SwitchOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10, b =5;
		String input = "Sub";
		
		switch(input) {
		
		case "Add":
			
			System.out.println(a+b);
			break;
		
		case "Sub":
		
			System.out.println(a-b);
			break;
		
		case "Mul":
		
			System.out.println(a*b);
			break;
		}
		
		
		
	}

}
