package ua.kiev.prog;

public class Order {
    private String name;
    private String address;
    private String item;
    private double price;

    public Order(String name, String address, String item, double price) {
        this.name = name;
        this.address = address;
        this.item = item;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + address + ", " + item + ", " + price + "]";
    }
}


