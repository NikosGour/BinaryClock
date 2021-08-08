package dithua.nikosgourn;

import java.awt.*;

public class test {
    public static void main(String[] args) {
        String[] fonts =
                GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String font : fonts) {
            System.out.println(font);
        }
    }
}
