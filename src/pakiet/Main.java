 package pakiet;

import products.Computers;
import products.Mobiles;
import products.Tablets;
import shop.Shop;

public class Main {

	public static void main(String[] args) {

	Computers CPU1 = new Computers("HP", 3000.0, 4, 15);
	Tablets galaxy = new Tablets("Samsung", 2000.0, 20, true);
	Mobiles htc = new Mobiles("htc", 1500.0, 8, true);
	Mobiles huawei = new Mobiles("huawei", 900, 5, false);
	
//	System.out.println(CPU1);
	
	Shop myShop = new Shop();
	
	myShop.addProduct(CPU1);
	myShop.addProduct(galaxy);
	myShop.addProduct(htc);
	myShop.addProduct(huawei);
	
	System.out.println(myShop);//dolozyc nowy produkt i przeedytowac
	
	}

}
