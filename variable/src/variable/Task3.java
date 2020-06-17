package variable;

public class Task3 {

	public static void main(String[] args) {
		int intNum = 219;
	    double doubleNum = 364.2;
	    long longNum = 123456L;

	    long a = (long) intNum;
	    float b = (float) doubleNum;
	    double c = (double) longNum;

		System.out.println("変換前");
		System.out.println(intNum);
		System.out.println(doubleNum);
		System.out.println(longNum);

		System.out.println("変換後");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
