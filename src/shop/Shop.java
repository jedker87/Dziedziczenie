package shop;

import java.util.ArrayList;
import java.util.List;

import products.Product;

public class Shop {
	
private List<Product> products;

public Shop() {

	products = new ArrayList<>();
	
}

public void addProduct(Product c){
	products.add(c);
}

@Override
public String toString() {
	return "Shop products: \n" + products +  "";
}


}
