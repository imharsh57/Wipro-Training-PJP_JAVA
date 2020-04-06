package FlowControl;

public class FC13 {

	public static void main(String[] args) {
		int num = 10;
		int num1 = 99;
		String  primeNumbers = "";

	       for (int i = 10; i <= num1; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(int numm =i; numm>=1; numm--)
		  {
	             if(i%numm==0)
		     {
	 		counter = counter + 1;
		     }
		  }
		  if (counter==2)
		  {
		     primeNumbers = primeNumbers + i + " ";
		  }	
	       }	
	       System.out.println(primeNumbers);
	}

}
