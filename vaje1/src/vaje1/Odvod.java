package vaje1;

public class Odvod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static double[] odvod(double[] p, int n) {
		if (n >= p.length ) return new double[0];
		double[] op = new double[p.length - n];
		int f = 1;
		for( int i = 2; i<= n; ++i) f*= i;
		for (int i = n; i< p.length; ++i) {
			op[i - n] = f * p[i];
			f /= i - n + 1;
			f *= i + 1; 
		}
		
	}
}
