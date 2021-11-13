package fr.dauphine.javaavance.td4;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiscountTest {

	@Test
	  public void vehiculeWithDiscount() {
	    Discount discount = new Discount(1000);
	    Vehicules v1 = new Car("Peugeot", 1200, discount);
	    Vehicules v2 = new Bike("Peugeot", 100);
	    
	    assertEquals(discount.getValue(), v1.getValue());
	    assertEquals(discount.getValue(), v2.getValue());
	  }

}
