package hw2;

import static org.junit.Assert.*;
import hw2.kareemcart;
import org.junit.Test;


public class testhw1 {
	
	@Test
	public void test() {
		kareemcart x = new kareemcart ();
		x.add(170, 1);
		x.add(100, 1);
	  String res =	"price"+x.resultt();
		assertEquals(" price 270",res);
		
	}

}
