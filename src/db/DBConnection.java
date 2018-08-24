package db;

import java.util.List;
import java.util.Set;

import entity.Item;

public interface DBConnection {

	/**
	 * Close the connection
	 */
	public void close();
	
	/**
	 * Insert the favorite items for a user
	 * 
	 * @param userId
	 * @param itemIds
	 */
	public void setFavoriteItems(String userId,List<String> itemIds);
	
	
	/**
	 * Delete the favorite items for a user
	 * 
	 * @param userId
	 * @param itemIds
	 */
	public void unsetFavoriteItems(String userId,List<String> itemIds);
	
	/**
	 * Get user's favorite item id
	 * 
	 * @param userId
	 * @return itemIds
	 */
	public Set<String> getFavoriteItemIds(String userId);
	
	/**
	 * Get user's favorite items
	 * 
	 * @param userId
	 * @return items
	 */
	public Set<Item> getFavoriteItems(String userId);
	
	/**
	 * Get categories based on item id
	 * @param itemId
	 * @return set of categories
	 */
	public Set<String> getCategories(String itemId);
	
	/**
	 * Search items near a geolocation and a term(optional)
	 * 
	 * @param lat
	 * @param lon
	 * @param term (Nullable)
	 * @return list of items
	 */
	public List<Item> searchItems(double lat,double lon,String term);
	
	/**
	 * Save item into Database
	 * 
	 * @param item
	 */
	public void saveItem(Item item);
	
	/**
	 * Get full name of a user (demo)
	 * 
	 * @param userId
	 * @return full name of user
	 */
	public String getFullName(String userId);
	
	/**
	 * Return whether credential is correct (demo)
	 * 
	 * @param userId
	 * @param password
	 * @return boolean
	 */
	public boolean verifyLogin(String userId,String password);
	
}
