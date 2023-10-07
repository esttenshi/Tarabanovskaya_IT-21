
public class Caesar {

    char [] ap = new char[26]; // Базовый алфавит (массив) с вместимостью 26
    char [] apnew = new char[26]; // Сдвинутый алфавит (массив) с вместимостью 26
    int key; // Ключ-сдвиг шифрования
    String answ; //

    // Конструктор для заполнения массива базового алфавита
    public Caesar() {
        for (int i = 0; i < 26; i++) {
            ap[i] = (char) (65 + i); // 65 - символ "А" в кодировке
        }
    }

    // Заполнение нового алфавита со сдвигом
    public void setKey(int newKey) {
        key = newKey;
        for (int i = 0; i < 26; i++) {
            int newIndex = (i + key) % 26;
            apnew[i] = ap[newIndex];
        }
    }

    // Кодирование сообщения
    public void code(String str) {

        char[] in = str.toUpperCase().toCharArray();
        answ = new String(in);

        for (int i = 0; i < in.length; i++) {
            char c = in[i];
            if (Character.isLetter(c)) {
                int index = c - 'A';
                answ =  answ.substring(0, i) + apnew[index] + answ.substring(i + 1);
            }
        }
        System.out.println("\nЗашифрованное сообщение: " + answ);
    }

    // Расшифровка сообщения
    public void unCode() {

        char[] in = answ.toUpperCase().toCharArray();
        String answ = new String(in);

        for (int i = 0; i < in.length; i++) {
            char c = in[i];
            if (Character.isLetter(c)) {
                int index = c - 'A';
                int newIndex = (index - key + 26) % 26;
                answ =  answ.substring(0, i) + ap[newIndex] + answ.substring(i + 1);

            }
        }
        System.out.println("Расшифрованное сообщение: " + answ);
    }

    public static void main(String[] args){
        Caesar test = new Caesar();
        test.setKey(5);
        test.code("Algorithms and data structures");
        test.unCode();
    }
}
