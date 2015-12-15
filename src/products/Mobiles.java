package products;

public class Mobiles extends Product {

private int camera;
private boolean android;
public int getCamera() {
	return camera;
}
public void setCamera(int camera) {
	this.camera = camera;
}
public boolean isAndroid() {
	return android;
}
public void setAndroid(boolean android) {
	this.android = android;
}

public Mobiles(String name, double price, int camera, boolean android) {
	super(name, price);
	this.camera = camera;
	this.android = android;
}
@Override
public String toString() {
	return "Mobiles: \n[name=" + name + ", price=" + price + ", camera=" + camera + ", android=" + android + "]\n";
}

}
