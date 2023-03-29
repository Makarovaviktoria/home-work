import java.util.Scanner

public class main {
    Publik statik void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nexInt();


       System.out.println("Первоночальное значение A и B: " + firstNumber+secondNumber);
        firstNumber = firstNumber ^ secondNumber;
        secondNumber = firstNumber ^ secondNumber;
        System.out.println("Финальное значение A и B: " + firstNumber + secondNumber)
    }

}
