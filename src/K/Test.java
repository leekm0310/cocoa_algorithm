package K;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        StringBuffer result = new StringBuffer();
        String s = "08:05:45PM";
        int hour = Integer.valueOf(s.substring(0,2));
        String AP = s.substring(s.length()-2);

        if (AP.equalsIgnoreCase("PM")){
            if (hour<12){
                hour += 12;
            }
            result.append(hour);
        } else {
            if (hour == 12){
                result.append("00");
            } else {
                result.append("0").append(hour);
            }
        }

        result = result.append((s), 2, s.length()-2);
        result.toString();
        System.out.println(result);

    }
}
