import java.util.Scanner;

public class Sales {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // Создание объекта класса Scanner - для считывания строк
        System.out.print("\nВведите количество продавцов: ");
        int salesPeople = scan.nextInt(); // Инициализация переменной salesPeople - кол-во продавцов
        int[] sales = new int[salesPeople];  // Создание массива с вместимостью = кол-во продавцов
        int sum = 0; // Инициализация суммы объема продаж всех продавцов

        // Ввод объема продаж для каждого продавца
        for (int i = 0; i < sales.length; i++) {
            System.out.print("\nВведите объем продаж для продавца " + (i + 1) + ": ");
            sales[i] = scan.nextInt(); //присваиваем элементу с индексом i (продавец) значение объема продаж
        }

        System.out.println("\nПродажи продавца");
        System.out.println("--------------------");

        int max = sales[0]; // В кач-ве мин. элемента используем первое значение массива для дальнейшего сравнения
        int min = sales[0]; // В кач-ве макс. элемента используем первое значение массива для дальнейшего сравнения
        int idMax = 0; // Инициализация переменной, которой далее присваивается индекс (продавец) с наибольшим объемом продаж
        int idMin = 0; // Инициализация переменной, которой далее присваивается индекс (продавец) с наименьшим объемом продаж

        // Вывод и сравнение объема продаж каждого продавца
        for (int i = 0; i < sales.length; i++) {
            System.out.println(" " + (i + 1) + " " + sales[i]);
            sum += sales[i];

            if (sales[i] > max) {
                max = sales[i];
                idMax = i + 1;
            }

            if (sales[i] < min) {
                min = sales[i];
                idMin = i + 1;
            }
        }

        System.out.println("\nОбщие продажи: " + sum);
        System.out.println("\nСредний объем продаж: " + (sum / salesPeople));
        System.out.println("\nПродавец " + idMax + " совершил самую большую продажу на " + max + " руб.");
        System.out.println("\nПродавец " + idMin + " совершил самую малую продажу на " + min + " руб.");

        System.out.print("\nВведите целочисленное значение (значение продаж): ");
        int newValue = scan.nextInt();
        int count = 0; // Инициализация переменной - счетчика продавцов, чьи продажи превысили заданное значение
        System.out.println("\nПродавцы с продажами выше " + newValue + ":");

        // Счет продавцов, объемы продаж которых превысили заданное значение
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > newValue) {
                System.out.println("    Продавец " + (i + 1) + ": " + sales[i] + " руб.");
                count++;
            }
        }
        System.out.println("\nВсего продавцов, продажи которых превысили указанное значение: " + count);
    }
}
