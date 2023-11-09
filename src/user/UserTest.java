package user;

import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class UserTest {


    //Skapa en testklass och utveckla efter TDD
    @Test
    public void testGetUserName() {
        //Arrange
        //Skapa ett test för en tänkt klass User autogenerera klassen ifrån testklassen
        //Uppdatera testet så att konstruktorn i User får två parametrar av typen String
        User user = new User("userName", "password");
        String expected = "userName";
        //Act
        String actual = user.getName();
        //Skriv koden som gör att testet i uppgift 3 blir godkänt och spara parametrarna
        // i två attribut: userName, password. För alla kommande uppgifter gör likadant
        // Red – Green – Refactor


        //Assert
        assertEquals(expected, actual);
    }


    @Test
    public void testGetPassword() {
        //Arrange
        //Vi skapar en ny klass igenom att referera till en klass som ännu inte
        //Existerar och vi skapar den sedan igenom att hovra över den röda texten
        //och vi klickar för att generera en klass med vårt valda namn!
        //Vi kan sedan också generera en konstruktor ifrån samma linje om vi
        //Skriver in någon information i signaturen!
        User user = new User("userName", "password");
        //Vi skriver in vårt förväntade lösenord i expected!
        String expected = "password";
        //Act
        //Vi hämtar vårt förväntade lösenord ifrån en metod som ännu inte
        //Existerar, vi implementerar sedan metoden och refaktorerar så att
        //Den kan returnera rätt lösenord!
        String actual = user.getPassword();
        //Assert
        //Vi jämför resultaten och ser att de är korrekta!
        assertEquals(expected, actual);
    }


    //Skriv ett test som ändrar userName!
    @Test
    public void testSetUserName() {
        User user = new User("userName", "password");
        String expected = "Arthur Dent";


        //Vi implementerar en metod som ändrar vårt namn
        user.setName("Arthur Dent");
        //Vi hämtar sedan namnet till vår actual
        String actual = user.getName();


        //Vi jämför innehållet i expected och actual!
        assertEquals(expected, actual);
    }


    //Uppdatera testet ifrån punkt 7 så att userName
    //inte får vara kortare än 4 tecken, i så fall
    //behåller man det ursprungliga userName
    @Test
    public void testSetShortUserName() {
        User user = new User("Adam", "Password");
        String expected = "Adam"; //<--- Vi förväntar oss att användarnnamnet ej förändras!


        user.setName("Jim"); //<--- vi behöver en kontroll på om vårt användarnamn är för kort!
        String actual = user.getName();


        assertEquals(expected, actual);
    }


    //Skriv fler test som testar denna nya funktion
    @Test
    public void testSetFourCharacterUserName() {
        User user = new User("Adam", "Password");
        String expected = "Mats";


        user.setName("Mats");
        String actual = user.getName();


        assertEquals(expected, actual);
    }


    @Test
    public void testSetZeroCharactersUserName() {
        User user = new User("Adam", "Password");
        String expected = "Adam";


        user.setName(""); //<--- Vi testar med en tom sträng för att se vad som händer!
        String actual = user.getName();


        assertEquals(expected, actual);
    }
    //Skriv test som gör det möjligt att uppdatera lösenordet.
    //Ett lösenord måste ha minst 7 tecken och får vara högst 20 tecken långt

    @Test
    public void testShortPassword(){
        User user = new User("Ulla-britt","Korvstoppning");
        String expected = "Korvstoppning";


        user.setPassword("Golv");
        String actual = user.getPassword();


        assertEquals(expected,actual);
    }

    @Test
    public void testLongPassword(){
        User user = new User("Hamtaro","password");
        String expected ="password";


        user.setPassword("LooongLoooongMaaaaaaaaaan");
        String actual = user.getPassword();


        assertEquals(expected,actual);
    }
}














