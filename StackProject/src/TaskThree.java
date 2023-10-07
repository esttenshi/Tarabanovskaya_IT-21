import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TaskThree {

    public static void task(Stack<Integer> stack) {

        Stack<Integer> newStack = new Stack<>();

        // Записываем в новый стек значения из изначального стека (переворачиваем)
        while (!stack.isEmpty()) {
            newStack.add(stack.pop());
        }

        // Записываем в изначальный стек значения суммы элементов
        while (!newStack.isEmpty()) {
            if (newStack.size() >= 2) {
                int first = newStack.pop();
                int second = newStack.pop();
                stack.add(first + second);
            } else {
                stack.add(newStack.pop());
            }
        }
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>(); // Создаем объект класса Stack

        stack.push(3); // Добавляем новые элементы
        stack.push(7);
        stack.push(1);
        stack.push(14);
        stack.push(9);

        System.out.println("\nИзначальный стек: " + stack);

        task(stack);

        System.out.println("Новый стек: " + stack);
    }

}