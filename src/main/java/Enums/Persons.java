package Enums;

public enum Persons {
    PERSON1("Gastón", "De Maio", 42577538),
    PERSON2("Lucía", "Cerutti", 43518324);

    String name;
    String lastName;
    int id;

    Persons(String name, String lastName, int id) {
        this.name = name;
        this.lastName = lastName;
        this.id = id;
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
}
