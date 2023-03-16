import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number333 = scanner.nextInt();

        // // 1.Перевести число 333 из шестнадцатиричной в десятичную.
        speed(number333,16);

        // 2.Разложить число 200345 на разряды в десятичной системе.
        // 2 * 10^5 + 0*10^4 + 0*10^ + 3*10^2 + 4*10^1 + 5*10^0

        //Перевести 637 из десятичной в шестнадцатиричную и обратно (10->16 и 16->10).
        System.out.println("Введите число:");
        int number637 = scanner.nextInt();
        speed(number637,16);
        bigToy(number637,16);

        // Перевести 637 из десятичной в двоичную.
        bigToy(number637,2);

        // Перевести 637 из десятичной в троичную.
       bigToy(number637,3);


       // 11100111 перевести в десятичную.
        speed(11100111,2);
    }

    public static void speed (int num , int small){

      System.out.println("число" + num +"из" + small + "10:");
        int result = 0;
        int value = 0;
       

        for(int i = 0; i <small; i++) {
            value = num % 10;
            result += value * Math.pow(small, i);
            num /= 10;
            System.out.println("число" + num +"из small в" +10+ ":");
        }
        System.out.println(result);
    }
    public static void bigToy(int num,int bag){
        String result = "";
        int value = 0;
        while (num!= 0) {
            value = num % bag;
            result = value + result;
            num/= bag;
        }
        System.out.println(result);
    }

}



