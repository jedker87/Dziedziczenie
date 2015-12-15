package products;

public class Computers extends Product{

	private int ram;
	private int monitorSize;

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getMonitorSize() {
		return monitorSize;
	}

	public void setMonitorSize(int monitorSize) {
		this.monitorSize = monitorSize;
	}

	public Computers(String name, double price, int ram, int monitorSize) {
		super(name,price);
		this.ram = ram;
		this.monitorSize = monitorSize;
	}

	@Override
	public String toString() {
		return "Computers: [name=" + name + ", price=" + price + ", ram=" + ram + ", monitorSize=" + monitorSize + "]\n";
	}
    
	
}
