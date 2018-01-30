package ConceptOfTheDay;

import java.util.Arrays;

public class ArraysSearch {
	public static void main(String[] args) {

		String[][] s1 = { { "java", "swings", "j2ee" }, { "struts", "jsp", "hibernate" } };
		String[][] s2 = { { "java", "swings", "j2ee" }, { "struts", "jsp", "hibernate" } };
		System.out.println("deep to string : " + Arrays.deepToString(s1));
		System.out.println("deep equals : " + Arrays.deepEquals(s1, s2));
		System.out.println("equals : " + Arrays.equals(s1, s2));
		
		int[] i = { 24, 13, 45, 37, 84, 13, 28 };
		Arrays.sort(i);
		System.out.println("sorted Array : " + Arrays.toString(i));
		System.out.println(Arrays.binarySearch(i, 45));
		System.out.println(Arrays.binarySearch(i, 55));
		System.out.println(Arrays.binarySearch(i, 90));
		int[] j = { 24, 13, 45, 37, 84, 13, 28 };
		Arrays.sort(j);
		System.out.println("equals : " + Arrays.equals(i, j));
		char[] c = { 'X', 'n', 'F', 's', 'D', 'J', 'j', 'F' };
		Arrays.sort(c);
		System.out.println("sorted array : " + Arrays.toString(c));
		System.out.println(Arrays.binarySearch(c, 'J'));
		System.out.println(Arrays.binarySearch(c, 'c'));
		System.out.println(Arrays.binarySearch(c, 'f'));
		System.out.println(Arrays.binarySearch(c, 'k'));
		// Arrays.fill(c, 'a');
		int b[] = Arrays.copyOfRange(i, 2, 9);
		System.out.println("copy of method  : " + Arrays.toString(b));

		boolean[] bln = { true, false, true, true, false };
		boolean[] bln1 = Arrays.copyOf(bln, 10);
		System.out.println(Arrays.toString(bln1));
	}
}
