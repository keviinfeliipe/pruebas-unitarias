package co.com.sofka.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Objects;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }
    public Long subtract(Long number1, Long number2) {
        logger.info( "Subtracting {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long multiply(Long number1, Long number2) {
        logger.info( "Multiplying {} * {}", number1, number2 );
        return number1 * number2;
    }

    public Long divide(Long number1, Long number2) {
        logger.info( "Dividing {} / {}", number1, number2 );
        if (Objects.isNull(number2) || number2==0){
            throw new IllegalArgumentException("No se permite la divicion entre 0");
        }
        return number1 / number2;
    }

}
