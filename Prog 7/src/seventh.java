import java.util.Scanner;

/*Write a program to Find Factorial of Given no. */

public class seventh {
	int n;
	Scanner input = new Scanner(System.in);
	int fact1 = 1;

	public void fact() {
		System.out.println("enter the number");
		n = input.nextInt();
		if (n <= 0) {
			System.out.println("Factorial is not defined");
		}

		else {
			for (int i = 1; i <= n; i++) {
				fact1 = fact1 * i;
			}

		}
		System.out.println("Factorial: " + fact1);
	}

	public static void main(String[] args) {
		seventh sev = new seventh();
		sev.fact();

	}

}
