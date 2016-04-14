import java.util.Scanner;

//fibonacci series
public class Tenth {
	void fibo() {
		int f1 = 0;
		int f2 = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("How many fibonacci numbers");
		int n = input.nextInt();
		System.out.println("0");
		System.out.println("1");
		for (int i = 2; i < 10; i++) {
			int f3 = f1 + f2;
			System.out.println(f3);
			f1 = f2;
			f2 = f3;
		}

	}

	public static void main(String[] args) {
		Tenth te = new Tenth();
		te.fibo();

	}

}
