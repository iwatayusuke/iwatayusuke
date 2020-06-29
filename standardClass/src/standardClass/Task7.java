package standardClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Task7 {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

        Date now = new Date();
        System.out.println("現在日時：" + sdf.format(now));

        cal.add(Calendar.DAY_OF_MONTH, 7);
        System.out.println("１週間後：" + sdf.format(cal.getTime()));

        int nextyear = cal.get(Calendar.YEAR) + 1;
        cal.set(Calendar.YEAR, nextyear);
        int week = cal.get(Calendar.DAY_OF_WEEK);
        String youbi = "";
        switch(week) {
        case 1:
            youbi = "(日)";
            break;
        case 2:
            youbi = "(月)";
            break;
        case 3:
            youbi = "(火)";
            break;
        case 4:
            youbi = "(水)";
            break;
        case 5:
            youbi = "(木)";
            break;
        case 6:
            youbi = "(金)";
            break;
        case 7:
            youbi = "(土)";
            break;
        }
        System.out.println("１年後　：" + sdf.format(cal.getTime()) + youbi);
    }

}
