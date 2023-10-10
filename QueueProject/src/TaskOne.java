import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TaskOne {
    public static void main(String[] args)  {

        String[] firstElements = {"Тарабановская Екатерина", "Юсупов Александр", "Петров Владимир", "Тарков Александр"};
        String[] secondElements = {"Панов Ефим", "Меркулов Дмитрий", "Овсянников Константин"};

        Queue<String> firstQueue = new LinkedList<String>(Arrays.asList(firstElements));
        Queue<String> secondQueue = new LinkedList<String>(Arrays.asList(secondElements));
        Queue<String> thirdQueue = new LinkedList<String>();

        System.out.println("\nПервая очередь: " + firstQueue);
        System.out.println("Вторая очередь: " + secondQueue);

        while  (!firstQueue.isEmpty() | !secondQueue.isEmpty()) {
            if (!firstQueue.isEmpty()) { thirdQueue.add(firstQueue.remove()); }
            if (!secondQueue.isEmpty()) { thirdQueue.add(secondQueue.remove()); }
        }

        System.out.println("Третья очередь: " + thirdQueue);
    }
}
