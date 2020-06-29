package method;

public class Task4 {

    public static void main(String[] args) {
        String[] arrayOne = {"a", "b", "c"};
        String[] arrayTwo = {"a", null, "c"};

        System.out.println("---配列にnullがない場合---");
        System.out.println(nullCheck(arrayOne));
        System.out.println("---配列にnullがある場合---");
        System.out.println(nullCheck(arrayTwo));
    }

    public static boolean nullCheck(String[] arrayOne) {
        boolean f = false;
        for(int i = 0; i < arrayOne.length; i++) {
            if(arrayOne[i] == null) {
                f = true;
                break;
            }
        }
        return f;
    }
}
