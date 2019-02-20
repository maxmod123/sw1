package hw2;

import java.util.ArrayList;

public class kareemcart {
	
ArrayList <Integer> price = new ArrayList<Integer>();
ArrayList <Integer> quantity = new ArrayList<Integer>();

 public void add (int price1, int quantity1) {
	 price.add(price1);
	 quantity.add(quantity1);
 }
  public int resultt () {
	  int res = 0 ; 
	  for(int i = 0 ; i<price.size();i++) {
		  res += price.get(i) * quantity.get(i);
	  }
	  return res ;
  }
}







