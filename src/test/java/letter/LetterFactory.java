package letter;


import java.util.ResourceBundle;

public class LetterFactory {
    private static ResourceBundle letter = ResourceBundle.getBundle("letter");
    public static Letter writeLetter (){
        return new Letter(
        letter.getString("subject"),
        letter.getString("body")
        );
    }
}
