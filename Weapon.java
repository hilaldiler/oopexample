package tr.org.kamp.linux.Arrow;

public abstract class Weapon extends Item {//silah

	protected  int damageAmount;//hasar
	

	public Weapon(int itemQuantity, int itemPrice, int itemWeight, boolean useItem, int damageAmount) {
	super(itemQuantity, itemPrice, itemWeight, useItem);
	this.damageAmount = damageAmount;
}



	public int getDamageAmount() {
		return damageAmount;
	}



	public void setDamageAmount(int damageAmount) {
		this.damageAmount = damageAmount;
	}

	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Bow:Quantity"+itemQuantity+"damage amount: "+damageAmount+"number of arrow: ";
		}
	
}
