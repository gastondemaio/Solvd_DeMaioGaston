import model.Employee;
import model.Person;
import model.Product;
import model.Ticket;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String newDate = sdf.format(date);
        System.out.println(newDate);


        ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
        ArrayList<Product> listOfProducts = new ArrayList<Product>();
        ArrayList<Ticket> listOfTickets = new ArrayList<Ticket>();
        ArrayList<Person> listOfPersons = new ArrayList<Person>();

        Person p1 = new Person("Gaston", "De Maio", 21,  42577538);
        Employee e1 = new Employee("Gaston", "De Maio", 21, 42577538, 123);
        Product pr1 = new Product(1, "Apple", 1.50, 2);
        Ticket t1 = new Ticket(1, "Apple", 1.50,  2, 1);
        listOfPersons.add(p1);
        listOfEmployees.add(e1);
        listOfProducts.add(pr1);
        listOfTickets.add(t1);

        for(int i=0; i<listOfPersons.size() && i<listOfEmployees.size() && i<listOfProducts.size() && i<listOfTickets.size(); i++){
            System.out.println(listOfPersons.get(i));
            System.out.println(listOfEmployees.get(i));
            System.out.println(listOfProducts.get(i));
            System.out.println(listOfTickets.get(i));

        }
    }

}
