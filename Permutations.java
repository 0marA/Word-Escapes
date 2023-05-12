import java.util.ArrayList;
public class Permutations extends Dictionary {

    private ArrayList<Character> permutatableLetters;
    private ArrayList<String> possibleWords;
    
    public Permutations() {
        super();
        permutatableLetters = new ArrayList<>();
        possibleWords = new ArrayList<>();


    }

    public ArrayList<String> getPermutations() {
        filterDictionary();
        ArrayList<String> permutations = new ArrayList<>();

        return permutations;
    }

    public void setPossibleLetters(String possibleLettersString) {
        for (int i = 0; i < possibleLettersString.length(); i++) {
            permutatableLetters.add(possibleLettersString.charAt(i));
        }
    }

    public void filterDictionary() {
        for (int dictionaryLine = 0; dictionaryLine < getDictionaryArrayList().size(); dictionaryLine++) {
            for (int letterAtLineOfDictionary = 0; letterAtLineOfDictionary < getDictionaryArrayList().get(dictionaryLine).length(); letterAtLineOfDictionary++) {
                for (int possibleLetter = 0; possibleLetter < permutatableLetters.size(); possibleLetter++) {
                    if (getDictionaryArrayList().get(dictionaryLine).charAt(letterAtLineOfDictionary) == permutatableLetters.get(possibleLetter) && 
                        !possibleWords.contains(getDictionaryArrayList().get(dictionaryLine))) {
                        possibleWords.add(getDictionaryArrayList().get(dictionaryLine));
                    }

                }

            }
        }

        System.out.println(possibleWords);
    }
    
}
