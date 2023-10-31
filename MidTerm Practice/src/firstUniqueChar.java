import java.util.Scanner;

public class firstUniqueChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char firstUniqueChar = findFirstUniqueChar(input);

        if (firstUniqueChar != '\0') {
            System.out.println("First unique character: " + firstUniqueChar);
        } else {
            System.out.println("No unique character found in the string.");
        }

        scanner.close();
    }

    public static char findFirstUniqueChar(String word) {
        for (int i = 0; i < word.length(); i++) {
            char uniqueChar = word.charAt(i);

            boolean isUnique = true;

            for (int j = 0; j < word.length(); j++) {
                if (i != j && uniqueChar == word.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                return uniqueChar;
            }
        }

        return '\0'; // no unique 
    }
}