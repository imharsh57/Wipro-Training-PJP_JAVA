package array;

import java.util.Arrays;

public class A05 {

	public static void main(String[] args) {
		int[] array = {65, 118, 90, 74, 120};
		Arrays.sort(array);
		System.out.println("Smallest two in the array are : " + array[0] + " and " + array[1]);
		System.out.println("Largest two in the array are : " + array[array.length-1] + " and " + array[array.length-2]);
	}

}
