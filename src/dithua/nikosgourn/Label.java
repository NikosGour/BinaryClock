package dithua.nikosgourn;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.TimeUnit;

public class Label extends JLabel{

    Label()
    {
        this.setHorizontalAlignment(JLabel.CENTER);
        this.setVerticalAlignment(JLabel.CENTER);
        this.setOpaque(true);
        this.setFont(new Font("Ink Free" , Font.PLAIN , 40));
        this.setForeground(Color.MAGENTA);
        this.setBackground(Color.BLACK);

    }
}
