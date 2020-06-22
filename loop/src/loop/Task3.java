package loop;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        System.out.print("数字を入力してください：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;

            while(a != 0) {
                a = a / 10;
                b = b + 1;
            }
        System.out.println("桁数：" + b);
        sc.close();

    }

}
