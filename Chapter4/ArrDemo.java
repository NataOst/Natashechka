public class ArrDemo {

	public static void main(String[] args) {
		int [] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = i + 1;
		}
		int j = 0;
		while (j < 10) {
			System.out.println("The value is " + arr[j] + " The index is " + j);
			j = j + 1;		
		}
		j = 9;
		while (j > 0) {
			System.out.println("The value is " + arr[j] + " The index is " + j);
			j = j - 1;
		}
	}
}