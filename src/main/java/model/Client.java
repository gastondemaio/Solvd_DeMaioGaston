package model;

public class Client extends Person{
    private int idClient;

    public Client(String name, String lastName,int age, int id, int idClient){
        super(name, lastName, age, id);
        this.idClient = idClient;
    }

    @Override
    public String showDetails(){
        return super.showDetails() + ", idClient: " + this.idClient;
    }

    public int getIdClient() {
        return idClient;
    }
}

