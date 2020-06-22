package array;

public class Task2 {

    public static void main(String[] args) {
        int[] numbers = new int[7];
            for(int i = 0; i < numbers.length; i++) {
                numbers[i] = 7 - i;
                if(i < numbers.length - 1) {
                    System.out.print(numbers[i] + ",");
                }else if(i == numbers.length - 1) {
                    System.out.println(numbers[i]);
                }
            }

            for(int i = 0; i < numbers.length; i++) {
                numbers[i] = 1 + i;
                if(i < numbers.length - 1) {
                    System.out.print(numbers[i] + ",");
                }else if(i == numbers.length - 1) {
                    System.out.println(numbers[i]);
                }
            }
    }

}
