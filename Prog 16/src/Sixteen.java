import java.util.Scanner;

//Palindrome
public class Sixteen {
	void pal() {
		Scanner input = new Scanner(System.in);
		String s;
		StringBuffer str = new StringBuffer();
		System.out.println("Enter the name: ");
		s = input.nextLine();
		str.append(s);
		str.reverse();
		String s1 = str.toString();
		if (s.equals(s1)) {
			System.out.println("palindrome");
		} else
			System.out.println("not palindrome");

	}

	public static void main(String[] args) {
		Sixteen six = new Sixteen();
		six.pal();
	}

}
