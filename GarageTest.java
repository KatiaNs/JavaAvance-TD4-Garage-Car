package fr.dauphine.javaavance.td4;

import static org.junit.Assert.*;

import org.junit.Test;

import fr.dauphine.javaavance.td3.MyList;

public class GarageTest {

	@Test
	public void sizeCarInGarage() {
		MyList<String> l = new MyList<String>();
		l.add("Car1");
		l.add("Car2");
		assertEquals(2, l.size());
	}
	
	@Test
	public void sizeIdGarage() {
		MyList<String> l = new MyList<String>();
		l.add("Garage1");
		l.add("Garage2");
		assertEquals(2, l.size());
	}


	@Test(expected=NullPointerException.class)
	public void getInvalid() {
		MyList<String> l = new MyList<String>();
		l.add(null);
	}
//
//	@Test(expected=IllegalArgumentException.class)
//	public void getInvalid2() {
//		MyList<String> l = new MyList<String>();
//		l.addLast("toto2");
//		l.get(10);
//	}
//
//	@Test
//	public void sumLetterTest() {
//		MyList<String> l = new MyList<String>();
//		l.addLast("totoo");
//		l.add("toto");
//		l.add("titi");
//		assertEquals(13, l.sumLetters());
//	}
//
//	@Test(expected=NullPointerException.class)
//	public void addNull() {
//		MyList<String> l = new MyList<String>();
//		l.addLast("totoo");
//		l.add(null);
//	}
//
//	@Test(expected=NullPointerException.class)
//	public void addNull2() {
//		MyList<String> l = new MyList<String>();
//		l.addLast("totoo");
//		l.addLast(null);
//	}
//
//	@Test(expected=NullPointerException.class)
//	public void sumNull() {
//		MyList<String> l = new MyList<String>();
//		l.add("totoo");
//		l.add(null);
//		assertEquals(5, l.sumLetters());
//	}
//
//	@Test(timeout=1000)
//	public void toStringSpeed() {
//		MyList<String> l = new MyList<String>();
//		for(int i=0;i<100000;i++) {
//			l.add(Integer.toString(i));
//		}
//		l.toString();		
//	}

}
