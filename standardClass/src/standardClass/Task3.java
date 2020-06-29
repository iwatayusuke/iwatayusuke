package standardClass;

public class Task3 {

    public static void main(String[] args) {
        String text1 = "ABCDEFG";

        for(int i = 0; i < text1.length(); i++) {
            System.out.print(text1.charAt(6 - i));
        }
    }

}
