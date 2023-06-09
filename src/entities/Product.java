package entities;

public class Product {
    public String name;
    public double price;
    public int quantity;
    public double TotalValueInStock() {
        double maxValue = quantity * price;
        System.out.printf(name + " ,$ " + price + " Units: " + quantity + " , Total: ", maxValue);
        return quantity * price;
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }
    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }
}
