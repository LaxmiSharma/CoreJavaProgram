package ConceptOfTheDay;

import java.util.Arrays;

public class SeparateZeroFromNonZerosInArray {

	public static void moveZerosToEnd(int inputArray[]) {

		System.out.println("Given array : " + Arrays.toString(inputArray));
		int counter = 0;
		int arrayLength = inputArray.length;
		for (int i = 0; i < arrayLength - 1; i++) {
			if (inputArray[i] != 0) {
				inputArray[counter] = inputArray[i];
				counter++;
			}
		}

		while (counter < arrayLength) {
			inputArray[counter] = 0;
			counter++;
		}
		System.out.println(Arrays.toString(inputArray));
	}

	public static void moveZerosToFront(int inputArray[]) {
		System.out.println("Given array : " + Arrays.toString(inputArray));
		int arrayLength = inputArray.length;
		int counter = arrayLength - 1;
		for (int i = arrayLength - 1; i >= 0; i--) {
			if (inputArray[i] != 0) {
				inputArray[counter] = inputArray[i];
				counter--;
			}
		}
		while (counter >= 0) {
			inputArray[counter] = 0;
			counter--;
		}
		System.out.println(Arrays.toString(inputArray));
	}

	public static void main(String[] args) {

		moveZerosToFront(new int[] { 12, 0, 7, 0, 8, 0, 3 });

		moveZerosToFront(new int[] { 1, -5, 0, 0, 8, 0, 1 });

		moveZerosToFront(new int[] { 0, 1, 0, 1, -5, 0, 4 });

		moveZerosToFront(new int[] { -4, 1, 0, 0, 2, 21, 4 });

		System.out.println("**********************************************");

		moveZerosToEnd(new int[] { 12, 0, 7, 0, 8, 0, 3 });

		moveZerosToEnd(new int[] { 1, -5, 0, 0, 8, 0, 1 });

		moveZerosToEnd(new int[] { 0, 1, 0, 1, -5, 0, 4 });

		moveZerosToEnd(new int[] { -4, 1, 0, 0, 2, 21, 4 });
	}
}
