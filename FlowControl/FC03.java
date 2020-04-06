package FlowControl;

public class FC03 {

	public static void main(String[] args) {
		
		if (args.length > 0) 
        { 
            String argument = String.join(", ",args);
			System.out.println(argument);  
        } 
        else
            System.out.println("No values"); 
    } 

}


