import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;
import static org.apache.commons.lang3.StringUtils.upperCase;

public class StringPlay {
    public static String capitalizeLetter(String letter){
//        StringUtils utils = new StringUtils();
        return upperCase(letter);
//        return letter.toUpperCase();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a letter: ");
        String letter = scanner.next();
        System.out.println(capitalizeLetter(letter));
    }
}
