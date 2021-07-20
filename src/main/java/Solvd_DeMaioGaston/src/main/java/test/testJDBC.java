package test;

import Dao.ProductDao;
import model.Person;
import model.Product;

public class testJDBC {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();

        Product newProduct = new Product(123456, "Big apples", 2.00, 15, 156123);
        productDao.addProduct(newProduct);
    }
}
