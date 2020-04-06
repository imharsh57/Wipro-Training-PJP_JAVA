package FlowControl;


public class FC16 {

	public static void main(String[] args) {
		
		if (args.length==0){
			System.out.println("Please enter an Integer");
			System.exit(0);
			}
		else {
			int number = Integer.parseInt(args[0]);
			for(int i=0;i<number;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
		}
	}

}
