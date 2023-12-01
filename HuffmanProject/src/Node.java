class Node implements Comparable<Node> { // Класс Node, реализующий Comparable, используемый для сравнения объектов типа Node

    char ch; // Символ
    int freq; // Встречаемость символа
    Node leftChild, rightChild; // Левый и правый потомок дерева

    // Конструктор для инициализации объекта
    public Node(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }

    @Override
    public int compareTo(Node other) {
        return this.freq - other.freq;
    }
}