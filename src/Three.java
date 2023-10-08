import java.util.Random;

public class Three {
    public static void main(String [] args) {
        int max = Integer.MIN_VALUE;
        int id = 0;
        Random rand = new Random();
        int sum = 0;
        int[][] num = new int[12][8];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = rand.nextInt(50);
                System.out.print(num[i][j] + " ");
                sum = sum + num[i][j];
                if(max <= sum) {
                    max = sum;
                    id = i;
                }
            }
            System.out.println("Сумма строки: " + sum);
            sum = 0;
            System.out.println();

        }
        System.out.println("Максимальная сумма строки: " + max);
        System.out.println("Ее индекс: " + id);
    }
}
