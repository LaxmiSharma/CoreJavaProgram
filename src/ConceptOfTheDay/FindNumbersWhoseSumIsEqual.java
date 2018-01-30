package ConceptOfTheDay;

import java.util.Arrays;

public class FindNumbersWhoseSumIsEqual {
	// time complexity id O(n^2)
	static void findThePairs(int inputArray[], int inputNumber) {
		Arrays.sort(inputArray);
		System.out.println("Pairs of elements whose sum is " + inputNumber + " are : ");
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				if (inputArray[i] + inputArray[j] == inputNumber) {
					System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);
				}

			}
		}
	}

	// time complexity id O(nlogn)
	static void findThePairsWithSortedArray(int inputArray[], int inputNumber) {
		Arrays.sort(inputArray);
		int i = 0, j = inputArray.length - 1;
		System.out.println("Pairs of elements whose sum is " + inputNumber + " are : ");
		while (i < j) {
			if (inputArray[i] + inputArray[j] == inputNumber) {
				System.out.println(inputArray[i] + " + " + inputArray[j] + " = " + inputNumber);
				i++;
				j--;
			} else if (inputArray[i] + inputArray[j] < inputNumber) {
				i++;
			} else if (inputArray[i] + inputArray[j] > inputNumber) {
				j--;
			}

		}

	}

	public static void main(String[] args) {
		{
			findThePairsWithSortedArray(new int[] { 4, 6, 5, -10, 8, 5, 20 }, 10);

			findThePairsWithSortedArray(new int[] { 4, -5, 9, 11, 25, 13, 12, 8 }, 20);

			findThePairsWithSortedArray(new int[] { 12, 13, 40, 15, 8, 10, -15 }, 25);

			findThePairsWithSortedArray(new int[] { 12, 23, 125, 41, -75, 38, 27, 11 }, 50);

			System.out.println("*********************************************");

			findThePairs(new int[] { 4, 6, 5, -10, 8, 5, 20 }, 10);

			findThePairs(new int[] { 4, -5, 9, 11, 25, 13, 12, 8 }, 20);

			findThePairs(new int[] { 12, 13, 40, 15, 8, 10, -15 }, 25);

			findThePairs(new int[] { 12, 23, 125, 41, -75, 38, 27, 11 }, 50);
		}
	}
}
