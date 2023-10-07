import java.util.ArrayList;
import java.util.Scanner;

public class Shop {

    public static void main(String[] args) {

        ArrayList<Item> cart = new ArrayList<>(); // Создание экземпляра cart - пустой список
        double totalPrice = 0.0; // Общая стоимость покупок
        Scanner scan = new Scanner(System.in);
        String keepShopping = "y";

        do {
            System.out.print("\nВведите название товара: ");
            String itemName = scan.nextLine();

            System.out.print("Введите цену за единицу: ");
            double itemPrice = scan.nextDouble();

            System.out.print("Введите количество: ");
            int quantity = scan.nextInt();

            scan.nextLine();

            Item item = new Item(itemName, itemPrice, quantity); // Создание нового товара
            cart.add(item); // Добавление товара в список

            // Вывод содержимого корзины
            System.out.println("\nТовары в корзине:");
            for (Item product: cart) { //цикл для вывода содержимого корзины (расширенный цикл for)
                System.out.println(product.toString()); //вызываем метод toString для каждого товара
                totalPrice += product.getPrice() * product.getQuantity(); //добавляем стоимость товаров к общей цене
            }

            System.out.println("\nОбщая стоимость: " + totalPrice);
            System.out.print("\nПродолжать покупки (y/n)? ");
            keepShopping = scan.nextLine();

        } while (keepShopping.equals("y"));
    }
}
