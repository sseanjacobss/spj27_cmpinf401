package spj27_lab10;

import java.util.Arrays;

import java.util.Scanner;

public class UniqueCombos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size;

		System.out.print("Enter size of array : ");

		size = sc.nextInt();
		int[] A = new int[size];

		for(int i=0;i<size;i++){

			System.out.print("Enter element "+(i+1)+" : ");

			A[i] = sc.nextInt();

		}
		
		int k;

		System.out.print("Enter value of K : ");
		k = sc.nextInt();
		Arrays.sort(A);


		System.out.println("Combination is as below");
		printCombos(A, "", 0,size, k);

	}

	public static void printCombos(int[] A, String out, int i, int n, int k) {

		if (k > n) {
			return;

		}

		if (k == 0) {

			System.out.println(out);

			return;
		}
		for (int j = i; j < n; j++) {

			printCombos(A, out + " " + (A[j]) , j + 1, n, k - 1);
			while (j < n - 1 && A[j] == A[j + 1]) {
				j++;
			}

		}

	}

}