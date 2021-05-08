package module05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class14 {
    public static void main(String[] args) {

        String regex = "\\b([0-9]{3})\\.([0-9]{3})\\.([0-9]{3})\\-([0-9]{2})"; //criar no regexr.com

        String cpf = "111.111.111-00";

        Pattern pattern = Pattern.compile(regex);

        Matcher match = pattern.matcher(cpf);

        System.out.println(match.find());
    }
}
