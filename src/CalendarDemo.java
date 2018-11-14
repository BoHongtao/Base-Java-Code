import java.util.Calendar;

public class CalendarDemo {
    public static void main(String [] argu){
        Calendar my = Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        //设置出生年月日 1995-05-10
        my.set(Calendar.YEAR, 1995);
        my.set(Calendar.MONTH, 4);
        my.set(Calendar.DATE, 10);
        //获取时间中的天数
        int day = c.get(Calendar.DATE);
        int myDay = my.get(Calendar.DATE);
        System.out.println(day - myDay);
    }
}
