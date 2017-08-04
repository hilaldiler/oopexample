package tr.org.kamp.linux.Arrow;

public class ItemApplication {
public static void main(String[] args) {
	Bow bow =new Bow(1,200,100,false,400,2);
	Sword sword =new Sword(5, 50, 100, true, 5);
	Armor armor=new Armor(2, 100, 50, true, 20, true);
	

	System.out.println(bow.numberOfArrows);

	bow.useItem();
	
	System.out.println(bow.numberOfArrows);

	
	
}
}
