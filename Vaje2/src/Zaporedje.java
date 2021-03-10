
public class Zaporedje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test = tabela(10);
		for(int i = 0; i < 10; i++)System.out.println(test[i]);

	}
	private static String naslednjiClen(String str) {
		int count  = 0;
		char curr = str.charAt(0);
		String ans = "";
		for(int i = 0; i< str.length(); i++) {
			if (str.charAt(i) == curr) count++;
			else {
				ans += String.valueOf(count);
				ans += curr;
				curr = str.charAt(i);
				count = 1;
			}
		}
		ans += String.valueOf(count);
		ans += curr;
		return ans;
	}
	public static String[] tabela(int n) {
		String[] ans = new String[n];
		String curr = "1";
		for (int i = 0; i<n; i++) {			
			ans[i] = curr; 
			curr = naslednjiClen(curr);
		}
		return ans;
	}
}
