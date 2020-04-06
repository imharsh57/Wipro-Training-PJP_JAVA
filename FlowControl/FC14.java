package FlowControl;

public class FC14 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please enter an integer number");
			System.exit(0);
		}

		int number = Integer.parseInt(args[0]);
		
		if (number == 0 || number == 1) {
			System.out.println(number + " is neither prime nor composite");
		} else {
			if (isPrime(number))
				System.out.println(number + " is not a prime number");
			else
				System.out.println(number + " is a prime number");
		}
		
	}
	public static boolean isPrime(int num) {
		boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        return flag;


	}

}
