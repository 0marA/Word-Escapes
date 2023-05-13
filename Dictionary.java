import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Dictionary {
    ArrayList<String> dictionary;


    public Dictionary() {
        dictionary = new ArrayList<>();
        readDictionary();
    }

    private void readDictionary() {
        try {
            Scanner fileReader = new Scanner(new File("dictionary.txt"));
            while (fileReader.hasNextLine())
                dictionary.add(fileReader.nextLine());

            fileReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred trying to parse the dictionary.");
        }
    }

    protected ArrayList<String> getDictionaryArrayList() {
        return dictionary;
    }
}
