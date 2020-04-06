package array;

public class A02 {

	public static void main(String[] args) {
		int[] array = {8,7,2,1,6,4,12};
		int min = array[0];
		int max = array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min)
				min = array[i];
			if (array[i] > max) 
				max = array[i];
		}		
		
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);

	}

}
