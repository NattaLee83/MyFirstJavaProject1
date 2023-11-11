package del2;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class TestRunner {

    @Test
    public void testCountRows(){
        //Arrange
        MyInput myRowsTest = new MyInput();
        int expected = 3;

        //Act
        String[] testrows = new String[]{"Hej", "på", "dig"};
        for (String testrow : testrows){
            myRowsTest.processInput(testrow);
        }
        int actual = myRowsTest.getCounter().getRows();

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testCountChars(){
        //Arrange
        MyInput myCharsTest = new MyInput();
        int expected = 8;

        //Act
        String[] testrows = new String[]{"Hej", "på", "dig"};
        for (String testrow : testrows){
            myCharsTest.processInput(testrow);
        }
        int actual = myCharsTest.getCounter().getChars();

        //Assert
        assertEquals(expected, actual);
    }
    @Test
    public void testRows(){
        //Arrange
        MyInput myCharsTest = new MyInput();
        String[] expected = new String[]{"Hej", "på", "dig"};

        //Act
        String[] testrows = new String[]{"Hej", "på", "dig"};
        for (String testrow : testrows){
            myCharsTest.processInput(testrow);
        }
        String[] actual = myCharsTest.getRows().toArray(new String[0]);

        //Assert
        assertEquals(expected, actual);
    }
}
