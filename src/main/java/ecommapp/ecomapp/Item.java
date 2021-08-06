package ecommapp.ecomapp;

public class Item {
	private int itemId;
	private String itemName;
	private float price;
	private int quantity;
	private float discount;
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
 public String toString()
 {
	 return "Item ID:"+itemId+" Item Name:"+itemName+" Price:"+price+" Quantity:"+quantity; 
			 }
}
