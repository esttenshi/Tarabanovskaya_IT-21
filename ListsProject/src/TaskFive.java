class TaskFive {
    int val;
    TaskFive next;

    TaskFive(int x) {
        val = x;
        next = null;
    }
}

class LinkedListAverage {
    public static double findAverage(TaskFive head) {
        if (head == null) {
            return 0; // Список пуст, среднего элемента нет
        }

        TaskFive slow = head; // Медленный указатель
        TaskFive fast = head; // Быстрый указатель

        // Быстрый указатель двигается с двойной скоростью, пока не достигнет конца списка или последнего элемента перед концом
        while (fast != null && fast.next != null) {
            slow = slow.next; // Перемещаем медленный указатель на следующий элемент
            fast = fast.next.next; // Перемещаем быстрый указатель на через один элемент
        }

        // Возвращаем значение текущего элемента медленного указателя, которое будет являться средним элементом в списке
        return slow.val;
    }

    // Метод выводит все элементы списка на экран
    public static void printList(TaskFive head) {
        TaskFive temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        TaskFive head = new TaskFive(1);
        head.next = new TaskFive(2);
        head.next.next = new TaskFive(3);
        head.next.next.next = new TaskFive(4);
        head.next.next.next.next = new TaskFive(5);

        System.out.println("\nСписок: ");
        printList(head);

        double average = findAverage(head);
        System.out.println("\nСредний элемент: " + average);
    }
}