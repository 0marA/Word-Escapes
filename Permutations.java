import java.util.ArrayList;

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

    public ArrayList<String> getPermutations() {
        filterDictionary();
        ArrayList<String> permutations = new ArrayList<>();

        return permutations;
    }

    public void setPossibleLetters(String possibleLettersString) {
        inputtedLetters = possibleLettersString;
        for (int i = 0; i < possibleLettersString.length(); i++) {
            permutatableLetters.add(possibleLettersString.charAt(i));
        }
    }

    public void filterDictionary() {
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
            if (!skip)
                possibleWords.add(dictionary.get(dicLine));
            skip = false;
        }

        System.out.println(possibleWords);
    }



}
