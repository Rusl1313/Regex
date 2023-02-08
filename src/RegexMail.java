import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        System.out.println(isGmailOrOutlook(text));
    }

    public static boolean isGmailOrOutlook(String email) {
        Pattern pattern = Pattern.compile("[\\w&&[^_]]{3,15}@(gmail|outlook).(com)");
        Matcher matcher = pattern.matcher(email);
        boolean b = matcher.matches();
        if (b) {
            return true;
        } else {
            return false;
        }

    }
}
