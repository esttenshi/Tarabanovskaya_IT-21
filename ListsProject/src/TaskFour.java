class TaskFour {
    int val;
    TaskFour next;

    TaskFour(int val) {
        this.val = val;
        this.next = null;
    }
}

class Solution {

    public TaskFour mergeLists(TaskFour l1, TaskFour l2) {
        TaskFour dummy = new TaskFour(0); // Вспомогательный узел, чтобы получить первое значение
        TaskFour current = dummy;

        while (l1 != null && l2 != null) { // Пока списки не пусты, меньшее из значений добавляется к текущему узлу
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // Добавляем оставшиеся элементы, если таковые имеются
        if (l1 != null) {
            current.next = l1;
        }

        if (l2 != null) {
            current.next = l2;
        }

        return dummy.next;
    }

    public void printList(TaskFour head) {
        TaskFour current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        TaskFour l1 = new TaskFour(1);
        l1.next = new TaskFour(3);
        l1.next.next = new TaskFour(7);
        l1.next.next.next = new TaskFour(4);

        TaskFour l2 = new TaskFour(2);
        l2.next = new TaskFour(4);
        l2.next.next = new TaskFour(5);
        l2.next.next.next = new TaskFour(8);
        l2.next.next.next.next = new TaskFour(1);

        Solution solution = new Solution();

        System.out.print("\nПервый список: ");
        solution.printList(l1);

        System.out.print("Второй список: ");
        solution.printList(l2);

        TaskFour mergedList = solution.mergeLists(l1, l2);

        System.out.print("\nИтоговый список: ");
        solution.printList(mergedList);
    }
}
