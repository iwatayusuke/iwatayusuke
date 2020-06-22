package loop;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        System.out.print("正の整数を入力してください：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print(a + "の約数：" );
            for(int i = 1; i < a; i++) {
                if(a % i == 0) {
                    System.out.print(i + ",");
                }
            }
        System.out.print(a);
        sc.close();

    }

}
