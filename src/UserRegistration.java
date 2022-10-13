import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validFirstName();
    }

    public void validFirstName() {
        Scanner sc = new Scanner(System.in);
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{1,}$");
        System.out.println("Enter FirstName");
        String firstName = sc.next();
        Matcher match = pattern.matcher(firstName);
        if (match.matches()) {
            System.out.println("First Name is Valid");
        } else {
            System.out.println("First Name is Invalid");
        }
    }
}
