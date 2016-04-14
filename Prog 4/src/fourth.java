/*Write a program to generate 5 Random nos. between 1 to 100, and it

 should not follow with decimal point.

 */
public class fourth {
	int i;

	void gen() {

		for (i = 1; i <= 5; i++) {
			System.out.println((int)(Math.random()*100));
		}

	}

	public static void main(String[] args) {
		fourth fr = new fourth();
		fr.gen();

	}

}
