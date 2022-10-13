import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validFirstName();
        userRegistration.validLastName();
        userRegistration.validEmail();
    }

    public void validFirstName() {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        System.out.println("Enter FirstName");
        String firstName = sc.next();
        Matcher match = pattern.matcher(firstName);
        if (match.matches()) {
            System.out.println("First Name is Valid");
        } else {
            System.out.println("First Name is Invalid");
        }
    }

    public void validLastName() {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}$");
        System.out.println("Enter LastName");
        String lastName = sc.next();
        Matcher match = pattern.matcher(lastName);
        if (match.matches()) {
            System.out.println("Last Name is Valid");
        } else {
            System.out.println("Last Name is Invalid");
        }
    }

    public void validEmail() {
        Pattern pattern = Pattern.compile("^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$");
        System.out.println("Enter Email");
        String email = sc.next();
        Matcher match = pattern.matcher(email);
        if (match.matches()) {
            System.out.println("Email is Valid");
        } else {
            System.out.println("Email is Invalid");
        }
    }
}
