package vrietyArray;

import java.util.HashMap;

public class Task3 {

    public static void main(String[] args) {
        HashMap<String, Integer> price = new HashMap<>();
        price.put("りんご", 130);
        price.put("みかん", 120);
        price.put("バナナ", 98);
        price.put("メロン", 6000);

        for(HashMap.Entry<String, Integer> prices : price.entrySet()) {
            System.out.println(prices.getKey() + "：" +prices.getValue() + "円");
        }
    }

}
