import java.util.Scanner;

//Find Maximum of 2 nos

public class first {
	int num1, num2;

	void compare() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		num1 = input.nextInt();
		num2 = input.nextInt();
		if (num1 > num2) {
			System.out.println("num1 is greater");
		} else if (num2 > num1) {
			System.out.println("num2 is greater");
		} else
			System.out.println("Both are equal");
	}

	public static void main(String[] args) {
		first fi = new first();
		fi.compare();

	}

}
