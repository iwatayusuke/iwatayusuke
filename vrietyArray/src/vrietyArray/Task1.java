package vrietyArray;

import java.util.ArrayList;

public class Task1 {

    public static void main(String[] args) {
        ArrayList<String> tihou = new ArrayList<>();
        tihou.add("北海道");
        tihou.add("東北");
        tihou.add("関東");
        tihou.add("中部");
        tihou.add("近畿");
        tihou.add("中国");
        tihou.add("九州");

        for(String japan : tihou) {
            System.out.println(japan);
        }
    }

}
