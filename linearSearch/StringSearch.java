package linearSearch;

public class StringSearch {

	public static void main(String[] args) {
		String str = "Srinivas Yadav";
		char search = 'Y';
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==search) {
				System.out.print(i + " ");
			}
		}

	}

}
