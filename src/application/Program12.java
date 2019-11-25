package application;

import java.util.Locale;
import java.util.Scanner;

public class Program12 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Matrix size: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		System.out.printf("Enter elements of matrix %dx%d:%n", n, n);
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nMain diagonal:");
				
		for (int i = 0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");								
		}
		
		int count = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {		
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}
		
		System.out.println("\nNegative numbers = " + count);
		
		sc.close();
	}

}
