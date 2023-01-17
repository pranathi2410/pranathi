package sample1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class DiscountCalculatorTest {

	@ParameterizedTest
	@CsvSource({"2000,11","5500,12"})
	void testDiscount(float p,float discount) {
		DiscountCalculator d=new DiscountCalculator();
		float expected=p*discount/100;
		float actual=d.discount(p, discount);
		Assertions.assertEquals(expected, actual);
		
		
	}

}
