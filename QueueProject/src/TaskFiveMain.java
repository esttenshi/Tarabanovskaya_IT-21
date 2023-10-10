import java.util.ArrayDeque;
import java.util.Deque;

public class TaskFiveMain {
    public static void main(String[] args) {

        Deque<TaskFive> deque = new ArrayDeque<>();

        deque.add(new TaskFive(1.2, 2.3, 3.4));
        deque.add(new TaskFive(4.5, 5.6, 6.7));
        deque.add(new TaskFive(7.8, 8.9, 9.0));
        deque.add(new TaskFive(7.2, 8.1, 6.0));

        System.out.println("\nЭлементы дека до удаления: " +  deque);

        double limit = 7.5;
        System.out.println("Лимит: " +  limit);

        for (TaskFive  item : deque) {
            if ((item.getFirst() > limit) && (item.getSecond() > limit) && (item.getThird() > limit)) {
                deque.remove();
            } else {
                deque.remove();
                deque.add(item);
            }
        }

        System.out.println("\nЭлементы дека после удаления: " +  deque);

        System.out.println("Длина дека: " + deque.size());

        TaskFive first = deque.getFirst();
        TaskFive last = deque.getLast();
        System.out.println("Первый элемент: " + first);
        System.out.println("Последний элемент: " + last);

    }
}
