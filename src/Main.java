
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int[] money = {1000, 2000, 3000, 4000, 5000};
        for (int i = 0; i < money.length; i++) {
            sum = sum + money[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        int min = money[0];
        for (int i = 0; i < money.length; i++) {
            if (min > money[i]) {
                min = money[i];
            }
        }
        int max = money[0];
        for (int i = 0; i < money.length; i++) {
            if (max < money[i]) {
                max = money[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");
        double sum1 = 0;
        double[] averagemoney = {102, 1500, 1481, 1571, 5000};

        for (double element : averagemoney ) {
            sum1 += element;
        }
        double avg = sum1 / averagemoney.length;
        System.out.println("Средняя сумма трат за месяц составила " + avg);

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1 ;  i >=0; i--) {
            System.out.print(reverseFullName[i]);

        }

    }

}
