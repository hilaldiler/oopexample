package tr.org.kamp.linux.Arrow;

public abstract class Item {

	 int itemQuantity = 0; //miktar
	 int itemPrice; //fiyat
	int  itemWeight;//kilo
	 boolean useItem;
	
	
	
	
	public Item(int itemQuantity, int itemPrice, int itemWeight, boolean useItem) {
		super();
		this.itemQuantity = itemQuantity;
		this.itemPrice = itemPrice;
		this.itemWeight = itemWeight;
		this.useItem = useItem;
		
		itemQuantity++;
	}
	protected boolean useItem() {
		if(itemQuantity>0) {
			return true;
		}
		return false;
		
	}
	public int getItemQuantity() {
		return itemQuantity;
	}
	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getItemWeight() {
		return itemWeight;
	}
	public void setItemWeight(int itemWeight) {
		this.itemWeight = itemWeight;
	}
	public boolean isUseItem() {
		return useItem;
	}
	public void setUseItem(boolean useItem) {
		this.useItem = useItem;
	}

	
	
	
	
	
}
