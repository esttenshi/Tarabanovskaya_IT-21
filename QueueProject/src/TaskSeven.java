import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TaskSeven {

    Stack<Integer> reverseQueue = new Stack<>();
    int count = 0;

    public void reverse(Queue<Integer> queue) {
        while (count != queue.size()) {
            int element = queue.poll();
            reverseQueue.add(element);
            queue.add(element);
            count += 1;
        }
    }

    public void palindrom(Queue<Integer> queue) {
        while (!queue.isEmpty()) {
            int firstStack = reverseQueue.pop();
            int secondQueue = queue.remove();

            if (firstStack != secondQueue) {
                System.out.println("Очередь элементов - не палиндром");
                System.exit(0);
            }
        }
        System.out.println("Данная очередь - палиндром");
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(Arrays.asList(1, 2, 3, 2, 1));

        TaskSeven work = new TaskSeven();

        work.reverse(queue);
        System.out.println("\nОчередь: " + queue);
        work.palindrom(queue);

    }
}
