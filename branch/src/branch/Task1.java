package branch;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		System.out.println("10以上の数字を入力してください");
		System.out.println(a);
		    if(a < 10) {
		    	a = 10 * a;
		    }
		System.out.println("値：" + a);
		sc.close();
	}

}
