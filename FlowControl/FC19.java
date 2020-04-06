package FlowControl;

public class FC19 {

	public static void main(String[] args) {
		int counter = 0;
		int num = 0;
		
		while (counter != 5) {
			num++;
			
			if (num % 2 == 0 && num % 3 == 0 && num % 5 == 0) {
				System.out.println(num);
				counter++;
			}
		}

	}

}
