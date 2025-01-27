package linearSearch;

public class ls {
	public static void main(String[] args) {
		int []arr = {12,34,56,23,344,334,354};
		int num = 56;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==num) {
				System.out.println("number is found at: "+ i);
			}
		}
	}

}
