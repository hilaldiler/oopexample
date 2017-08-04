package tr.org.kamp.linux.Arrow;

public class Bow extends Weapon implements Upgradeable { // yay

	protected int numberOfArrows;

	
	public Bow(int itemQuantity, int itemPrice, int itemWeight, boolean useItem, int damageAmount, int numberOfArrows) {
	super(itemQuantity, itemPrice, itemWeight, useItem, damageAmount);
	this.numberOfArrows = numberOfArrows;
}

	@Override
	public void upgrade() {
		// TODO Auto-generated method stub

	}

	@Override
	protected boolean useItem() {
		if (getItemQuantity() > 0 && numberOfArrows > 0) {
			numberOfArrows = numberOfArrows - 1;
			return true;
		} else {
			return false;
		}

	}
	
	
}
