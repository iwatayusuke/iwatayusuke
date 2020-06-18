package calc;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        String a = "ノートPCの値段：";
        int b = 89800;
        char c = '円';

        Scanner sc = new Scanner(System.in);
        String d = sc.nextLine();
        String e = sc.nextLine();

        System.out.println(a + b + c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(d + e);
        sc.close();
    }

}
