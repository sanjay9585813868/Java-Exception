package throwAndThrows;

public class program2ForThrow {
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40 };

		print(arr);
	}

	static void print(int[] arr) {
		int i = 0;
		while (true) {
			if (i >= arr.length) {
				throw new ArrayIndexOutOfBoundsException("can't access the next value");
			} else {

				System.out.println(arr[i]);
			}

			i++;
		}
	}
}
