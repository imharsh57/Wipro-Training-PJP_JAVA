package array;

import java.util.Arrays;

public class A07 {

	public static void main(String[] args) {
		int[] array = {65, 118, 90, 65, 74, 120,120,52};
		Arrays.sort(array);
		int[] temp = new int[array.length];
		int j=0;
		for(int i=0;i<array.length-1;i++) {
			if(array[i]!=array[i+1]) {
				temp[j++]=array[i];
				
			}
		}
		temp[j++]=array[array.length-1];
		int[] temp1 = new int[j];
		for(int k=0;k<j;k++) {
			temp1[k]=temp[k];
		}
		System.out.println(Arrays.toString(temp1));
	}

}
