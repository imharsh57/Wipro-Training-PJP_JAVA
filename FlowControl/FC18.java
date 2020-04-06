package FlowControl;

import java.util.Scanner;

public class FC18 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);  
        int num = in.nextInt();
		int reversed = 0, remainder, original;

        original = num;

        // reversed integer is stored in variable 
        while( num != 0 )
        {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num  /= 10;
        }

        if (original == reversed)
            System.out.println(original + " is a palindrome.");
        else
            System.out.println(original + " is not a palindrome.");

	}

}
