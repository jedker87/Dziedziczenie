package products;

public class Tablets extends Product {
	
	private double weight;
	private boolean gsm;
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public boolean isGsm() {
		return gsm;
	}
	public void setGsm(boolean gsm) {
		this.gsm = gsm;
	}
	@Override
	public String toString() {
		return "Tablets: \n[name=" + name + ", price=" + price + ", weight=" + weight + ", gsm=" + gsm + "]\n";
	}
	public Tablets(String name, double price, double weight, boolean gsm) {
		super(name, price);
		this.weight = weight;
		this.gsm = gsm;
	}
	


}
