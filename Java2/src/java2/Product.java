/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java2;

/**
 *
 * @author KimAnh
 */
public class Product {
    private String name;
    private String id;
    private double price;
    private int quanlity;    

    public Product() {
    }

    public Product(String name, String id, double price, int quanlity) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.quanlity = quanlity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuanlity() {
        return quanlity;
    }

    public void setQuanlity(int quanlity) {
        this.quanlity = quanlity;
    }

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", id=" + id + ", price=" + price + ", quanlity=" + quanlity + '}';
    }
    
}
