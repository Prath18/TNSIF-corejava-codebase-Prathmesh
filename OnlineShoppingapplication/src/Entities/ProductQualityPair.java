package Entities;

public class ProductQualityPair {
    private Product product;
    private int quantity;

    public ProductQualityPair(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    // Getters
    public Product getProduct() { return product; }
    public int getQuantity() { return quantity; }

    @Override
    public String toString() {
        return "Product: " + product.getName() + ", Quantity: " + quantity;
    }
}