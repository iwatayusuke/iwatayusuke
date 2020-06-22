package loop;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        System.out.print("数字を入力してください：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        
            for(int i = 1; i < a; i++) {
                sum = sum + i;
                System.out.print(i + " + ");
            }
        System.out.print(a + " ");
        System.out.println("= " + (sum + a));
        sc.close();

    }

}