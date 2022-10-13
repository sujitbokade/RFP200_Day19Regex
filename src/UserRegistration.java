import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        UserRegistration userRegistration = new UserRegistration();
//        userRegistration.validFirstName();
//        userRegistration.validLastName();
//        userRegistration.validEmail();
//        userRegistration.validMobileNumber();
        userRegistration.validPassword();
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

    public void validMobileNumber() {
        Pattern pattern = Pattern.compile("^[0-9]{2}-[0-9]{10}$");
        System.out.println("Enter MobileNumber");
        String mobileNumber = sc.next();
        Matcher match = pattern.matcher(mobileNumber);
        if (match.matches()) {
            System.out.println("MobileNumber is Valid");
        } else {
            System.out.println("MobileNumber is Invalid");
        }
    }

    public void validPassword() {
        Pattern pattern = Pattern.compile("(?=.*[A-Z]+[a-z]).{8,}");
        System.out.println("Enter Password");
        String password = sc.next();
        Matcher match = pattern.matcher(password);
        if (match.matches()) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid");
        }
    }
}
