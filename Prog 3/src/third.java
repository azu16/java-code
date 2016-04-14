import java.util.Scanner;

/* Write a program that will read a float type value from the   keyboard and print the following output.

 ->Small Integer not less than the number.

 ->Given Number.

 ->Largest Integer not greater than the number.

 */

public class third {
	double num;

	void cond() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		num = input.nextDouble();
		System.out.println("Small integer not less than the " + num);
		System.out.println("Given " + num);
		System.out.println("Largest integer not greater than the " + num);
	}

	public static void main(String[] args) {
		third thi = new third();
		thi.cond();

	}

}
