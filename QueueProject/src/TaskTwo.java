import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TaskTwo {

    public static void main(String[] args) {

        String[] firstElements = {"Тарабановская Екатерина", "Юсупов Александр", "Петров Владимир", "Тарков Александр"};
        String[] secondElements = {"Панов Ефим", "Тарабановская Екатерина", "Меркулов Дмитрий", "Петров Владимир", "Овсянников Константин"};

        Queue<String> firstQueue = new LinkedList<String>(Arrays.asList(firstElements));
        Queue<String> secondQueue = new LinkedList<String>(Arrays.asList(secondElements));

        System.out.println("\nПервая очередь: " + firstQueue);
        System.out.println("Вторая очередь до удаления: " + secondQueue);

        secondQueue.removeAll(firstQueue);

        System.out.println("Вторая очередь после удаления: " + secondQueue);
    }
}
