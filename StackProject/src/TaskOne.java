import java.util.Stack;

public class TaskOne {

    public static void task(Stack<Integer> stack) {

        double min = Double.MAX_VALUE;
        Stack<Integer> newStack = new Stack<>(); // Создание объекта - измененный стек

        while (!stack.isEmpty()) { // Пока не опустошится изначальный стек
            int curr = stack.pop(); // Инициализируем переменную - значение на верхушке изначального стека и удаляем его (начинает с конца)
            newStack.push(curr); // Добавляем значение curr в новый стек
            min = Math.min(min, curr); // Сравниваем значения, присваиваем минимальное значение

        }

        while (!newStack.isEmpty()) { // Пока не опустошится новый стек
            int curr = newStack.pop(); // Инициализируем переменную - значение на верхушке нового стека и удаляем его
            stack.push(curr); // Добавляем значение curr в изначальный стек
            if (curr == min) stack.push(0); // Если мы дошли до минимального значения, добавляем в изначальный стек значение 0
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
