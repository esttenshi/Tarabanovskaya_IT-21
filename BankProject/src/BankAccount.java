import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;

public class BankAccount {

    private double balance = 0; // Сумма на счету
    int count = 0; // Счетчик операций
    double minSum = MAX_VALUE; // Минимальная сумма, использованная в операциях
    double maxSum = MIN_VALUE; // Максимальная сумма, использованная в операциях

    // Зачисление указанной суммы на счет
    public void deposit(double amount) {
        balance += amount;
        count++;
        if (amount > maxSum) {
            maxSum = amount;
        }
        if (amount < minSum) {
            minSum = amount;
        }
    }

    // Снятие указанной суммы на счет
    public void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            count++;
            if (amount > maxSum) {
                maxSum = amount;
            }
            if (amount < minSum) {
                minSum = amount;
            }
        }
    }

    // Перевод суммы на другой счет (новый объект класса)
    public void transfer(BankAccount toAccount, double amount) {
        toAccount.withdraw(amount);
        toAccount.deposit(amount);
        if (amount > maxSum) {
            maxSum = amount;
        }
        if (amount < minSum) {
            minSum = amount;
        }
    }

    // Получение текущей суммы на счету
    public double getBalance() {return balance;}

    // Получение количества операций, проведенных с первым счетом (первым объектом класса)
    public int getCount() {return count;}

    // Получение минимальной суммы, использованной в операциях по счету
    public double getSmallestOperation() {return minSum;}

    // Получение максимальной суммы, использованной в операциях по счету
    public double getLargestOperation() {return maxSum;}
}