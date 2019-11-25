package application;

import java.util.Locale;
import java.util.Scanner;

public class Program13 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Matrix lines: ");
		int m = sc.nextInt();
		System.out.print("Matrix columns: ");
		int n = sc.nextInt();

		int[][] mat = new int[m][n];

		System.out.printf("\nEnter positive numbers to matrix %dx%d:%n", m, n);

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();

				if (mat[i][j] < 0) {
					sc.close();
					throw new IllegalArgumentException("Negative numbers are not allowed");
				}
			}
		}

		System.out.print("\nChoose a number in matrix: ");
		int choice = sc.nextInt();

		System.out.println("Number locations:");

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == choice) {
					System.out.printf("\nposition %d,%d:%n", i, j);

					int up = -1, down = -1, left = -1, right = -1;

					if (i > 0) {
						up = mat[i - 1][j];
					}

					if (i < mat.length - 1) {
						down = mat[i + 1][j];
					}

					if (j > 0) {
						left = mat[i][j - 1];
					}

					if (j < mat[i].length - 1) {
						right = mat[i][j + 1];
					}

					System.out.printf("\tup=%d, down=%d, left=%d, right=%d", up, down, left, right);
				}
			}
		}
		
		sc.close();
	}
}
