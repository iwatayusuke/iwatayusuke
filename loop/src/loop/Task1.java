package loop;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        System.out.print("数字を入力してください：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        
            for(int i = 0; i <= a; i++) {
                sum = sum + i;
            }
        System.out.println("1～" + a + "までの合計：" + sum);
        sc.close();

    }

}
