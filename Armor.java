package tr.org.kamp.linux.Arrow;

public class Armor extends Item implements Upgradeable {

	protected int defansePoint=0;
	protected boolean isWorn;

	
	




	


	public Armor(int itemQuantity, int itemPrice, int itemWeight, boolean useItem, int defansePoint, boolean isWorn) {
		super(itemQuantity, itemPrice, itemWeight, useItem);
		this.defansePoint = defansePoint;
		this.isWorn = isWorn;
	}



	public void getHit(int damagePoint,int defansePoint) {
		if(isWorn) {
			if(defansePoint>damagePoint) {
				defansePoint=defansePoint- damagePoint;
			}
			else defansePoint=0;
			isWorn=false;
		}
	}



	@Override
	public void upgrade() {
		defansePoint=defansePoint+100;
		
	}



	public int getDefansePoint() {
		return defansePoint;
	}



	public void setDefansePoint(int defansePoint) {
		this.defansePoint = defansePoint;
	}



	public boolean isWorn() {
		return isWorn;
	}



	public void setWorn(boolean isWorn) {
		this.isWorn = isWorn;
	}

}
