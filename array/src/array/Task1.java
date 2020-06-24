package array;

public class Task1 {

    public static void main(String[] args) {
        int numbers[] = {4, 9, 19, 5, 8, 21, 42, 64, 73, 18, 2};
        int sum = 0;

        System.out.print("配列：［");
        for(int i = 0; i < numbers.length; i++) {
            if(i < numbers.length - 1) {
                System.out.print(numbers[i] + ",");
            }else if(i == numbers.length - 1) {
                System.out.println(numbers[i] + "］");
            }
        }

        for(int number : numbers) {
            sum = sum + number;
        }
        System.out.println("合計：" + sum);
    }

}
