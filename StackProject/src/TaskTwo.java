import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TaskTwo {

    public static void task(Stack<Integer> stack) {

        Queue<Integer> queue = new LinkedList<>(); // Создание объекта класса Queue
        Stack<Integer> newStack = new Stack<>(); // Создание объекта - измененный стек

        while (!stack.isEmpty()) { // Пока стек не опустошится
            int curr = stack.pop(); // Инициализируем переменную - значение на верхушке изначального стека и удаляем его
            newStack.add(curr); // Дважды добавляем значение в очередь
            newStack.add(curr);
        }

        while (!newStack.isEmpty()) { // Пока не опустошится новый стек
            int curr = newStack.pop(); // Инициализируем переменную - значение на верхушке нового стека и удаляем его
            queue.add(curr); // Добавляем значение curr в очередь
        }

        while (!queue.isEmpty()) { // Пока очередь не опустошится
            stack.push(queue.remove()); // Добавляем элемент с начала очереди и удаляем его (начинает с начала)
        }
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>(); // Cоздаем объект класса Stack

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
