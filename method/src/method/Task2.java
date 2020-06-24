package method;

public class Task2 {

    public static void main(String[] args) {
        System.out.println("三角形の面積");
        System.out.println(getTriangleArea(2, 1.5));
    }

    public static double getTriangleArea (double a, double b){
        return Math.round(a * b / 2);
    }

}
