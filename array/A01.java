package array;

public class A01 {

	public static void main(String[] args) {
		int[] array = {8,7,2,1,6,4,12};
		double sum = 0;
		double avg;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		avg = sum / array.length;
		
		System.out.println("Average: " + avg);

	}

}
