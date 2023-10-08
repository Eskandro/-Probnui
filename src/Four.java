import java.util.Random;

public class Four {
    public static void main(String [] args) {
        Random rand = new Random();
        int id = 0;

        int maxSum = 0;
        int[] num = new int[100];
        for (int i = 0; i < num.length; i++) {
            num[i] = rand.nextInt(10000);
        }
        for (int i = 0; i < num.length - 2; i++){
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += num[j];
            }
            if(sum > maxSum){
                maxSum = sum;
                id = i;
            }
        }
        System.out.println("Сумма тройки: "+ maxSum);
        System.out.println("Индекс первого элемента тройки: " + id);
    }
}
