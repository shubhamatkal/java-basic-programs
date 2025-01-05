import java.util.Scanner;

public class DiffScan{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading a single word
        System.out.print("Enter a word: ");
        String word = scanner.next();
        System.out.println("You entered: " + word);

        // Reading a line of text
        System.out.print("Enter a sentence: ");
        scanner.nextLine(); // Consume newline left by previous next() call
        String sentence = scanner.nextLine();
        System.out.println("You entered: " + sentence);

        // Reading an integer
        System.out.print("Enter an integer: ");

        int number = scanner.nextInt();
        System.out.println("You entered: " + number);
        scanner.close();
    }
}
