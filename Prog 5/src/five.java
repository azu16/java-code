import java.util.Scanner;

/* Write a program to display a greet message according to

 Marks obtained by student.

 */

public class five {
	int total = 100;

	void marks() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter marks");
		int value = input.nextInt();
		// 34 System.out.println(value);
		int per = value * 100 / 100;
		// System.out.println(per);
		if (per < 35) {
			System.out.println("Fail");
		} else if (per >= 35 && per <= 50) {
			System.out.println("Third class");
		} else if (per > 50 && per <= 60) {
			System.out.println("Second Class");

		} else if (per > 60 && per <= 70) {
			System.out.println("First Class");
		} else
			System.out.println("First class with distinction");
	}

	public static void main(String[] args) {
		five fi = new five();
		fi.marks();

	}

}
