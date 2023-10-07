import java.text.NumberFormat;
import java.util.Scanner;

public class ShoppingCartApp {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart(); // Cоздание объекта cart класса ShoppingCart
        Scanner scanner = new Scanner(System.in); // Создание объекта Scanner для считывания строк
        String input = "Да";

        do {
            System.out.print("\nВведите название товара: ");
            String itemName = scanner.nextLine();

            System.out.print("Введите цену товара: ");
            double price = scanner.nextDouble();

            System.out.print("Введите количество товара: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            cart.addToCart(itemName, price, quantity); // Используем метод для добавления товара в корзину

            System.out.println(cart.toString());

            // Увеличение размера корзины
            if (cart.itemCount == cart.capacity) { // Сравнивает кол-во товаров в корзине с вмещаемым кол-вом (если размер корзины достигнул лимита, используется метод для увеличения объема корзины (увеличение длины массива))
                cart.increaseSize();
            }

            System.out.print("Хотите добавить еще товары? (Да/Нет): ");
            input = scanner.nextLine();

        } while (input.equalsIgnoreCase("Да"));

        double total = cart.totalPrice; // Инициализация переменной - общий счет за товар
        NumberFormat fmt = NumberFormat.getCurrencyInstance(); // Используется для форматирования (приведение к денежному типу)
        System.out.print("\nПожалуйста, оплатите: " + fmt.format(total));
    }
}


