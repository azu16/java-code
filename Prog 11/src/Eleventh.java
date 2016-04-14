import java.util.Scanner;

/*Write a program which accepts the marks of a student in 1d array from the keyboard and find 
 total marks and percentage*/
public class Eleventh {
	void marks() {
		int tot = 0;
		Scanner value = new Scanner(System.in);
		System.out.println("Enter the number of sublects:");
		int n = value.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Subject " + (i + 1));
			arr[i] = value.nextInt();
		}
		System.out.println("Marks of different subjects are:");
		for (int j = 0; j < n; j++) {
			System.out.println(arr[j]);
		}
		for (int z = 0; z < n; z++) {
			tot = tot + arr[z];
		}
		System.out.println("Total marks obtained: " + tot);
		int total_Marks = (n * 10);
		System.out.println("Total marks: " + total_Marks);
		// int per = (tot/total_Marks)*(100);
		// System.out.println("percentage: " +per);
	}

	public static void main(String[] args) {
		/*
		 * int arr[] = {1,2,3,4,5}; for(int i = 0; i <= 4; i++){
		 * System.out.println(arr[i]); }
		 */
		Eleventh ele = new Eleventh();
		ele.marks();
	}

}
