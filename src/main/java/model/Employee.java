package model;

public class Employee extends Person {
    private int idEmployee;

    public Employee(String name, String lastName, int age, int id, int idEmployee){
        super(name, lastName, age, id);
        this.idEmployee = idEmployee;
    }

    @Override
    public String showDetails(){
        return super.showDetails() + ", idEmployee: " + this.idEmployee;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    @Override
    public String toString() {
        return "Employee{" + super.showDetails() +
                ", idEmployee=" + idEmployee +
                '}';
    }
}
