package branch;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		System.out.println("1から5までの数字を入力してください。");
		System.out.println(num);
		    switch(num) {
		        case "1":
		        	String a = "1 -> I";
		        	System.out.println(a);
		        	break;
		        case "2":
		        	String b = "2 -> II";
		        	System.out.println(b);
		        	break;
		        case "3":
		        	String c = "3 -> III";
		        	System.out.println(c);
		        	break;
		        case "4":
		        	String d = "4 -> IV";
		        	System.out.println(d);
		        	break;
		        case "5":
		        	String e = "5 -> V";
		        	System.out.println(e);
		        	break;
		        default:
		        	String f = "unknown";
		        	System.out.println(f);
		        	break;
		    }
		sc.close();

	}

}
