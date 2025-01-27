package linearSearch;

public class Linear {

	public static void main(String[] args) {
		int[] arr = {12,34,5,67,88,4,19};
		int num =5;
		
		int ans = LinearSearch(arr,num);
		System.out.println(ans);
	}
	static int LinearSearch(int[] arr, int num) {
		if(arr.length==0) {
			return -1;
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==num) {
				return i;
			}
		}
		return -1;
	}

}
