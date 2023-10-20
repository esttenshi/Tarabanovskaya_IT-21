import java.util.LinkedList;

public class TaskTwo {

    public static void swapValues(LinkedList<Integer> linkedList, int value1, int value2) {

        int index1 = linkedList.indexOf(value1);
        int index2 = linkedList.indexOf(value2);

        if (index1 != -1 && index2 != -1) { // Если хотя бы одно значение не обнаружено
            linkedList.set(index1, value2);
            linkedList.set(index2, value1);
        }
    }

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(8);
        linkedList.add(9);

        System.out.println("\nИсходный список: " + linkedList);

        swapValues(linkedList, 6, 9);

        System.out.println("\nИзмененный список: " + linkedList);
    }
}

