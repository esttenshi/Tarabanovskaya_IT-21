import java.util.PriorityQueue;
import java.util.HashMap; // Массив-карта для хранения пар символа и частоты его встречаемости в тексте

public class HuffmanAlgorithm {

    PriorityQueue<Node> priorQueue = new PriorityQueue<>();
    HashMap<Character, Integer> charFreq = new HashMap<>();

    public Node createHuffmanTree(String message) {

        // Перебор символов в тексте, добавление в массив-карту и обновление частоты каждого символа
        for (char ch : message.toCharArray()) {
            charFreq.put(ch, charFreq.getOrDefault(ch, 0) + 1);
        }

        System.out.println("\nЧастоты встречаемости символов:");

        for (char key : charFreq.keySet()) { // Проходимся по ключам массива-карты
            priorQueue.offer(new Node(key, charFreq.get(key))); // Добавляем в приоритетную очередь объект Node, узел состоит из символа и частоты его встречаемости
            System.out.println(key + " : " + charFreq.get(key));
        }

        while (priorQueue.size() > 1) {

            Node left = priorQueue.poll(); // Узел с наименьшей частотой и удаление его из очереди
            Node right = priorQueue.poll(); // Узел с наименьшей частотой после удаления предыдущего из очереди

            Node internalNode = new Node('\0', left.freq + right.freq); // Новый узел дерева Хаффмана
            internalNode.leftChild = left; // Левый потомок узла
            internalNode.rightChild = right; // Правый потомок узла

            priorQueue.offer(internalNode); // Добавление нового узла дерева в приоритетную очередь
        }

        // Возвращаем корень дерева Хаффмана
        return priorQueue.poll();
    }

    // Метод для кодирования символов
    public void encode(Node root, String str, HashMap<Character, String> huffmanCode) {
        if (root == null)
            return;

        if (root.leftChild == null && root.rightChild == null) {
            huffmanCode.put(root.ch, str);
            return;
        }

        encode(root.leftChild, str + "0", huffmanCode);
        encode(root.rightChild, str + "1", huffmanCode);
    }

    // Метод для кодирования сообщения
    public String encodeMessage(String message, HashMap<Character, String> huffmanCode) {

        StringBuilder encodeMessage = new StringBuilder();

        for (char ch : message.toCharArray()) {
            encodeMessage.append(huffmanCode.get(ch));
        }

        return encodeMessage.toString();
    }

    // Метод для декодирования сообщения
    public String decodeMessage(String encodedMessage, Node root) {

        StringBuilder decodedMessage = new StringBuilder();
        Node currentNode = root;

        for (char bit : encodedMessage.toCharArray()) {

            if (bit == '0') { // Если текущий бит равен 0, перемещаемся к левому потомку
                currentNode = currentNode.leftChild;
            } else if (bit == '1') { // Если текущий бит равен 1, перемещаемся к правому потомку
                currentNode = currentNode.rightChild;
            }

            if (currentNode.leftChild == null && currentNode.rightChild == null) { // Если мы достигли листа

                decodedMessage.append(currentNode.ch); // Добавляем символ этого узла к раскодированному сообщению
                currentNode = root; // Устанавливаем новый корень
            }
        }

        return decodedMessage.toString();
    }

    public static void main(String[] args) {

        HuffmanAlgorithm huffman = new HuffmanAlgorithm();
        String message = "Hello, world!";

        Node root = huffman.createHuffmanTree(message);

        HashMap<Character, String> huffmanCode = new HashMap<>();
        huffman.encode(root, "", huffmanCode);

        System.out.println("\nКодовая таблица:");
        for (char key : huffmanCode.keySet()) {
            System.out.println(key + " : " + huffmanCode.get(key));
        }

        String encMessage = huffman.encodeMessage(message, huffmanCode);
        System.out.println("\nЗакодированное сообщение: " + encMessage);

        String decMessage = huffman.decodeMessage(encMessage, root);
        System.out.println("\nДекодированное сообщение: " + decMessage);
    }
}

