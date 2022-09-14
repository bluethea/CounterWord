package utils;

public class TextCounter {
    public int countChars(String inputText) {
        return inputText.length();
    }
    public int countWords(String inputText1) {
        return inputText1.trim().split("\\W+").length;
    }
}
