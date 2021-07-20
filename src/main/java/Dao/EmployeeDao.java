package Dao;

import model.Person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static Dao.ConnectionPool.*;


public class EmployeeDao {
    private static final String SQL_SELECT = "SELECT id_person, name, lastName, age FROM person";
    private static final String SQL_INSERT = "INSERT INTO person (id_Person, name, lastName, age) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE person SET name = ?, lastName = ?, age = ? WHERE id_person = ?";
    private static final String SQL_DELETE = "DELETE FROM person WHERE id_person = ? ";

    public List<Person> select(){
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Person person = null;
        List<Person> persons = new ArrayList<>();

        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()){
                int idPerson = rs.getInt("id_person");
                String name = rs.getString("name");
                String lastName = rs.getString("lastName");
                int age = rs.getInt("age");

                person = new Person(idPerson, name, lastName, age);

                persons.add(person);
            }

        } catch (SQLException exception) {
            exception.printStackTrace(System.out);
        }
        finally {
            try {
                close(conn);
                close(stmt);
                close(rs);
            } catch (SQLException exception) {
                exception.printStackTrace(System.out);
            }
        }


        return persons;
    }

    public int insert(Person person){
        Connection conn = null;
        PreparedStatement stmt = null;
        int records = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setInt(1, person.getId());
            stmt.setString(1, person.getName());
            stmt.setString(2, person.getLastName());
            stmt.setInt(3, person.getAge());
            records = stmt.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace(System.out);
        }
        finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException exception) {
                exception.printStackTrace(System.out);
            }
        }
        return records;
    }

    public int update(Person person){
        Connection conn = null;
        PreparedStatement stmt = null;
        int records = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setInt(1, person.getId());
            stmt.setString(2, person.getName());
            stmt.setString(3, person.getLastName());
            stmt.setInt(4, person.getAge());
            records = stmt.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace(System.out);
        }
        finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException exception) {
                exception.printStackTrace(System.out);
            }
        }
        return records;
    }

    public int delete(Person person){
        Connection conn = null;
        PreparedStatement stmt = null;
        int records = 0;
        try {
            conn = getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, person.getId());
            stmt.setString(2, person.getName());
            stmt.setString(3, person.getLastName());
            stmt.setInt(4, person.getAge());
            records = stmt.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace(System.out);
        }
        finally {
            try {
                close(stmt);
                close(conn);
            } catch (SQLException exception) {
                exception.printStackTrace(System.out);
            }
        }
        return records;
    }
}
