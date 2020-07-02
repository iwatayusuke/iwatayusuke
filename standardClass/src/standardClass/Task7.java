package standardClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task7 {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日(E)");

        Date now = new Date();
        System.out.println("現在日時：" + sdf1.format(now));

        cal.add(Calendar.DAY_OF_MONTH, 7);
        System.out.println("１週間後：" + sdf1.format(cal.getTime()));

        cal.set(Calendar.YEAR, 2021);
        System.out.println("１年後　：" + sdf2.format(cal.getTime()));
    }

}
