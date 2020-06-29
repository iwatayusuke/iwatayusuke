package method;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("--①文字列だけの場合---");
        System.out.println(add("文字列1", "文字列2"));
        System.out.println("---②整数だけの場合----");
        System.out.println(add(3, 5));
        System.out.println("---③小数だけの場合----");
        System.out.println(add(3.5, 5.5));
    }

    public static String add(String a, String b) {
        return a + b;
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static double add(double a, double b) {
        return a + b;
    }

}
