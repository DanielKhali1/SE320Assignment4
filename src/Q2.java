import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Q2 {

	public static void main(String[] args) {
	    Set<String> treeSet = new TreeSet<>();
	    
	    try {
			BufferedReader bf = new BufferedReader(new FileReader(new File("Q2TextFile")));
			
			String line = bf.readLine();
			while(line != null) {
				treeSet.add(line);
				line = bf.readLine();
			}
		} catch (FileNotFoundException  e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    System.out.println(treeSet);
	}
}
