import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Shop {

    ArrayList<Item> items = new ArrayList<>(); // Создание объекта класса Item - Список покупок

    // Добавление товара
    public void addItem(Item item) {items.add(item);}

    // Удаление товара по id
    public void removeItem(int idItem) {
        int id = idItem - 1;
        try {
            Item isExists = items.get(id);
            items.remove(id);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Элемент с ключом " + id + " не найден");
        }
    }

    // Расчет общей стоимости товара
    public void getTotalCost(String name) {
        double totalCost = 0;
        for (Item item : items) {
            if (item.getName().equals(name)) {
                totalCost += item.getPrice() * item.getCount() * 1.13;
                System.out.println("\nОбщая стоимость товара " + name + " " + totalCost);
            }
        }
        if (totalCost == 0) {
            System.out.println("Товар с таким наименованием не найден");
        }
    }

    // Печать всего списка товаров
    public void printShop() {

        for (Item item : items) {
            System.out.println("Id: " + item.getId() + "; Название: " + item.getName()
                    + "; Цена: " + item.getPrice() + "; Дата прибытия: " + item.getArrivingDate()
                    + "; Количество: " + item.getCount());
        }
    }

    // Вывод на экран всех товаров, прибывших в определенную дату
    public void printItemsDate(Date date) {
        boolean hasItems = false;
        for (Item item : items) {
            if (item.getArrivingDate().equals(date)) {
                System.out.println("\nТовары, прибывшие в указанную дату:");
                System.out.println("Id: " + item.getId() + ", Название: " + item.getName()
                        + ", Цена: " + item.getPrice() + ", Количество: " + item.getCount());
                hasItems = true;
            }
        }
        if (!hasItems) {
            System.out.println("Товары, прибывшие в указанную дату, отсутствуют");
        }
    }

    public static void main(String[] args) throws ParseException {

        Shop shop = new Shop(); // Создание нового объекта класса Shop
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy"); // Создание объекта класса SimpleDateFormat

        Item item1 = new Item("Мороженое", 50.0, format.parse("03-05-2022"), 10, 1);
        Item item2 = new Item("Шоколад", 50.0, format.parse("05-05-2022"), 25, 2);

        shop.addItem(item1);
        shop.addItem(item2);

        shop.printShop();

        shop.removeItem(2);

        System.out.println("\nСписок товаров после удаления одного из:");

        shop.printShop();

        shop.printItemsDate(format.parse("03-05-2022"));

        shop.getTotalCost("Мороженое");
    }
}
