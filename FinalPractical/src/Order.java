package FinalTest;

import java.time.LocalDate;
import java.util.ArrayList;

public class Order implements IOder {
	private int id;
	private LocalDate date;
	private String cname;
	private String caddress;
	private int cld;
	ArrayList<Product> lp;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public int getCld() {
		return cld;
	}

	public void setCld(int cld) {
		this.cld = cld;
	}

	public ArrayList<Product> getLp() {
		return lp;
	}

	public void setLp(ArrayList<Product> lp) {
		this.lp = lp;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", cname=" + cname + ", caddress=" + caddress + ", cld=" + cld
				+ ", lp=" + lp + "]";
	}

	public Order(int id, LocalDate date, String cname, String caddress, int cld, ArrayList<Product> lp) {
		super();
		this.id = id;
		this.date = date;
		this.cname = cname;
		this.caddress = caddress;
		this.cld = cld;
		this.lp = lp;
	}

	@Override
	public void shippingFee(ArrayList<Product> lp) {
		
	}

}
