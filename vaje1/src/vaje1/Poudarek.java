package vaje1;

public class Poudarek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(poudari("to je en test.!"));
	}
	public static String poudari(String niz) {
		String ans = "";
		for(int i = 0; i < niz.length(); ++i) {
			char znak = niz.charAt(i);
			if (i > 0) ans += ' ';
			ans += Character.toUpperCase(znak);
		}
		return ans;
	}

	public static String bold(String niz) {
		boolean krepko = false;
		String ans = "";
		for(int i = 0; i < niz.length(); ++i) {
			char znak = niz.charAt(i);
			if (znak == '*') krepko = !krepko;
			else if (krepko) ans += Character.toUpperCase(znak);
			else ans += znak;
		}
		return ans;
	}
	}
}
