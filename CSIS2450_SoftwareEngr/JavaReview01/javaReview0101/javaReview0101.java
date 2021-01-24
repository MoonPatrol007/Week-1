
package javaReview0101;

import java.util.Scanner;

/**
 * Part 01 of Java Review 1
 * CSIS 2450 Software Engineering I
 *  
 * @author hector_juarez
 *
 */
public class javaReview0101 {

	/**
	 * Main Method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Integer values in the Array ");

		// Declare and initialize an array
		int[] nums = { 39, 46, 10, 37, 33, 4, 30, 26, 14, 19, 29, 6, 43, 8, 35, 50, 13, 25, 
				17, 48, 28, 3, 41, 34, 36, 38, 49, 16, 45, 2, 40, 15, 24, 7, 5, 9, 20, 1, 42, 
				44, 21, 47, 12, 22, 18, 31, 11, 32, 27, 23 };

		System.out.print("\nGuess an Integer value between 1 and 50: ");
		Scanner input = new Scanner(System.in);
		int value = input.nextInt();

		while (!contains(nums, value)) {

			value++;
			System.out.print("\nNope, Guess again: ");
			value = input.nextInt();
		}
		System.out.println("\nYes, " + value + " is in the array");

		// This from the method of findIndex to locate the index location of the scanner input.
		System.out.println("The position value in the array index is: " + findIndex(nums, value));

		input.close();

	}

	/**
	 * This method helps to list the location of the index which is selected by
	 * scanner input value.
	 * 
	 * It's using Linear Search in an array, the element can be found in O(N) time
	 * complexity.
	 * 
	 * @param nums
	 * @param value
	 * @return
	 */
	private static int findIndex(int[] nums, int value) {

		if (nums == null) {
			return -1;
		}

		int len = nums.length; // find length of array
		int i = 0;

		while (i < len) { // Traverse in the array

			if (nums[i] == value) { // if the i-th element is value then return the index.
				return i;
			} else {
				i = i + 1;
			}
		}
		return -1;
	}

	/**
	 * Method to help me check if the scanner input value is also located within the
	 * array literal created above.
	 * 
	 * @param nums
	 * @param value
	 * @return
	 */
	private static boolean contains(int[] nums, int value) {

		boolean result = false;

		for (int i : nums) {
			if (i == value) {
				result = true;
				break;
			}
		}

		return result;
	}

}
