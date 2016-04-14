import java.util.Scanner;

//Find Minimum of 2 nos. using conditional operator

public class second {
	int num1, num2;

	void compare() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		num1 = input.nextInt();
		num2 = input.nextInt();
		if (num1 < num2) {
			System.out.println("num1 is minimum");
		} else if (num2 < num1) {
			System.out.println("num2 is minimum");
		} else
			System.out.println("Both are equal");
	}

	public static void main(String[] args) {

		second sec = new second();
		sec.compare();
	}

}
