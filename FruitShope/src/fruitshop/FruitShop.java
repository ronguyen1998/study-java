/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fruitshop;


import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class FruitShop {

    static Fruit fruit;
    static Customer customer;
    static Oder oder;
    static ArrayList<Fruit> arrfruit = new ArrayList<>();
    static ArrayList<Customer> arrcustomer = new ArrayList<>();
    static ArrayList<Oder> arroder = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<Fruit> arrfruit = new ArrayList<>();
        ArrayList<Customer> arrcustomer = new ArrayList<>();
        ArrayList<Oder> arroder = new ArrayList<>();
        while (true) {
            switch (menu()) {
                case 1:
                    menuFruit(arrfruit, arrcustomer, arroder);
                    break;
                case 2:
                    menuCustomer(arrfruit, arrcustomer, arroder);
                    break;
                case 3:
                    return;
            }
        }
    }

//    public static void menumain(ArrayList<Fruit> fruit,ArrayList<Customer> customer,ArrayList<Oder> oder) {
//        while (true) {
//            switch (menu()) {
//                case 1:
//                    menuFruit(fruit,customer,oder);
//                    break;
//                case 2:
//                    menuCustomer(fruit,customer,oder);
//                    break;
//                case 3:
//                    return;
//            }
//        }
//    }
    public static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Menu Fruit");
        System.out.println("2. Menu Customer");
        System.out.println("3. Exits");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputLimit(1, 3);
        return choice;
    }

    public static void menuFruit(ArrayList<Fruit> fruit, ArrayList<Customer> customer, ArrayList<Oder> oder) {
        while (true) {
            switch (menufruit()) {
                case 1:
                    fruit.add(addFruit(fruit));
                    break;
                case 2:
                    updateFruit(fruit);
                    break;
                case 3:
                    deleteFruit(fruit);
                    break;
                case 4:
                    // menumain(fruit,customer,oder);
                    return;
                case 5:
                    searchFruit(fruit);
                    break;
            }
        }
    }

    public static int menufruit() {
        System.out.println("1. Add Fruit");
        System.out.println("2. Update Fruit");
        System.out.println("3. Delete Fruit");
        System.out.println("4. Exits");
        System.out.println("5. Search Fruit");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputLimit(1, 5);
        return choice;
    }

    public static void menuCustomer(ArrayList<Fruit> fruit, ArrayList<Customer> customer, ArrayList<Oder> oder) {
        while (true) {
            switch (menucustomer()) {
                case 1:
                    customer.add(addCustomer(customer));
                    break;
                case 2:
                    oder.add(addOder(fruit, customer, oder));
                    break;
                case 3:
                    updateOder(fruit, customer, oder);
                    break;
                case 4:
                    deleteOder(fruit, customer, oder);
                    break;
                case 5:
                    return;
            }
        }
    }

    public static int menucustomer() {
        System.out.println("1. Add Customer");
        System.out.println("2. Add Oder");
        System.out.println("3. Update Oder");
        System.out.println("4. Delete Oder");
        System.out.println("5. Exits");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkInputLimit(1, 5);
        return choice;
    }

    public static Customer addCustomer(ArrayList<Customer> o) {
        String id, name, addres;
        int phone;
        System.out.print("ID Customer: ");
        id = Validation.checkStringInput();
        System.out.print("Name Customer: ");
        name = Validation.checkStringInput();
        System.out.print("Addres Customer: ");
        addres = Validation.checkStringInput();
        System.out.print("Phone Customer: ");
        phone = Validation.checkIntInput();
        System.out.println("Oder: ");
        Customer c = new Customer(id, name, addres, phone, "");
        return c;
    }

    public static Oder addOder(ArrayList<Fruit> fruit, ArrayList<Customer> customer, ArrayList<Oder> oder) {
        String id, namefruit, idcustomer;
        int quantity, price, amount;
        Scanner scanner = new Scanner(System.in);

        showListfruit(fruit);
        System.out.print("Enter ID Customer: ");
        idcustomer = Validation.checkStringInput();
        if (checkCustomer(customer, idcustomer)) {
            System.out.println("Not found Customer !");
        } else {
            Customer ct = getCustomer(customer, idcustomer);

            System.out.print("Enter ID you choose: ");
            String temp = scanner.nextLine();
            if (checkCodeFruit(fruit, temp)) {
                System.out.println("Not found Fruit !");
            } else {
                Fruit ft = getFruit(fruit, temp);
                System.out.print("Enter ID Oder: ");
                id = Validation.checkStringInput();
                namefruit = ft.getName();
                System.out.print("Name fruit you choose: " + namefruit);
                price = ft.getPrice();
                System.out.print("Price fruit you choose: " + price);
                System.out.print("Enter Quantity Fruit: ");
                quantity = Validation.checkIntInput();
                amount = price * quantity;
                System.out.print("Amount you need to pay: " + amount);

                System.out.print("Do you want continue ? Y/N");
                if (checkYN().equalsIgnoreCase("Y")) {
                    Oder od = new Oder(id, namefruit, quantity, price, amount);
                    ct.setIdoder(id);
                    System.out.println();
                    return od;
                }
            }
        }
        return null;
    }

    public static void updateOder(ArrayList<Fruit> fruit, ArrayList<Customer> customer, ArrayList<Oder> oder) {
        Scanner scanner = new Scanner(System.in);
        String id, namefruit;
        int price, quantity, amount;

        System.out.print("Enter ID Customer: ");
        String idcustomer = Validation.checkStringInput();
        if (checkCustomer(customer, idcustomer)) {
            System.out.println("Not found Customer !");
        } else {
            Customer ct = getCustomer(customer, idcustomer);
            String temp = ct.getIdoder();
//            System.out.print("Enter ID Oder: ");
//            String temp = Validation.checkStringInput();
            if (checkOder(oder, temp)) {
                System.out.println("Not found Oder !");
            } else {
                showListfruit(fruit);

                System.out.print("Enter ID you choose: ");
                String idfruit = scanner.nextLine();
                if (checkCodeFruit(fruit, idfruit)) {
                    System.out.println("Not found Fruit !");
                } else {
                    Fruit ft = getFruit(fruit, idfruit);
                    System.out.print("Enter ID Oder: ");
                    id = Validation.checkStringInput();
                    namefruit = ft.getName();
                    System.out.print("Name fruit you choose: " + namefruit);
                    price = ft.getPrice();
                    System.out.print("Price fruit you choose: " + price);
                    System.out.print("Enter Quantity Fruit: ");
                    quantity = Validation.checkIntInput();
                    amount = price * quantity;
                    System.out.print("Amount you need to pay: " + amount);

                    System.out.print("Do you want continue ? Y/N");
                    if (checkYN().equalsIgnoreCase("Y")) {
                        Oder od = getOder(oder, temp);
                        od.setId(id);
                        od.setNamefruit(namefruit);
                        od.setPrice(price);
                        od.setQuantity(quantity);
                        od.setAmount(amount);
                        ct.setIdoder(id);

                        System.out.println("OK !");
                    }

                }

            }
        }
    }

    public static void deleteOder(ArrayList<Fruit> fruit, ArrayList<Customer> customer, ArrayList<Oder> oder) {

        System.out.print("Enter ID Customer: ");
        String code = Validation.checkStringInput();
        if (checkCustomer(customer, code)) {
            System.out.println("Not found Customer !");
        } else {
            Customer ct = getCustomer(customer, code);
            String temp = ct.getIdoder();
            if (checkOder(oder, temp)) {
                System.out.println("Not found Oder !");
            } else {

                oder.remove(getOder(oder, temp));
                ct.setIdoder("");
            }
        }
    }

    public static void showListfruit(ArrayList<Fruit> o) {
        if (o.size() == 0) {
            System.out.println("List Null !");
        } else {
            System.out.println("ID" + "NameFruit" + "Origin" + "Price");
            for (int i = 0; i < o.size(); i++) {
                System.out.print("\t");
                System.out.print(o.get(i).getId());
                System.out.print("\t");
                System.out.print(o.get(i).getName());
                System.out.print("\t");
                System.out.print(o.get(i).getOrigin());
                System.out.print("\t");
                System.out.print(o.get(i).getPrice());
                System.out.print("\n");
            }
        }
    }

    public static Fruit addFruit(ArrayList<Fruit> o) {
        String id, name, origin;
        int price;

        System.out.print("ID Fruit: ");
        id = Validation.checkStringInput();
        System.out.print("Name Fruit: ");
        name = Validation.checkStringInput();
        System.out.print("Origin Fruit: ");
        origin = Validation.checkStringInput();
        System.out.print("Price Fruit: ");
        price = Validation.checkIntInput();

        Fruit fruit = new Fruit(id, name, origin, price);
        return fruit;
    }

    public static void updateFruit(ArrayList<Fruit> o) {
        Scanner scanner = new Scanner(System.in);

        String idtemp, nametemp, origintemp;
        int pricetemp;

        System.out.print("Enter ID: ");
        String code = scanner.nextLine();

        if (checkCodeFruit(o, code)) {
            System.err.println("Not found ID !");
            return;
        } else {
            System.out.print("Enter new ID: ");
            idtemp = Validation.checkStringInput();
            System.out.print("Enter new Name: ");
            nametemp = Validation.checkStringInput();
            System.out.print("Enter new Origin: ");
            origintemp = Validation.checkStringInput();
            System.out.print("Enter new Price: ");
            pricetemp = Validation.checkIntInput();

            Fruit fruit = getFruit(o, code);
            fruit.setId(idtemp);
            fruit.setName(nametemp);
            fruit.setOrigin(origintemp);
            fruit.setPrice(pricetemp);
            System.out.println("OK !");
        }
    }

    public static void deleteFruit(ArrayList<Fruit> o) {
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();

        if (checkCodeFruit(o, id)) {
            System.err.println("Not found ID !");
        } else {
            Fruit fruit = getFruit(o, id);
            o.remove(fruit);
            System.out.println("OK !");
        }
    }

    public static boolean checkCodeFruit(ArrayList<Fruit> o, String code) {
        for (Fruit fruit : o) {
            if (fruit.getId().equalsIgnoreCase(code)) {
                return false;
            }
        }
        return true;
    }

    public static Fruit getFruit(ArrayList<Fruit> o, String code) {
        for (Fruit fruit : o) {
            if (fruit.getId().equalsIgnoreCase(code)) {
                return fruit;
            }
        }
        return null;
    }

    public static boolean checkCustomer(ArrayList<Customer> o, String code) {
        for (Customer customer : o) {
            if (customer.getid().equalsIgnoreCase(code)) {
                return false;
            }
        }
        return true;
    }

    public static Customer getCustomer(ArrayList<Customer> o, String code) {
        for (Customer customer : o) {
            if (customer.getid().equalsIgnoreCase(code)) {
                return customer;
            }
        }
        return null;
    }

    public static boolean checkOder(ArrayList<Oder> o, String code) {
        for (Oder oder : o) {
            if (oder.getId().equalsIgnoreCase(code)) {
                return false;
            }
        }
        return true;
    }

    public static Oder getOder(ArrayList<Oder> o, String code) {
        for (Oder oder : o) {
            if (oder.getId().equalsIgnoreCase(code)) {
                return oder;
            }
        }
        return null;
    }

    public static void searchFruit(ArrayList<Fruit> o) {
        String code = Validation.checkStringInput();

        if (checkCodeFruit(o, code)) {
            System.err.println("Not found Fruit  !");
        } else {
            Fruit fruit = getFruit(o, code);
            System.out.println(fruit);
        }
    }

    public static void showcustomer(ArrayList<Customer> o) {
        String code = Validation.checkStringInput();

        if (checkCustomer(o, code)) {
            System.err.println("Not found Customer !");
        } else {
            Customer ct = getCustomer(o, code);
            System.out.println(ct);
        }
    }

    public static String checkYN() {
        String result = Validation.checkStringInput();
        if (result.equalsIgnoreCase("y")) {
            return "Y";
        } else {
            return "N";
        }
    }
}
