package Enums;

public enum Products {
    PRODUCT1("APPLES","APPLE: TASTY AND FIT", 1.50, 1),
    PRODUCT2("CANDIES","CANDIES: TASTY!", 1, 2);

    String name;
    String Description;
    double Price;
    int id;

    Products(String name, String description, double price, int id) {
        this.name = name;
        Description = description;
        Price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return Description;
    }

    public double getPrice() {
        return Price;
    }

    public int getId() {
        return id;
    }
}
