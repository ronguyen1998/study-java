
package shopping;

import java.time.LocalDate;
import java.util.ArrayList;

public class Shopping {
	ArrayList<Clothes> customerSelected;
	LocalDate dateCreated;
	int id;
	String name, address;

	public Shopping() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shopping(int id, String name, String address, LocalDate dateCreated, ArrayList<Clothes> customerSelected) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.dateCreated = dateCreated;
		this.customerSelected = customerSelected;
	}

	String getAddress() {
		return address;
	}

	ArrayList<Clothes> getCustomerSelected() {
		return customerSelected;
	}

	LocalDate getDateCreated() {
		return dateCreated;
	}

	int getId() {
		return id;
	}

	String getName() {
		return name;
	}

	void setAddress(String address) {
		this.address = address;
	}

	void setCustomerSelected(ArrayList<Clothes> customerSelected) {
		this.customerSelected = customerSelected;
	}

	void setDateCreated(LocalDate dateCreated) {
		this.dateCreated = dateCreated;
	}

	void setId(int id) {
		this.id = id;
	}

	void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Shopping [id=" + id + ", name=" + name + ", address=" + address + ", dateCreated=" + dateCreated
				+ ", customerSelected=" + customerSelected + "]";
	}

}
