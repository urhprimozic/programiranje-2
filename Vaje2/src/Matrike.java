
public class Matrike {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] test = {
				{2, 7, 8},
				{0, 9, 18}
				
		};
		printMatrix(transpose(test));
		printMatrix(test);
	}
	public static boolean isMatrix(float[][] matrix) {
		// matrix can be null
		if (matrix == null || matrix.length == 0) return false;
		// Dimensions. All the rows should be of the same lenght (1)
		// None should be null (2)
		// each element should not be null
		if (matrix[0] == null) return false;
		int width = matrix[0].length;
		int height = matrix.length;
		//thru ROWS
		for(int i = 0; i< height; i++) { 
			// (2)
			if (matrix[i] == null) return false;
			// (1)
			if (matrix[i].length != width) return false;
			// for (float t : matrix[i]) if (t == null) return false;
			
		}
		return true;
	}

	public static void printMatrix (float[][] matrix) {
		if (matrix == null)System.out.println("To pa ne blo šlo.");
		else {
			for(float[] vrstica : matrix) {
				if (vrstica == null) System.out.println("Nima za burek ta vrsticA");
				else {
					for(float f : vrstica)System.out.print(f + "\t");
				}
				System.out.println("");
			}
		}
	}
	
	public static float[][] transpose (float[][] matrix) {
		if (!isMatrix(matrix)) return null;
		int height = matrix.length;
		int width = matrix[0].length;
	    float[][] ans = new float[width][height];
	    for(int i = 0; i < height; i++)
	    	for(int j = 0; j < width; j++)ans[j][i] = matrix[i][j];
	    return ans;
	}
}
