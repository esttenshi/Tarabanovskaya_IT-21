public class BankAccountTester {

    public void run() {

        BankAccount account = new BankAccount();
        BankAccount secondAccount = new BankAccount();

        account.deposit(200);
        account.withdraw(120);

        System.out.println("\nСумма на счету: " + account.getBalance());
        System.out.println("Ожидаемая сумма на счету: 80.0");

        System.out.println("Количество операций, выполненных со счётом: " + account.getCount());

        account.transfer(secondAccount, 50);

        System.out.println("\nСумма на другом счету: " + secondAccount.getBalance());
        System.out.println("Ожидаемая сумма на другом счету: 50.0");

        // Тестирование метода getMinSum
        System.out.println("\nМинимальная сумма операции: " + account.getSmallestOperation());
        System.out.println("Максимальная сумма операции: " + account.getLargestOperation());
    }

    public static void main(String[] args) {

        BankAccountTester tester = new BankAccountTester();
        tester.run();
    }
}
