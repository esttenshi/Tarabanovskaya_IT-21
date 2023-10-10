import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TaskSix {

    static Stack<Double> firstStack = new Stack<>();   // Стек для входящих элементов
    static Stack<Double> secondStack = new Stack<>();  // Стек для исходящих элементов

    public void addElementOne(double element) {firstStack.push(element);}
    public void addElementTwo(double element) {secondStack.push(element);}

    static Queue<Double> queue = new LinkedList<>();

    public void createQueue() {
        Queue<Double> newQueue = new LinkedList<>(secondStack);
        System.out.println(newQueue);
        while (!firstStack.isEmpty()) {
            queue.add(firstStack.pop());
        }
        while (!newQueue.isEmpty()) {
            queue.add(newQueue.remove());
        }
    }

    public static void main(String[] args) {

        TaskSix elements = new TaskSix();

        elements.addElementOne(1.5);
        elements.addElementOne(2.7);
        elements.addElementOne(3.1);

        elements.addElementTwo(4.9);
        elements.addElementTwo(1.7);
        elements.addElementTwo(0.5);

        System.out.println("Первый стек: " + firstStack);
        System.out.println("Второй стек: " + secondStack);

        elements.createQueue();
        System.out.println("Очередь " + queue);



    }
}