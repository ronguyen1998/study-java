/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fruitshop;


/**
 *
 * @author Admin
 */
public class Fruit {

    String id, name, origin;
    int price;

    public Fruit() {
    }

    public Fruit(String id, String name, String origin, int price) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Fruit{" + "id=" + id + ", name=" + name + ", origin=" + origin + ", price=" + price + '}';
    }

}
