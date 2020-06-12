import java.util.Scanner;
public class Calculator {
	public static void main (String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter your first number: ");
		double numberOne = input.nextInt();
		input.nextLine();
		
		System.out.println("Please enter your second number: ");
		double numberTwo = input.nextInt();
		input.nextLine();
		
		System.out.println("Please choose an option: ");
		System.out.println("1. + \n2. - \n3. * \n4. /");
		
		String userChoice = input.nextLine();
		
		switch(userChoice) {
		
		case "+":
			double answer = numberOne + numberTwo;
			System.out.println(answer);
			break;
			
		case "-":
			answer = numberOne - numberTwo;
			System.out.println(answer);
			break;
			
		case "*":
			answer = numberOne * numberTwo;
			System.out.println(answer);
			break;
			
		case "/":
			answer = numberOne / numberTwo;
			System.out.println(answer);
			break;
			
			default:
				System.out.println("Please select a valid option");
		}
		input.close();
	}
}
