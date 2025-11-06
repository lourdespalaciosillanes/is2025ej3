package is2025.ut4.productapi.domain;

public class Product {
    private String code;
    private String description;
    private double price;
    private int stock;
    private double tax;
    private double finalPrice;

    public Product() {}

    public Product(String code, String description, double price, int stock, double tax) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.stock = stock;
        this.tax = tax;
    }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }


    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getFinalPrice()
    {
        finalPrice = price * tax;
        return finalPrice;
    }
}
