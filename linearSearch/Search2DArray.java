package linearSearch;

import java.util.Arrays;

public class Search2DArray {

	public static void main(String[] args) {
		
		int[] arr = {23,456,1,34,56,78,98,54,32,4,2};
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1]= temp;
					
					
					
				}
			}

			
		}for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + "  ");
		}
		
	}

}
