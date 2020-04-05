import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введит текущий курс доллара: ");
        double rate = scan.nextDouble();
        System.out.print("Введите сумму в рублях: ");
        double amount = scan.nextInt();
        BigDecimal total = new BigDecimal(amount/rate).setScale(2,RoundingMode.HALF_UP);
        System.out.printf("Курс доллара = %.2f, Количество рублей : %.0f. Итого: %.2f долларов", rate, amount, total);
        scan.close();
    }
}