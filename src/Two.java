import java.util.Random;

public class Two {
    public static void main(String [] args) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int kol = 0;
        int sum = 0;
        int [] num = new int[100];
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            num[i] = rand.nextInt(10001);
        }
        for(int x: num){
            if(max < x){
                max = x;
            }
            if(min > x){
                min = x;
            }
            if(x % 10 == 0) {
                kol++;
                sum = sum + x;
            }
        }
        System.out.println("Наибольший элемент массива: "+max);
        System.out.println("Наименьший элемент массива: "+min);
        System.out.println("Количество элементов, оканчивающихся на 0: "+kol);
        System.out.println("Сумма элементов, оканчивающихся на 0: " + sum);
    }
}
