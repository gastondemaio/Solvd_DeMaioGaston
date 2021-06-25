package model;

public class Product {
    private int idProduct;
    private String description;
    private Double price;
    private int quantity;

    public Product(int idProduct, String description, Double price, int quantity) {
        this.idProduct = idProduct;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String showDetailsOfItem(){
        return "idProduct " + idProduct + ", description " + description + ", price" + price + ", quantity " + quantity;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
