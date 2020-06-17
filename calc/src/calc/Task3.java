package calc;
import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = a + b + c;
        int e = 3;
        int f = d / e;

        double g, h;
		g = 3.0;
		h = d / g;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("合計：" + d);
        System.out.println("平均(3で割った時)：" + f);
		System.out.println("平均(3.0で割った時)：" + h);
        sc.close();
	}

}
