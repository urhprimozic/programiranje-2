package vaje1;

public class Razcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		izpisiRazcep(1024);
		izpisiRazcep(5761665);
	}
	public static void izpisiRazcep(int n) {
		
		char znak = '=';
		
		System.out.print(n + " ");
		
		for(int p = 2; p * p <= n; ++p) {
			int stevec = 0;
			while(n % p == 0) {
				stevec++;
				n = n / p;
			}
			if (stevec == 0) continue;
			
			
			System.out.print(" " + znak + ' ');
			if (znak == '=') znak = '*';
			System.out.print(p);
			if (stevec > 1) System.out.print("^" + stevec);
			
			
			
			if (n > 1) System.out.print(" " + znak + ' ' + n);
			if (n == 1) break;
		}
		System.out.println();
	}
}
