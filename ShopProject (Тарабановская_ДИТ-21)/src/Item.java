import java.util.Date;

public class Item {

    String name;
    double price;
    Date arrivingDate;
    int count;
    int id;

    public Item(String name, double price, Date arrivingDate, int count, int id) {
        this.name = name;
        this.price = price;
        this.arrivingDate = arrivingDate;
        this.count = count;
        this.id = id;
    }

    public int getId() {return id;}
    public String getName() {return name;}
    public double getPrice() {return price;}
    public Date getArrivingDate() {return arrivingDate;}
    public int getCount() {return count;}

}
