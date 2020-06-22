package array;

import java.util.Random;

public class Task3 {

    public static void main(String[] args) {
        int[] numbers = new int[6];
        int max = 0, min = 0;
        Random r = new Random();

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(9);
                if(i == 0) {
                    System.out.print("［" + numbers[i] + ",");
                }else if(i < numbers.length - 1) {
                    System.out.print(numbers[i] + ",");
                }else if(i == numbers.length - 1) {
                    System.out.println(numbers[i] + "］");
                }
        }

        for(int i = 0; i < numbers.length; i++) {
            if(max < numbers[i]) {
                max = numbers[i];
            }
        }
        for(int i = 0; i < numbers.length; i++) {
            if(min > numbers[i]) {
                min = numbers[i];
            }
        }

        System.out.println("最大値：" + max);
        System.out.println("最小値：" + min);
    }

}
