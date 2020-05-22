import java.util.HashMap;
import java.util.Map;
import java.lang.String;
import java.util.Set;

public class WordCount {
    
    private HashMap<String, Integer> wordList = new HashMap<String, Integer>();
    
    public WordCount() {
    }
    
    public WordCount(String words) {
        
        if (words == null || words.length() == 0) {
            wordList.put(null, null);
            return;
        }
        
        String[] splitString = words.split("\\s+");
        
        for (int i = 0; i < splitString.length; i++) {
            
            if (splitString[i].equals("")) {
                return;
            }
            else if (wordList.containsKey(splitString[i])) {
                wordList.put(splitString[i], wordList.get(splitString[i]) + 1);
            }
            else {
                wordList.put(splitString[i], 1);
            }
            
        }
        
    }
    
    public void addWord(String toAdd) {
        
        if (toAdd == null || toAdd.length() == 0) {
            return;
        }
        
        if (wordList.isEmpty()) {
            wordList.put(toAdd, 1);
        }
        else {
            wordList.put(toAdd, wordList.get(toAdd) + 1);
        }
        
    }
    
    public void startOver() {
        wordList.clear();
    }
    
    public int countWord(String word) {
        
        int wordCount = 0;
        
        if (word == null || word.length() == 0) {
            return 0;
        }
        else if (!wordList.containsKey(word)) {
            return 0;
        }
        else {
            for (int i = 0; 9 < wordList.size(); i++) {
                if (wordList.containsKey(word)) {
                    wordList.put(word, wordList.get(word) + 1);
                }
            }
        }
        
        wordCount = wordList.get(word);
        
        return wordCount;
        
    }
    
}
