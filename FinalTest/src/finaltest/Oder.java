
package finaltest;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;


public class Oder implements IOrder {

    int id;
    String cname, caddres;
    int cid;
    LocalDate localdate;
    ArrayList<Product> lp;
    int quantity;
    double amount;
    
    public Oder() {
    }

    public Oder(int id, String cname, String caddres, int cid, LocalDate localdate, int quantity, double amount) {
        this.id = id;
        this.cname = cname;
        this.caddres = caddres;
        this.cid = cid;
        this.localdate = localdate;
        this.quantity = quantity;
        this.amount = amount;
    }

    
    
    public Oder(int id, String cname, String caddres, int cid, LocalDate localdate, ArrayList<Product> lp, int quantity, double amount) {
        this.id = id;
        this.cname = cname;
        this.caddres = caddres;
        this.cid = cid;
        this.localdate = localdate;
        this.lp = lp;
        this.quantity = quantity;
        this.amount = amount;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getAmount() {
        return amount;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setLocaldate(LocalDate localdate) {
        this.localdate = localdate;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCaddres() {
        return caddres;
    }

    public void setCaddres(String caddres) {
        this.caddres = caddres;
    }

    public int getCid() {
        return cid;
    }

    public LocalDate getLocaldate() {
        return localdate;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public ArrayList<Product> getLp() {
        return lp;
    }

    public void setLp(ArrayList<Product> lp) {
        this.lp = lp;
    }

}
