import java.util.Arrays;
import java.util.LinkedHashSet;

public class Q1 {
	
	public static void main(String[] args) {
		String[] ar1 =  {"George", "Jim", "John", "Blake", "Kevin", "Michael"};
		String[] ar2 =  {"George", "Katie", "Kevin", "Michelle", "Ryan"};
		LinkedHashSet<String> hs1 = new LinkedHashSet<String>(Arrays.asList(ar1));
		LinkedHashSet<String> hs2 = new LinkedHashSet<String>(Arrays.asList(ar2));
		
		printUnion(hs1, hs2);
		printIntersection(hs1, hs2);
	}
	
	public static void printUnion(LinkedHashSet<String> h1, LinkedHashSet<String> h2) {
		@SuppressWarnings("unchecked")
		LinkedHashSet<String> union = (LinkedHashSet<String>) h1.clone();
		union.addAll(h2);
		System.out.println(union);
	}
	
	public static void printIntersection(LinkedHashSet<String> h1, LinkedHashSet<String> h2) {
		@SuppressWarnings("unchecked")
		LinkedHashSet<String> intersection = (LinkedHashSet<String>) h1.clone();
		intersection.retainAll(h2);
		System.out.println(intersection);
	}
}
