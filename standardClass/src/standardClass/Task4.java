package standardClass;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        String text1 = "ABCDGOPQRSYZ";
        Scanner sc = new Scanner(System.in);
        String text2 = sc.nextLine();

        System.out.println("探したい文字：" + text2);
        if(text1.indexOf(text2) >= 0) {
            System.out.println(text1 + "は" + text2 + "を含む");
        }else{
            System.out.println(text1 + "は" + text2 + "を含まない");
        }
        sc.close();

    }

}
