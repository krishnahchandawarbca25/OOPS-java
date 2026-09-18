/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inherit;

/**
 *
 * @author RVUW275
 */
class Product {
    protected String productId;
    protected String name;
    protected double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Product ID  : " + productId);
        System.out.println("Name        : " + name);
        System.out.println("Base Price  : $" + price);
    }
}
class ElectronicProduct extends Product {
    private int warrantyPeriodInMonths;
    private String brand;
    public ElectronicProduct(String productId, String name, double price, String brand, int warrantyPeriodInMonths) {
        super(productId, name, price);
        this.brand = brand;
        this.warrantyPeriodInMonths = warrantyPeriodInMonths;
    }
    public double calculateDiscountedPrice(double discountPercentage) {
        double discountAmount = (discountPercentage / 100) * this.price; 
        return this.price - discountAmount;
    }
    @Override
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Brand       : " + brand);
        System.out.println("Warranty    : " + warrantyPeriodInMonths + " months");
    }
    public void displayFullInvoice(double discountPercentage) {
        System.out.println("--- Electronic Product Details ---");
        displayDetails();
        double finalPrice = calculateDiscountedPrice(discountPercentage);
        System.out.println("Discount    : " + discountPercentage + "%");
        System.out.println("Final Price : $" + finalPrice);
        System.out.println("---------");
    }
}
public class Main {
    public static void main(String[] args) {
        ElectronicProduct laptop = new ElectronicProduct("EP1023", "MacBook Pro", 1999.99, "Apple", 12);
        laptop.displayFullInvoice(15.0);
    }
}


