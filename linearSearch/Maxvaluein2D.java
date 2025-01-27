package linearSearch;

public class Maxvaluein2D {

	public static void main(String[] args) {
		int[][] arr = { { 23, 4, 1 }, { 18, 12, 3, 9 }, { 78, 99, 34, 56 }, { 18, 12 } };

		int max = arr[0][0];

		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if (arr[row][col] > max) {
					max = arr[row][col];
				}
			}

		}
		System.out.println(max);

	}

}
