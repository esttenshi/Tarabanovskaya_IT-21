import java.text.NumberFormat;
import java.util.Scanner;

public class ShoppingCart {

    int itemCount; // Общее количество товаров в корзине
    double totalPrice; // Общая стоимость товаров в корзине
    int capacity; // Текущая вместимость тележки
    private Item[] cart; // Объявление переменной cart - массив товаров

    // Конструктов  - создает пустую корзину для покупок
    public ShoppingCart() {
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[capacity];
    }

    // Добавляет товар в корзину
    public void addToCart(String itemName, double price, int quantity) {

        Item newItem = new Item(itemName, price, quantity); // Создаем нового объекта класса Item - товара
        cart[itemCount] = newItem; // Добавление товара в массив cart по индексу
        itemCount++;
        totalPrice += price * quantity;
    }

    // Вывод содержимого корзины
    public String toString() {

        NumberFormat fmt = NumberFormat.getCurrencyInstance(); //используется для форматирования (приведение к денежному типу)
        String contents = "\nКорзина\n";
        contents += "\nТовар\t\tЦена за товар\t\tКоличество\t\tОбщая цена за товар\n";
        for (int i = 0; i < itemCount; i++){
            System.out.println(cart[i]);
            contents += cart[i].toString() + "\n";
        }
        contents += "\nОбщая цена: " + fmt.format(totalPrice);
        contents += "\n";
        return contents;
    }

    // Увеличивает вместимость корзины при необходимостм
    void increaseSize() {

        int newCapacity = capacity + 1; // Инициализация переменной - увеличение вместимости корзины
        Item[] newCart = new Item[newCapacity]; // Инициализация массива newCart - "новой" корзины

        for (int i = 0; i < itemCount; i++) {
            newCart[i] = cart[i];
        }

        cart = newCart; // Присваивание переменной cart нового массива (увеличенной корзины)
        capacity = newCapacity; // Присваивание переменной capacity нового значения (увеличенного кол-ва товаров в корзине)
    }
}
