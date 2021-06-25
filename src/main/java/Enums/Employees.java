package Enums;

public enum Employees {
    EMPLOYEE1("Gastón", "De Maio", 42577538, "RRHH"),
    EMPLOYEE2("Carlos", "Dimaggio", 35351213, "Packagging");

    String name;
    String lastName;
    int id;
    String Section;

    Employees(String name, String lastName, int id, String Section) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.Section = Section;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public String getSection() {
        return Section;
    }
}
