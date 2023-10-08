import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int sum = 0;
        int n = scan.nextInt();
        int [] num = new int[n];

        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(11);
        }
        for (int m: num) {
            System.out.print(m + " ");
            if(m > 8) {
                count1++;
            }
            if(m == 1) {
                count2++;
            }
            if(m % 2 == 0){
                count3++;
            }
            else count4++;
            sum = sum + m;
        }
        System.out.println("\n" + "Длина массива: "+ n);
        System.out.println("Количество чисел больше 8:" + count1);
        System.out.println("Количество чисел равных 1:" + count2);
        System.out.println("Количество четных чисел:" + count3);
        System.out.println("Количество нечетных чисел:" + count4);
        System.out.println("Сумма всех элементов массива:" + sum);
    }
}