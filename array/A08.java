package array;

public class A08 {

	public static void main(String[] args) {
		int[] arr = { 10, 7, 1, 1, 4,6, 1, 9 };
		boolean six = false, seven = false;
        int id_six = -1, id_seven = arr.length;

        for (int i = 0; i < arr.length; i++) {
            
            if (arr[i] == 6) {
                six = true;
                id_six = i;
            }
            if (six && arr[i] == 7) {
                seven = true;
                id_seven = i;
            }
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (six && seven) {
                if (i < id_six || i > id_seven)
                    sum += arr[i];
            } else
                sum += arr[i];
        }

        System.out.println(sum);
	}

}
