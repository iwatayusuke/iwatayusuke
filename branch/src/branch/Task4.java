package branch;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		int numB = sc.nextInt();

		if(numA > 0 && numB > 0 && (numA % numB) == 0) {
			System.out.println("numA：" + numA);
			System.out.println("numB：" + numB);
		    System.out.println("numBはnumAの約数です。");
		}else if(numA > 0 && numB > 0 && (numA % numB) != 0) {
			System.out.println("numA：" + numA);
			System.out.println("numB：" + numB);
		    System.out.println("numBはnumAの約数ではありません。");
		}else {
			System.out.println("numA：" + numA);
			System.out.println("numB：" + numB);
		    System.out.println("正の整数を入力してください。");
		}
		sc.close();
	}

}
