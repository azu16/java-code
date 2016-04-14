import java.util.Scanner;

//To accept a year number from keyboard and test if it is leap or not

public class nineth {
	void leap() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = input.nextInt();
		if ((year % 4) == 0) {
			System.out.println("leap year");
		} else
			System.out.println("not leap");
	}

	public static void main(String[] args) {
		nineth ni = new nineth();
		ni.leap();

	}

}
