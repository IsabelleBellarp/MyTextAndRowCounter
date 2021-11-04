package MyTextCounter;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestMyCounter {


    @Test
    public void testStop() {

        //Arrange
        Counter myCounter = new Counter();

        //Act
        boolean actual = myCounter.containsStop("stop");

        //Assert
        boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void testCountCharacters() {

        // Arrange
        Counter myCounter = new Counter();

        //Act
        myCounter.increaseCharacters("Hej");
        int actual = myCounter.getCharacters();

        //Assert
        int expected = 3;

        assertEquals(expected, actual);
    }

    @Test
    public void testCountRows() {

        //Arrange
        Counter myCounter = new Counter();


        //Act
        myCounter.addRow();
        int actual = myCounter.getRows();

        //Assert
        int expected = 1;

        assertEquals(expected, actual);
    }


}
