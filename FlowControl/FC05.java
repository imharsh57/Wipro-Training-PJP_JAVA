package FlowControl;

import java.util.Scanner;

public class FC05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char item1 = s.next().charAt(0);
		if ((item1 >= 65 && item1 <= 90) || (item1 >= 97 && item1 <= 122)) 
			System.out.println("Alphabet"); 

		else if (item1 >= 48 && item1 <= 57) 
		    System.out.println("Digit"); 

		else
		    System.out.println("Special Character");

	}

}
