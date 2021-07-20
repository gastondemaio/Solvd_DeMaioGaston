package Dao;

import model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import static Dao.ConnectionPool.*;


public class ProductDao {
    private static final String SQL_SELECT = "SELECT id_person, name, lastName, cellphone, email FROM person";
    private static final String SQL_INSERT = "INSERT INTO person (name, lastName, cellphone, email) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE person SET name = ?, lastName = ?, cellphone = ?, email = ? WHERE id_person = ?";
    private static final String SQL_DELETE = "DELETE FROM person WHERE id_person = ? ";

    public List<Product> getProducts(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Product product = null;
        List<Product> products = new ArrayList<>();

        try(Connection conn = getConnection()) {
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()){
                int idProduct = rs.getInt("id_person");
                String description = rs.getString("description");
                double price = rs.getInt("price");
                long quantity = rs.getLong("quantity");
                long code = rs.getLong("codeBar");
                product = new Product(idProduct, description, price, quantity, code);
                products.add(product);
            }
        } catch (SQLException exception) {
            exception.printStackTrace(System.out);
        }



        return products;
    }

    public int addProduct(Product product){
        PreparedStatement stmt = null;
        int records = 0;
        try(Connection conn = getConnection()) {
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, product.getIdProduct());
            stmt.setString(2, product.getDescription());
            stmt.setDouble(3, product.getPrice());
            stmt.setLong(4, product.getQuantity());
            stmt.setLong(5, product.getCode());
            records = stmt.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace(System.out);
        }
        return records;
    }

    public int updateProduct(Product product){
        PreparedStatement stmt = null;
        int records = 0;
        try(Connection conn = getConnection()) {
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, product.getIdProduct());
            stmt.setString(2, product.getDescription());
            stmt.setDouble(3, product.getPrice());
            stmt.setLong(4, product.getQuantity());
            stmt.setLong(5, product.getCode());
            records = stmt.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace(System.out);
        }
        return records;
    }

    public int deleteProduct(Product product){
        PreparedStatement stmt = null;
        int records = 0;
        try(Connection conn = getConnection()) {
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, product.getIdProduct());
            stmt.setString(2, product.getDescription());
            stmt.setDouble(3, product.getPrice());
            stmt.setLong(4, product.getQuantity());
            stmt.setLong(5, product.getCode());
            records = stmt.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace(System.out);
        }
        return records;
    }
}
