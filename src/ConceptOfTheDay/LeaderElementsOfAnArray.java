package ConceptOfTheDay;

import java.util.Arrays;

public class LeaderElementsOfAnArray {

	public static void leadersInArray(int inputArray[]) {
		int greatestElement = inputArray[inputArray.length - 1];
		int inputArrayLength = inputArray.length;
		System.out.println("The leaders in " + Arrays.toString(inputArray) + " are : ");
		System.out.println(inputArray[inputArrayLength - 1]);
		for (int i = inputArrayLength - 2; i >= 0; i--) {
			if (inputArray[i] > greatestElement) {
				System.out.println(inputArray[i]);
				greatestElement = inputArray[i];

			}
		}
	}

	public static void main(String[] args) {
		leadersInArray(new int[] { 12, 9, 7, 14, 8, 6, 3 });

		leadersInArray(new int[] { 8, 23, 19, 21, 15, 6, 11 });

		leadersInArray(new int[] { 55, 67, 71, 57, 51, 63, 38 });

		leadersInArray(new int[] { 21, 58, 44, 14, 51, 36, 23 });
	}
}
