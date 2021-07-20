/*import model.Employee;
import model.Person;
import model.Product;
import model.Ticket;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
        ArrayList<Ticket> listOfTickets = new ArrayList<Ticket>();
        ArrayList<Person> listOfPersons = new ArrayList<Person>();

        Person p1 = new Person("Gaston", "De Maio", 21, 42577538);
        Employee e1 = new Employee("Gaston", "De Maio", 21, 42577538, 123);
        Product pr1 = new Product(1, "Apple", 1.50, 2);
        Product pr2 = new Product(2, "Bananas", 0.80, 2);
        Product pr3 = new Product(3, "Pie", 5.0, 2);
        Product pr4 = new Product(4, "Potatoes", 1.30, 2);
        Ticket t1 = new Ticket(1, "Apple", 1.50, 2, 1);

        List<Product> products = new ArrayList<>(
            Arrays.asList(new Product[] {pr1, pr2, pr3, pr4})
        );

        ArrayList<Product> cheapProduct = (ArrayList<Product>) products.stream()
                .filter((Product product) ->{
                    return product.getPrice() < 2;
                })
                .collect(Collectors.toList());

        System.out.println(cheapProduct);
    }


}
