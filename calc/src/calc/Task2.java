package calc;

public class Task2 {

    public static void main(String[] args) {
        int a = 10, b = 12, c = 13, d = a + b + c, e = 3, f = d / e;
        double g = 3.0, h = d / g;

        System.out.println("合計：" + d);
        System.out.println("平均(3で割った時)：" + f);
        System.out.println("平均(3.0で割った時)：" + h);
	}

}
