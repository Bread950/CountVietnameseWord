import java.util.Scanner;

public class StringAnalyzer {
    public int getNumberOfVietnameseWords (String inputString) {
        String wordToAnalyze = inputString.replaceAll("[^\\w\\s]","");
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if ((inputString.charAt(i) == 'a' && inputString.charAt(i + 1) == 'a') ||
                    (inputString.charAt(i) == 'o' && inputString.charAt(i + 1) == 'o') ||
                    (inputString.charAt(i) == 'd' && inputString.charAt(i + 1) == 'd') ||
                    (inputString.charAt(i) == 'e' && inputString.charAt(i + 1) == 'e')) {
                count++;
                i = i + 1;
            }
            else if ((inputString.charAt(i) == 'a' || inputString.charAt(i) == 'o')
                    && (inputString.charAt(i + 1) == 'w')) {
                inputString.split("w");
                count++;
                i = i + 1;
            }
                else if (inputString.charAt(i) == 'w') {
                count++;
            }
        }
        return count;
    }
}
