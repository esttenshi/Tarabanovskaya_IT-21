import java.util.LinkedList;
import java.util.Queue;

class TaskFourQueue {

    Queue<TaskFourStudent> studentQueue = new LinkedList<>();

    // Добавление студента
    public void addStudent(TaskFourStudent student) {studentQueue.add(student);}

    // Перепись в новую очередь студентов заданного года рождения
    public void newQueue(int year) {
        Queue<TaskFourStudent> newQueue = new LinkedList<>();
        for (TaskFourStudent student : studentQueue) {
            if(student.birthYear == year){
                newQueue.add(student);
            }
        }
        studentQueue = newQueue;
    }

    // Вывод содержимого очереди
    public void output() {
        for (TaskFourStudent student : studentQueue) {
            System.out.println("Фамилия: " + student.lastName + ", Группа: " + student.groupNumber + ", Год рождения: " + student.birthYear);
        }
    }

    public static void main(String[] args) {

        TaskFourQueue studentQueue = new TaskFourQueue();

        studentQueue.addStudent(new TaskFourStudent("Калинина", "ИТ-21", 2004));
        studentQueue.addStudent(new TaskFourStudent("Тарабановская", "ИТ-21", 2004));
        studentQueue.addStudent(new TaskFourStudent("Пичугина", "ИТ-22", 2004));
        studentQueue.addStudent(new TaskFourStudent("Юсупов", "ИТ-21", 2003));

        System.out.println("\nПервоначальная очередь: ");
        studentQueue.output();

        studentQueue.newQueue(2003);
        System.out.println("\nИзмененная очередь: ");
        studentQueue.output();
    }
}