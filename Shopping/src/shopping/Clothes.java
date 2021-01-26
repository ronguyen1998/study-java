

package shopping;

public class Clothes implements Comparable<Clothes> {
	private int id;
	private String name;
	private double price;
	private int quantity;

	public Clothes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Clothes(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	int getId() {
		return id;
	}

	String getName() {
		return name;
	}

	double getPrice() {
		return price;
	}

	int getQuantity() {
		return quantity;
	}

	void setId(int id) {
		this.id = id;
	}

	void setName(String name) {
		this.name = name;
	}

	void setPrice(double price) {
		this.price = price;
	}

	void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Clothes [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	@Override
	public int compareTo(Clothes o) {
		return this.id - o.getId();
	}
	
}