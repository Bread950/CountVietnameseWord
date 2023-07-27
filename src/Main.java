import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your string here: ");
        String inputString = scanner.nextLine();
        StringAnalyzer stringAnalyzer = new StringAnalyzer();
        System.out.println("The result is: " + stringAnalyzer.getNumberOfVietnameseWords(inputString));

    }

}