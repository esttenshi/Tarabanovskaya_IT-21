import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TaskThree {

    public static void main(String[] args) {

        String[] firstElements = {"Тарабановская", "Юсупов", "Ахметов", "Абдухаликов", "Калинина", "Амбросимова"};
        Queue<String> queue = new LinkedList<String>(Arrays.asList(firstElements));

        System.out.println("\nОчередь до удаления: " + queue);

        int sizeQueue = queue.size();
        String lastElement = null;

        for (int i = 0; i < sizeQueue; i++) {
            String item = queue.poll();
            if (!item.startsWith("А")) {
                queue.offer(item);
                lastElement = item;
            }
        }

        int finalSize = queue.size();

        System.out.println("\nОчередь после удаления: " + queue);
        System.out.println("Длина очереди: " + finalSize);
        System.out.println("Первый элемент очереди: " + queue.element());
        System.out.println("Последний элемент очереди: " + lastElement);
    }
}
