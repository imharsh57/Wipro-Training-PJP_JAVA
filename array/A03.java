package array;

public class A03 {

	public static void main(String[] args) {
		int[] array = {1,4,34,56,7};
		int search_element = 9;
		int index = -1;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == search_element) {
				index = i + 1;
				break;
			}
		}

		System.out.println(index);

	}

}
