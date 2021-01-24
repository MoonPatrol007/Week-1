
package javaReview0103;

import java.util.Scanner;

/**
 * Part 03 of Java Review 1 CSIS 2450 Software Engineering I
 * 
 * @author hector_juarez
 *
 */
public class javaReview0103 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int ch = 0; // variable for user menu choice
		// this data is a list of 50 randomized names as customer names
		String[] customers = { "Amy Garrison", "Braydon Beil", "Bluebell Nguyen", "Konrad Sears", "Cheryl Salas",
				"Rosanna Meyer", "Karis Haley", "Enzo Donaldson", "Catrina Griffiths", "Gregor Payne",
				"Jermaine Jordan", "Zakariya Goulding", "Mehdi Vickers", "Zarah Lozano", "Mattie Watkins",
				"Hudson Sheridan", "Rahul Tate", "Bruno Jefferson", "Shaunie Mccallum", "Mica Hendrix", "Coco Houston",
				"Kayla Stanton", "Noel Cooper", "Tommie Leonard", "Naima Bray", "Harley Neville", "Sabah Rosas",
				"Kade Mccartney", "Bruce Valenzuela", "Elif Ireland", "Nansi Joseph", "KeirBetts", "Harvie Barnard",
				"Kady Whitworth", "Sadiyah Levine", "Sakina Cresswell", "Chantel Wu", "Harriette Booth",
				"Isla-Mae Edge", "Daniela Shepherd", "Cosmo Lam", "Myron Archer", "Caspian Bradford", "Elyse Fletcher",
				"Halima Devlin", "Humzah Madden", "Bevan Donnelly", "Piotr Rice", "Malikah Mejia", "Mujtaba Bassett" };

		/*
		 * Declare and initialize a two-dimensional array.
		 * 
		 * This data is 50 rows of 13 values per row. Each row represents one customer's
		 * account number (first value) and 12 values that represent one payment per
		 * month for one year.
		 */
		double[][] payments = { { 1032, 47, 43, 38, 61, 69, 99, 47, 36, 30, 99, 59, 17 },
				{ 1043, 93, 48, 18, 57, 52, 14, 55, 87, 22, 52, 56, 77 },
				{ 1005, 71, 27, 52, 41, 18, 86, 43, 43, 95, 21, 86, 43 },
				{ 1030, 13, 12, 27, 81, 29, 86, 31, 86, 10, 54, 71, 81 },
				{ 1045, 40, 91, 0, 27, 21, 50, 89, 28, 49, 87, 23, 16 },
				{ 1040, 25, 15, 63, 88, 68, 60, 77, 25, 63, 73, 13, 10 },
				{ 1007, 24, 89, 72, 49, 17, 30, 96, 22, 64, 56, 69, 15 },
				{ 1008, 45, 42, 54, 27, 65, 22, 75, 51, 42, 43, 97, 97 },
				{ 1049, 15, 45, 26, 81, 43, 38, 70, 32, 30, 78, 53, 77 },
				{ 1035, 21, 47, 15, 28, 54, 61, 15, 85, 60, 95, 39, 62 },
				{ 1046, 42, 93, 97, 13, 19, 15, 67, 100, 21, 64, 28, 35 },
				{ 1029, 90, 42, 61, 75, 96, 25, 12, 65, 66, 39, 20, 52 },
				{ 1034, 75, 69, 60, 78, 79, 92, 38, 71, 44, 41, 43, 99 },
				{ 1027, 60, 59, 89, 22, 86, 55, 83, 67, 70, 24, 70, 39 },
				{ 1024, 54, 76, 55, 33, 78, 91, 24, 43, 61, 58, 83, 78 },
				{ 1001, 94, 56, 48, 30, 32, 0, 0, 52, 41, 46, 37, 60 },
				{ 1023, 53, 24, 36, 54, 79, 54, 37, 61, 46, 65, 34, 40 },
				{ 1022, 21, 41, 49, 74, 44, 91, 82, 100, 12, 26, 12, 23 },
				{ 1050, 94, 48, 22, 19, 56, 16, 72, 39, 53, 11, 32, 16 },
				{ 1033, 82, 21, 97, 69, 50, 86, 16, 55, 93, 72, 70, 47 },
				{ 1044, 49, 0, 14, 28, 23, 84, 0, 88, 0, 88, 0, 93 },
				{ 1026, 26, 22, 34, 63, 99, 99, 50, 36, 75, 64, 86, 33 },
				{ 1010, 47, 43, 38, 64, 80, 71, 23, 80, 85, 31, 13, 66 },
				{ 1003, 36, 97, 15, 25, 41, 77, 44, 54, 72, 20, 12, 85 },
				{ 1006, 86, 46, 80, 63, 90, 23, 91, 18, 12, 83, 11, 66 },
				{ 1047, 80, 73, 48, 28, 11, 49, 76, 14, 85, 67, 65, 51 },
				{ 1002, 27, 11, 100, 39, 55, 26, 29, 41, 90, 48, 34, 81 },
				{ 1021, 94, 94, 50, 16, 37, 48, 56, 90, 96, 25, 93, 70 },
				{ 1028, 13, 55, 0, 69, 67, 60, 35, 45, 79, 71, 67, 21 },
				{ 1042, 80, 69, 29, 47, 70, 22, 42, 83, 26, 54, 95, 70 },
				{ 1038, 30, 40, 100, 90, 88, 10, 39, 10, 87, 14, 63, 17 },
				{ 1004, 30, 84, 56, 28, 13, 92, 51, 52, 61, 91, 68, 53 },
				{ 1041, 62, 10, 24, 95, 27, 49, 27, 57, 97, 71, 70, 99 },
				{ 1000, 10, 69, 43, 91, 93, 24, 74, 52, 20, 76, 27, 86 },
				{ 1018, 100, 51, 96, 23, 76, 64, 28, 49, 35, 72, 51, 48 },
				{ 1019, 22, 82, 37, 26, 39, 81, 81, 94, 50, 80, 78, 88 },
				{ 1016, 88, 44, 10, 78, 86, 76, 0, 11, 17, 49, 50, 13 },
				{ 1012, 57, 67, 47, 41, 43, 100, 66, 23, 29, 18, 55, 75 },
				{ 1014, 21, 55, 55, 66, 55, 92, 51, 92, 86, 43, 61, 51 },
				{ 1036, 42, 19, 97, 27, 68, 24, 69, 85, 80, 43, 87, 58 },
				{ 1009, 20, 34, 59, 49, 13, 79, 13, 11, 89, 33, 49, 94 },
				{ 1013, 36, 30, 50, 77, 93, 30, 97, 100, 68, 41, 93, 21 },
				{ 1037, 90, 67, 61, 88, 73, 67, 11, 49, 92, 75, 67, 47 },
				{ 1017, 32, 73, 82, 30, 55, 39, 48, 79, 87, 31, 99, 41 },
				{ 1039, 41, 74, 74, 90, 56, 18, 84, 64, 58, 88, 93, 83 },
				{ 1025, 32, 91, 0, 0, 0, 19, 87, 74, 83, 64, 26, 44 },
				{ 1011, 99, 11, 81, 74, 91, 78, 92, 85, 79, 59, 19, 86 },
				{ 1020, 35, 84, 81, 73, 30, 90, 95, 30, 68, 51, 12, 83 },
				{ 1048, 57, 32, 12, 75, 29, 46, 71, 53, 28, 65, 72, 28 },
				{ 1015, 16, 86, 61, 44, 63, 80, 48, 25, 15, 30, 45, 36 } };

		// do-while loop for menu
		do {
			// Menu
			printLine(145);
			System.out.println("Customer Menu");

			printLine(145);
			System.out.println("1. Find Customer by account number");
			System.out.println("2. Report Customers with any missed payments");
			System.out.println("3. Report Customers with closed status");
			System.out.println("4. Exit");

			printLine(145);
			System.out.print("Enter 1, 2, 3, or 4 here: ");
			ch = input.nextInt(); // Enter choice from user

			switch (ch) {

			/*
			 * Menu Option 1: Prompt the user for an account number. Find that account
			 * number in the array and print the customer's record to the console. Only
			 * print the requested customer, not all.
			 */
			case 1:
				int checkAccount = 0;
				System.out.print("Enter account number = ");
				int accountUser = input.nextInt(); // get account number from user

				for (int i = 0; i < payments.length; ++i) {
					for (int j = 0; j < 1; ++j) {

						// check account user to see if present in array
						if (payments[i][j] == accountUser) {

							printLine(145);
							String newIndent = customers[i];
							int notDouble = (int) payments[i][j];
							System.out.format(newIndent + "\t\t" + notDouble + "\t");	

							int count = 0;
							for (int k = 1; k < payments[i].length; ++k) {
								if (payments[i][k] == 0) {
									count++;
								}
								System.out.print(payments[i][k] + " ");
							}

							// standing values
							if (count == 0) {
								System.out.println("Good"); // A record with no 0 payments display "Good"
							} else if (count == 1) {
								System.out.println("Fair"); // A record with one 0 payment display "Fair"
							} else if (count == 2) {
								System.out.println("Poor"); // A record with two 0 payments display "Poor"
							} else {
								System.out.println("Closed"); // A record with more than two 0 payments display "Closed"
							}
							checkAccount = 1;
						}
					}
				}

				// if account number not found show below message
				if (checkAccount == 0) {
					System.out.println("Sorry, I couln't find the account number...!! ");
				}
				break;

			/*
			 * Menu Option 2: Again, using the Customer History report format, print all
			 * customer records with 0 payments in any month. Do not print customers who
			 * have paid every month.
			 */
			case 2:
				int checkAccount2 = 0;
				printLine(145);

				for (int i = 0; i < payments.length; ++i) {
					int count1 = 0;
					for (int j = 1; j < payments[i].length; ++j) {

						// A record with no 0 payments display "Good"
						if (payments[i][j] == 0) {
							count1++;
						}
					}

					if (count1 > 2) { // A record with two 0 payments display "Poor"

						// customer details
						System.out.print(customers[i] + " " + payments[i][0] + " "); // customer account number
						for (int k = 1; k < payments[i].length; ++k) {
							System.out.print(payments[i][k] + " "); // Monthly Payment
						}
						System.out.println("Closed"); // standing value
						checkAccount2++;
					} else if (count1 == 1) { // A record with one 0 payment display "Fair"

						// customer details
						System.out.print(customers[i] + " " + payments[i][0] + " "); // customer account number
						for (int k = 1; k < payments[i].length; ++k) {
							System.out.print(payments[i][k] + " "); // Monthly Payment
						}
						System.out.println("Fair"); // standing value
						checkAccount2++;
					} else if (count1 == 2) {// zero is equal to two

						// customer details
						System.out.print(customers[i] + " " + payments[i][0] + " "); // customer account number
						for (int k = 1; k < payments[i].length; ++k) {
							System.out.print(payments[i][k] + " "); // Monthly Payment
						}
						System.out.println("Poor"); // standing value
						checkAccount2++;
					}

				}

				// if No Missed Payments show below message
				if (checkAccount2 == 0) {
					System.out.println("No Missed Payments...!! ");
				}
				break;

			/*
			 * Menu Option 3: Using the Customer History report format, print all customer
			 * records who meet the criteria above for "Closed" accounts. Do not print any
			 * other customers.
			 */
			case 3:
				int checkAccount3 = 0;
				printLine(145);

				for (int i = 0; i < payments.length; ++i) {
					int count2 = 0;
					for (int j = 1; j < payments[i].length; ++j) {
						// check in monthly payment zero present or not
						if (payments[i][j] == 0) {
							count2++;
						}
					}

					if (count2 > 2) // zero is more than two
					{
						// customer details
						System.out.print(customers[i] + " " + payments[i][0] + " "); // customer account number
						for (int k = 1; k < payments[i].length; ++k) {
							System.out.print(payments[i][k] + " "); // Monthly Payment
						}
						System.out.println("Closed"); // standing value
						checkAccount3++;
					}
				}

				// if No Closed Payments show message
				if (checkAccount3 == 0) {
					System.out.println("No Closed Payments! ");
				}
				break;

			/* this case is used to exit program */
			case 4:
				System.out.println("\nGood Bye.");
				break;

			default:
				System.out.println("Sorry, thats' an invalid Choice");

			}

		} while (ch != 4); // check Value of choice
		
		input.close();
	}

	/**
	 * Method to print lines in the console as a separator
	 * @param dashes
	 */
	private static void printLine(int dashes) {
		for (int i = 1; i <= dashes; i++) {
			System.out.print("-");

		}
		System.out.print("\n");

	}
}
