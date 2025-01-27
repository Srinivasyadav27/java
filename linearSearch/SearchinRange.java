package linearSearch;

public class SearchinRange {

	public static void main(String[] args) {
		int arr[] = {18,12,-7,3,14,28};
		int target = -7;
		
//	this start and end we can give in int i = 1 and arr.length place	
//		int start  = 1;
//		int end  = 4;
//		
		for (int i = 1; i < arr.length-1; i++) {
			if (target == arr[i]) {
				System.out.print(i + "  ");
			}
		}

	}
	
	

}
