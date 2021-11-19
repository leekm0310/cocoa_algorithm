package algorithm191121;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class TimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        StringBuffer result = new StringBuffer();
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
        return result.toString();
    }

}
