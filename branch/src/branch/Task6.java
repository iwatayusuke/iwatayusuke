package branch;

import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
        String name = "";
        System.out.println("1から5までの数字を入力してください。");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        System.out.println(num);
            switch(num) {
                case "1":
                    name = "I";
                    break;
                case "2":
                    name = "II";
                    break;
                case "3":
                    name = "III";
                    break;
                case "4":
                    name = "IV";
                    break;
                case "5":
                    name = "V";
                    break;
              default:
                    name = "unknown";
                    break;
            }
        System.out.println(num + " -> " + name);
        sc.close();

    }

}
