package ambodenis.main.dao;

import java.util.List;

import ambodenis.main.entity.Product;

public interface ProductDAO {
	
	public List<Product> getProductList();
	
	public List<Product> getProductList(int orderBy);
	
	public void saveProduct(Product product);
	
	public void delete(int id);
	
	public Product getProduct(int id);
	
	public Product getProductWithTag(int id);
	
	public List<Product> getProductListByCategory(int id);
	
	public List<Product> getProductListByTag(int id);

}
