package hw2;

import java.util.ArrayList;

public class hw {
	public static class card {
		String name ; 
		int balance ; 
		 int amount ;
		ArrayList <String>  books  = new ArrayList <String>() ;
		card (String name  ){
		
			 this.balance = 0 ; 
			 this.name=name ;
			 this.amount = 0;
			
			
			
		}
		card (String name , int balance){
			this.name=name  ;
			this.balance=balance ;
		}
		 void addbooks (books x1) {
			 books.add(x1.name);
			 amount+=x1.price;
		 }
		 	void updatebalance ( String name  ,int balance1) {
			this.balance= balance1 ; 
		}
	}
	public  static class books{
		books(String name , int price ){
			this.name = name ; 
			this.price= price ; 
		}
		String name ; 
		int  price ; 
		
		
	} 

	public static void main(String[] args) {
		card x = new card("kareem", 400);
	books java=	 new books("java",170);
	books web = new books("web",100);
	x.addbooks(java);
	x.addbooks(web);
	
		

	}

}
