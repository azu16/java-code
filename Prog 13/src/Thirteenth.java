/*Write a program in which we take a 3d array which consist of department wise student marks.
  there are 3 departments and in each department there are 2 students and each student has
  marks in 3 subjects.We want to calculate total marks of each student.*/
public class Thirteenth {
	void dep() {
          int k,tot = 0;
		int[][][] arr = { { { 1, 2, 3 }, { 4, 5, 6 } },
				{ { 7, 8, 9 }, { 10, 11, 12 } },
				{ { 13, 14, 15 }, { 16, 17, 18 } } };
		for (int i = 0; i < 3; i++) {
			int d = 1;
			System.out.println("departmrnt" + " " + (d + i) + ":");
			for (int j = 0; j < 2; j++) {
				int s = 1;
				System.out.print("Student" + (s + j) + " " + "marks: ");
				for ( k = 0; k < 3; k++) {
					System.out.print(arr[i][j][k] + " ");
					tot = tot + arr[i][j][k];
				}
				System.out.print("Total marks: " +tot);
				System.out.println();
				tot = 0;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Thirteenth thi = new Thirteenth();
		thi.dep();

	}

}
