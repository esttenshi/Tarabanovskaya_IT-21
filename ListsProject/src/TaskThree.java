import java.util.LinkedList;

public class TaskThree {

    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(3);
        list1.add(7);
        list1.add(4);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(4);
        list2.add(5);
        list2.add(8);
        list2.add(1);

        LinkedList<Integer> mergedList = new LinkedList<>();
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        System.out.println("Первый список: " + list1);
        System.out.println("Второй список: " + list2);
        System.out.println("Соединенный список: " + mergedList);
    }
}
