package loop;

public class Task5 {

    public static void main(String[] args) {
        int a =9, b = 9;

        for(int i = 1; i <= a; i++) {
            for(int j = 1; j <= b; j++) {
                if(i * j <10) {
                    System.out.print(" " + i * j + " ");
                }else {
                    System.out.print(i * j + " ");
                }
            }
            System.out.println(" ");
        }

    }

}
