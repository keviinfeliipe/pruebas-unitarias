package co.com.sofka.app;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing subtract: 1-1=0")
    public void subtract() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 0L;

        // Act
        Long result = basicCalculator.subtract(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several subtracts")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "2,    1,   1",
            "1,    2,   -1",
            "51,  49,   2",
            "100,  1,   99"
    })
    public void severalSubtracts(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.subtract(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing multiply: 3*2=6")
    public void multiply() {
        // Arrange
        Long number1 = 3L;
        Long number2 = 2L;
        Long expectedValue = 6L;

        // Act
        Long result = basicCalculator.multiply(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several multiplys")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "2,    1,   2",
            "1,    -2,   -2",
            "3,  3,   9",
            "100,  3,   300"
    })
    public void severalMultiplys(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiply(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing divide: 10/5=2")
    public void divide() {
        // Arrange
        Long number1 = 10L;
        Long number2 = 5L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.divide(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several divides")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "6,    3,   2",
            "25,    2,   12,2",
            "30,  5,   6",
            "100,  5,   20"
    })
    public void severalDivides(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.divide(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

}