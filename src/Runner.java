import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		/***
		 * Testing integer division -- truncates! Does NOT round off! % modulus returns
		 * the remainder of a division
		 ****/
		/*
		 * int numberBits = 10; int bite = 8; //spelled wrong to avoid a keyword
		 * conflict int nibble = 4; int byteAnswer = 0, byteRemainder = 0;
		 * 
		 * 
		 * //test out 10 / 8 want 1 remainder 2
		 * 
		 * byteAnswer = numberBits / bite; byteRemainder = numberBits % bite;
		 * 
		 * System.out.println("bits = " + numberBits + " bytes = " + byteAnswer +
		 * " remainder = " + byteRemainder);
		 * 
		 * 
		 * 
		 */
		/*** how to handle mixed case y,Y,yes,Yes,YES... ***/

		Scanner kbd = new Scanner(System.in);
		System.out.println("Hello, enter your answer (Y/N)");
		String answer = kbd.nextLine().toLowerCase();
		System.out.println("You have entered: " + answer);

		// decision time!
		if (answer.equals("y") || answer.equals("yes")) {
			System.out.println("You have selected YES!");

		} else if (answer.equals("n") || answer.equals("no")) {
			System.out.println("You have selected NO!");

		} else {
			System.out.println("I am soo cunfused! what do you want? try again");
		}
		
		
	}
}
