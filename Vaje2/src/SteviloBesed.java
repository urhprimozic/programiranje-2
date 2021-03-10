import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SteviloBesed {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(steviloBesed("vhod.txt", "izhod.txt"));
	}
	public static int steviloBesed(String pathIn, String pathOut) throws IOException {
		BufferedReader in= new BufferedReader(new FileReader(pathIn));
		PrintWriter out = new PrintWriter(new FileWriter(pathOut));
		
		int count = 0;
		
		while(in.ready()) {
			String line = in.readLine().trim();
			if (line.equals(""))continue;
			String[] words = line.split(" +");
			count += words.length;
			for(String word : words)out.println(word);
		}
		
		return count;
	}
}
