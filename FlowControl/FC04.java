package FlowControl;

import java.util.Scanner;

public class FC04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char item1 = s.next().charAt(0);
		Scanner ss = new Scanner(System.in);
		char item2 = ss.next().charAt(0);
		if (item1>item2)
			System.out.println(item2+","+item1);
	       
	    else
	        System.out.println(item1+","+item2);

	}

}
