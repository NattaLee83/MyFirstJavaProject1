package user;
public class User {
    private String userName;
    private String password;


    public User(String myName, String myPassword) {
        userName = myName;
        password = myPassword;
    }


    public String getName() {
        return userName;
    }


    public String getPassword() {
        return password;
    }


    public void setName(String newName) {
        if (newName.length() >= 4) { //<--- Vi ändrar enbart namnet om det innehåller mer än 4 bokstäver!
            userName = newName;
        }
    }


    public void setPassword(String myPassword) {
        if (myPassword.length() >= 7 && myPassword.length() <= 20) {
            password = myPassword;
        }

    }
}



