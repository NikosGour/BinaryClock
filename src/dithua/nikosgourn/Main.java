package dithua.nikosgourn;

import javax.swing.*;
import java.awt.*;
import java.sql.Time;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        var window = new Window();
        var label = new Label();
        window.add(label);
        while (true){
            label.setText(Clock.updateTime());
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
