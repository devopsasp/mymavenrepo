package ecommapp.ecomapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class ItemServiceTesst {

	@Test
	public void testAddItem() {
		ItemService service=new ItemService();
		Item obj=new Item();
		obj.setItemName("CD");
		obj.setPrice(100);
		obj.setQuantity(10);
		assert(service.addItem(obj));
	}

	@Test
	public void testRemoveItem() {
		ItemService service=new ItemService();
		Item obj=new Item();
		obj.setItemName("CD");
		obj.setPrice(100);
		obj.setQuantity(10);
		assert(service.removeItem(obj));
		
	}

	@Test
	public void testGetAllItems() {
		Item obj1=new Item();
		  obj1.setItemId(1);
		  obj1.setItemName("Book");
		  obj1.setPrice(150);
		  obj1.setQuantity(10);
		  Item obj2=new Item();
		  obj2.setItemId(2);
		  obj2.setItemName("CD");
		  obj2.setPrice(230);
		  obj2.setQuantity(12);
		  ItemService service=new ItemService();
		  service.addItem(obj1);
		  service.addItem(obj2);
		  
		  assert(service.getAllItems().size()>=2);
	}
	@Test
	 public void testGetItem()
	 {
		Item obj1=new Item();
		  obj1.setItemId(1);
		  obj1.setItemName("Book");
		  obj1.setPrice(150);
		  obj1.setQuantity(10);
		  ItemService service=new ItemService();
		  service.addItem(obj1);
		  assert(service.getItem(obj1)!=null);
	 }

}
