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
public class Customer extends People {

    String id, addres, idoder;
    int numberphone;

    public Customer() {
    }

    public Customer(String id, String name, String addres, int numberphone, String idoder) {
        this.id = id;
        this.name = name;
        this.addres = addres;
        this.numberphone = numberphone;
        this.idoder = idoder;
    }

   

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public int getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(int numberphone) {
        this.numberphone = numberphone;
    }

    public String getIdoder() {
        return idoder;
    }

    public void setIdoder(String idoder) {
        this.idoder = idoder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" + "ID= " + id + "name= " + name + "addres= " + addres + ", numberphone= " + numberphone + "Idoder" + idoder + '}';
    }
}
