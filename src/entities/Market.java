package entities;

import java.util.ArrayList;
import java.util.List;

public class Market {
	private List<Product> products = new ArrayList<>();
	private List<Costumer> costumers = new ArrayList<>();
	
	public Market() {
		
	}

	
	public List<Product> getProducts() {
		return products;
	}


	public List<Costumer> getCostumers() {
		return costumers;
	}



	public void addProduct(Product product) {
		products.add(product);
	}
	
	public void removeProduct(Product product) {
		products.remove(product);
	}
	
	public void addCostumer(Costumer costumer) {
		costumers.add(costumer);
	}
	
	public void removeCostumer(Costumer costumer) {
		costumers.remove(costumer);
	}
	
	

}
