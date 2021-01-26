
package finaltestkientruc;

import java.time.LocalDate;
import java.util.ArrayList;


public class Order implements IOrder{
    private int id;
    private LocalDate date;
    private String cName;
    private String cAddress;
    private int cId;
    private ArrayList<Product> lp;
    
    public Order(){
        
    }

    public Order(int id, LocalDate date, String cName, String cAddress, int cId) {
        //, ArrayList<Product> lp
        this.id = id;
        this.date = date;
        this.cName = cName;
        this.cAddress = cAddress;
        this.cId = cId;
        this.lp = new ArrayList<>();
        //this.lp = lp;
    }

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

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcAddress() {
        return cAddress;
    }

    public void setcAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public ArrayList<Product> getLp() {
        return lp;
    }

    public void setLp(ArrayList<Product> lp) {
        this.lp = lp;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", date=" + date + ", cName=" + cName + ", cAddress=" + cAddress + ", cId=" + cId + ", lp=" + lp + '}';
    }

    

}