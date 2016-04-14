import java.util.Scanner;

//Search for a given string from array of strings

public class Fifteen {
	void comp() {
		Scanner input = new Scanner(System.in);
		int n;
		String sea;
		System.out.println("Enter the number of names:");
		n = input.nextInt();
		int j = 1;
		String arr[] = new String[n];
		input.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("enter name " + (i + j));
			arr[i] = input.nextLine();
		}
		System.out.println();
		System.out.println("Entered names are: ");
		for (int k = 0; k < n; k++) {
			System.out.println(arr[k]);
		}
		System.out.println();
		System.out.print("Enter the name to be searched: ");
		sea = input.nextLine();

		for (int l = 0; l < n; l++) {
			int s = arr[l].compareTo(sea);
			if (s == 0) {
				System.out.println("Found at position: " + (l + j));
			}
		}
		
	}

	public static void main(String[] args) {
		Fifteen fif = new Fifteen();
		fif.comp();

	}

}
