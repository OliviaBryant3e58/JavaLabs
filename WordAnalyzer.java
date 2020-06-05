import java.util.Scanner;
import java.lang.String;

//You must create this file entirely
//Remember to include any imports you might need
//Also remember that you will need some instance variables 
//This is the minimum set of methods

public class WordAnalyzer {
    
    private String phrase;
    
    public WordAnalyzer() {
        phrase = "Wherever you go, there you are";
    }
    
    public WordAnalyzer(String theWords) {
        phrase = theWords;
    }
    
    public void setWords(String text) {
        phrase = text;
    }
    
    public String getWords() {
        return phrase;
    }
    
    public int countLetters() {
        int letters = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (Character.isLetter(phrase.charAt(i))) {
                letters++;
            }
        }
        return letters;
    }
    
    public int countWords() {
        int words = 0;  
        char word[]= new char[phrase.length()];
        for (int i = 0; i < phrase.length(); i++) {
            word[i]= phrase .charAt(i);
            if(((i > 0) && (word[i] != ' ') && (word[i - 1] == ' ')) || ((word[0] != ' ') && (i == 0))) {
                words++;
            }
        }
        return words; 
    }

}
