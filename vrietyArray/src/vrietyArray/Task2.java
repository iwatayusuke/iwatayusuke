package vrietyArray;

import java.util.ArrayList;

public class Task2 {

    public static void main(String[] args) {
        int[] numbers = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60};
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 != 0) {
                odd.add(numbers[i]);
            }else if(numbers[i] % 2 == 0){
                even.add(numbers[i]);
            }
        }

        System.out.println("奇数：" + odd);
        System.out.println("偶数：" + even);
    }

}
