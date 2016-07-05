import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = in.nextLine();
		System.out.println("Enter text:");
		String text = in.nextLine();		
		String modified = text.replace(word, word.toUpperCase());
		System.out.println(modified);
		in.close();
	}
}