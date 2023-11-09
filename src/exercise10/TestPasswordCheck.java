package exercise10;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class TestPasswordCheck {

    @Test
    public void testCorrectPassword() {
        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = true;

        //Act
        boolean actual = pass.check("pas@sword1");

        //Assert
        assertEquals(expected, actual);
}

    @Test
    public void testAtLessThan8CharactersAndNoDigits() {
        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("pass");

        //Assert
        assertEquals(expected, actual);

    }
    @Test
    public void testNoDigits() {
        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("pass");

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testNoSpecialCharacters() {
        //Arrange
        PasswordCheck pass = new PasswordCheck();
        boolean expected = false;

        //Act
        boolean actual = pass.check("pass");

        //Assert
        assertEquals(expected, actual);
    }
}
