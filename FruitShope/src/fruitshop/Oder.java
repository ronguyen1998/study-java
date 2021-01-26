/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fruitshop;



public class Oder {

    String id, namefruit;
    int quantity, price, amount;

    public Oder() {
    }

    public Oder(String id, String namefruit, int quantity, int price, int amount) {
        this.id = id;
        this.namefruit = namefruit;
        this.quantity = quantity;
        this.price = price;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNamefruit() {
        return namefruit;
    }

    public void setNamefruit(String namefruit) {
        this.namefruit = namefruit;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Oder{" + "id= " + id + ", namefruit= " + namefruit + ", quantity= " + quantity + ", price= " + price + ", amount= " + amount + '}';
    }

}
