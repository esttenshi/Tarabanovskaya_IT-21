import java.text.NumberFormat;

public class Item {

    String name; // Имя товара
    double price; // Цена товара
    int quantity; // Кол-во товара

    // Конструктор для создания нового объекта - товара
    public Item(String itemName, double itemPrice, int numPurchased) {
        name = itemName; //имя
        price = itemPrice; //цена
        quantity = numPurchased; //кол-во
    }

    // Метод возвращает информацию о товаре
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t"
                + fmt.format(price * quantity)); //имя + цена + кол-во + общий счет за товар (цена * кол-во)
    }


    public double getPrice() {
        return price;
    }

    // Метод возвращает название товара
    public String getName() {
        return name;
    }

    // Возвращает количество товара
    public int getQuantity() {
        return quantity;
    }

}

