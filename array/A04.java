package array;

public class A04 {

	public static void main(String[] args) {
		int num[] = {65, 118, 90, 74, 120};
        String str =null;
        for(int i=0;i<num.length;i++){
            str = Character.toString((char)num[i]);
            System.out.println(str);
        }

	}

}
