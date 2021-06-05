/*
 *  UCF COP3330 Summer 2021 Exercise 7 Solution
 *  Copyright 2021 Christopher Gray
 */
package base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_is_properly_formatted() {
        App myApp = new App();
        double lengthFeet = 15;
        double widthFeet = 20;

        String expectedOutput = String.format("You entered dimensions of " +
                "15 feet by 20 feet.%nThe area is%n300 square feet%n" +
                "27.871 square meters%n");
        String actualOutput = myApp.generateOutputString(lengthFeet, widthFeet);

        assertEquals(expectedOutput, actualOutput);
    }
}