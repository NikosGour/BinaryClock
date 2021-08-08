package dithua.nikosgourn;

import java.sql.Time;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        while (true){
            System.out.println(Clock.updateTime());
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
