import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String login = "login123";
        String password = "password";
        String confirmPassword = "confirm password";

        try {
            Validator.validate(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException exception) {
            exception.printStackTrace();
        }
    }
}
