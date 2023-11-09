package exercise10;

public class PasswordCheck {
    public boolean check(String password) {

        boolean enoughCharactors = false;
        boolean hasDigits = false;
        boolean hasSpecialCharacters = false;

        if(password.length()>=8) {
            enoughCharactors = true;
        }

        for (int i = 0;i <password.length();i++) {
            char c = password.charAt(i);
            if (!Character.isDigit(c)) {
                hasSpecialCharacters = true;
            }
        }
        return enoughCharactors && hasDigits && hasSpecialCharacters;
    }
}
