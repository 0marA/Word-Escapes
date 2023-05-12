import java.util.Scanner;
public class WordEscapes {

    private static Scanner scanner = new Scanner(System.in);
    private static Permutations permutations = new Permutations();
    

    public static void main(String [] args) {
        System.out.println();
        System.out.println("Welcome to Word Escapes, a tool to help you with WordScapes!");

        System.out.print("Type all possible letters you have (including duplicates) non-comma seperated, there should be six: ");

        String possibleLettersString = scanner.nextLine();


        permutations.setPossibleLetters(possibleLettersString);

        System.out.println(permutations.getPermutations());
    }
}
