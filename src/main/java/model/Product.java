package model;

public class Product {
    private int idProduct;
    private String description;
    private Double price;
    private long quantity;
    private long code;

    public Product(int idProduct, String description, Double price, long quantity, long code) {
        this.idProduct = idProduct;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.code = code;
    }

    public String showDetailsOfItem(){
        return "idProduct " + idProduct + ", description " + description + ", price" + price + ", quantity " + quantity + ", code" + code;
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

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Product{" +
                "idProduct='" + idProduct + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", code=" + code +
                '}';
    }
}
