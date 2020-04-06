package FlowControl;

import java.time.Month;

public class FC09 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please enter the month in numbers");
			System.exit(0);
		}
		int month = Integer.parseInt(args[0]);		
		if (month < 1 || month > 12) {
			System.out.println("Invalid month");
			System.exit(0);
		}
		String month_Str = Month.of(month).name();
		month_Str = month_Str.substring(0,1).toUpperCase() + month_Str.substring(1).toLowerCase();
		
		System.out.println(month_Str);

	}

}
