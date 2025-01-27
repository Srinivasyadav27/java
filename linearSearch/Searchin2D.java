package linearSearch;

public class Searchin2D {

	public static void main(String[] args) {
		int[] [] arr = {
				{23,4,1},
				{18,12,3,9},
				{78,99,34,56},
				{18,12}
		};
		
		int target = 18;
		for (int row = 0; row < arr.length; row++) {
			for (int col = 0; col < arr[row].length; col++) {
				if(arr[row][col] == target) {
					System.out.println(row + "  " + col);
				}
			}
		}

	}

}
