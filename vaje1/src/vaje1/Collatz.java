package vaje1;

/*
 Comments
 It seems I should type in English.
 To  
 */

public class Collatz {
	// n  --> n /2 če n sod
	//    --> n + 1, n lih
	// COllatzova domneva: nedokazana
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(dolzina(69));
		//System.out.println(najvecjiClen(69));
		izpisiClene(69);
	}
	public static int naslednjiClen(int n) {
		if (n  % 2 == 0) return n / 2;
		return 3 * n + 1;
	}
	public static int dolzina(int n) {
		int stevec = 1;
		while (n!= 1) {
			n = naslednjiClen(n);
			stevec++; // increases stevec by 1
		}
		return stevec;
	}
	public static int najvecjiClen(int n) {
		int currMax = n;
		while(n != 1) {
			n = naslednjiClen(n);
			currMax = Math.max(currMax, n);
		}
		return currMax;
	}
	public static void izpisiClene(int n) {
		System.out.print(n);
		while(n != 1) {
			n = naslednjiClen(n);
			System.out.print(" " + n);
		}
	}
}
