package model;
 /*class Ticket extends Product{
    private int id_Ticket;

    public Ticket(int idProduct, String description, Double price, int quantity, int id_Ticket) {
        super(idProduct, description, price, quantity);
        this.id_Ticket = id_Ticket;

    }

    public int getId_Ticket() {
        return id_Ticket;
    }
    @Override
    public String showDetailsOfItem(){
        return super.showDetailsOfItem() + ", id_Ticket " + this.id_Ticket;
    }

    @Override
    public String toString() {
        return
                "Ticket{" + super.showDetailsOfItem() +
                ", id_Ticket=" + id_Ticket +
                '}';
    }
}
