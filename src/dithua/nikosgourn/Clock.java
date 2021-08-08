package dithua.nikosgourn;

import java.time.LocalTime;

public class Clock {

    private static long convertToBinary(int timeSegment){
        long returnValue = 0L;
        int power = 1;

        for (int i = 0; i < 6; i++) {

            int temp = timeSegment & 1;
            timeSegment >>= 1;

            returnValue += temp * power;
            power *= 10;
        }

        return returnValue;
    }
    private static  String paddingOfBinaryNums(long n)
    {
        String str = Long.toString(n);
        if (str.length() < 6)
        {
            int temp = str.length();
            for (int i = 0; i < 6 - temp; i++) {
                str = "0" + str;
            }
        }

        return str;
    }
    public static String updateTime()
    {
        LocalTime now = LocalTime.now();
        String str = "";

        str += paddingOfBinaryNums(convertToBinary(now.getHour()));
        str += " : ";
        str += paddingOfBinaryNums(convertToBinary(now.getMinute()));
        str += " : ";
        str += paddingOfBinaryNums(convertToBinary(now.getSecond()));

        return str;
    }
}
