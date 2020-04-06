package LanguageBasics;

import java.util.Scanner;

public class LB03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);  
        int s = in.nextInt(); 
        
        Scanner inn = new Scanner(System.in); 
        int ss = inn.nextInt(); 
        
        int add = s+ss;
        
        System.out.println("The Sum of "+s+" and "+ss+" is "+add);
	}


}
