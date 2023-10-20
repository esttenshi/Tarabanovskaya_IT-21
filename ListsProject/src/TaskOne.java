
class TaskOne {
    int data;
    TaskOne next;

    public TaskOne(int data) {
        this.data = data;  // Контейнер для хранения данных и получения следующего узла
        this.next = null; // Ссылка на следующий узел
    }
}

class LinkedList {

    TaskOne head; // Ссылка на первый узел в списке

    // Инициализация пустого списка
    public LinkedList() {
        this.head = null;
    }

    public void insertSorted(int element) {

        // Инициализация нового узла
        TaskOne new_node = new TaskOne(element);

        if (head == null || element <= head.data) { // Если элемент вставки меньше элемента в головном узле
            new_node.next = head; // Ссылка на следующий элемент устанавливается в текущую голову списка
            head = new_node; // Головой списка стновится новый узел
            return;
        }

        TaskOne current = head;
        while (current.next != null && current.next.data < element) { // Если следующий узел пуст либо он больше элемента вставки
            current = current.next;
        }

        new_node.next = current.next;
        current.next = new_node;
    }

    // Вывод списка, наиная с главного узла
    public void printList() {
        TaskOne current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.print("\n");
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertSorted(10);
        list.insertSorted(20);
        list.insertSorted(50);
        list.insertSorted(60);
        list.insertSorted(80);
        list.insertSorted(90);
        System.out.println("\nИсходный список: ");
        list.printList();

        list.insertSorted(75);
        System.out.println("\nИзмененный список: ");
        list.printList();
    }
}
