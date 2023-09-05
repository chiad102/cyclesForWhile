public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным.");
        }

        for (int i = 7; i < 100; i = i + 7) {
            System.out.print(i + " ");
        }

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);  // хотел сделать красивее, чтобы вывод был как в предыдущей задаче, но не мог разлепить строки. Как сделать?
        }

        int deposit = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++ ) {
            total = total + deposit;
            System.out.println("Месяц " + i + ", сумма накоплений " + total);
        }

        int depo = 29000;
        double sum = 0;
        for (int i = 1; i <= 12; i++ ) {
            sum = (sum + depo) + (sum + depo) * 0.01; // кажется тут не учитывается сложный процент
            System.out.println("Месяц " + i + ", сумма накоплений " + sum);
        }

        int num = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + "=" + num*i);
        }

    }
}