import java.time.ZonedDateTime;

/**
 * @author guoshao
 * @create 2021-06-10 11:06
 */
public class time2 {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime=ZonedDateTime.now();//默认时区
        System.out.println(zonedDateTime);
        //2021-06-10T11:07:59.193+08:00[Asia/Shanghai]
    }
}
