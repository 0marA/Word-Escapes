import java.util.ArrayList;
import java.util.Collections;

public class Permutations extends Dictionary {

    private ArrayList<Character> permutatableLetters;
    private ArrayList<String> dictionary;
    private ArrayList<String> possibleWords;
    private String inputtedLetters;

    public Permutations() {
        super();
        dictionary = getDictionaryArrayList();
        permutatableLetters = new ArrayList<>();
        possibleWords = new ArrayList<>();
    }


    public void setPossibleLetters(String possibleLettersString) {
        inputtedLetters = possibleLettersString;
        for (int i = 0; i < possibleLettersString.length(); i++) {
            permutatableLetters.add(possibleLettersString.charAt(i));
        }
    }

    public ArrayList<String> getPermutations() {
        ArrayList<String> words = filterDictionary();
        Collections.sort(words);
        return words;
    }

    public void printPermutations() {
        System.out.println("Possible words: ");
        for (String word : getPermutations()) {
            System.out.println(word);
        }

        System.out.println("The longest word found was: " + getLongestFoundWord(getPermutations()));
    }

    public ArrayList<String> filterDictionary() {
        boolean skip = false;

        for (int dicLine = 0; dicLine < dictionary.size(); dicLine++) {
            ArrayList<Character> temporaryPermutableLetters = new ArrayList<>(permutatableLetters);

            for (int dicLineLetter = 0; dicLineLetter < dictionary.get(dicLine)
                    .length(); dicLineLetter++) {

                if (dictionary.get(dicLine).equals(inputtedLetters))
                    break;


                if (!permutatableLetters.contains(dictionary.get(dicLine).charAt(dicLineLetter))
                        || dictionary.get(dicLine).length() > inputtedLetters.length()
                        || dictionary.get(dicLine).length() < 3) {
                    skip = true;
                    break;
                }

                try {
                    temporaryPermutableLetters.remove(temporaryPermutableLetters
                            .indexOf(dictionary.get(dicLine).charAt(dicLineLetter)));
                } catch (Exception e) {
                    skip = true;
                    break;
                }

            }
            if (!skip) {
                possibleWords.add(dictionary.get(dicLine));
            }
            skip = false;
        }

        return possibleWords;
    }

    public String getLongestFoundWord(ArrayList<String> words) {
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }

}
