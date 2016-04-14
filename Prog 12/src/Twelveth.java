import java.util.Scanner;

//Program to create a matrix and to perform its transpose

public class Twelveth {
	void mat() {
		Scanner value = new Scanner(System.in);
		int m, n;
		System.out.println("Enter the number of rows and columns");
		m = value.nextInt();
		n = value.nextInt();
		int[][] arr = new int[m][n];
		System.out.println("Enter matrix details:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				// System.out.println("Enter the value for " );
				arr[i][j] = value.nextInt();
			}
		}
		System.out.println("The matrix is as follows:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("\t" + arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("Transpose is as follows:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print("\t" + arr[j][i]);
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		Twelveth twe = new Twelveth();
		twe.mat();

	}

}
