import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Dictionary {
    ArrayList<String> dictionary = new ArrayList<>();


    public Dictionary() {
        // getDictionary();
        dictionary.add("monkey");
        dictionary.add("rabbit");
        dictionary.add("laptop");
    }

    private void readDictionary() {
        try {
            File dictionaryFile = new File("dictionary.txt");
            Scanner fileReader = new Scanner(dictionaryFile);
            while (fileReader.hasNextLine()) {
                dictionary.add(fileReader.nextLine());
            }
            fileReader.close();
            
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

    protected ArrayList<String> getDictionaryArrayList() {
        return dictionary;
    } 

    
    
}