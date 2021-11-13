package fr.dauphine.javaavance.td4;

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTest {

	@Test(expected=IllegalArgumentException.class)
	public void testIfTheValueOfTheCarIsNegativeThrowIllegalArgumentException() {
		Car car = new Car("", -200);
		
	}

}
