package ecommapp.ecomapp;
import java.util.*;
public class ItemService {
	public boolean addItem(Item item)
	{
		  
		ItemDb.getDefaultInstance().getItemDb().add(item);
		return true;
	}
	public boolean removeItem(Item item)
	{
		ItemDb.getDefaultInstance().getItemDb().remove(item);
		return true;
	}
	public ArrayList getAllItems()
	{
		
		return ItemDb.getDefaultInstance().getItemDb();
	}
	public String getItem(Item item)
	{
		return item.getItemId()+" "+ item.getItemName()+" "+item.getPrice()+" "+item.getQuantity();
	}
	ArrayList itemList=new ArrayList();
	public boolean updateItem(Item item)
	{
		itemList.add(item);
		return true;
	}
	
	public void setCalculate(int mynum)
	{
		return;
		
	}
	

}
