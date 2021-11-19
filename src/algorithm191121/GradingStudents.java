package algorithm191121;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class GradingStudents {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> finalGrade = new ArrayList<>();
        for (int i = 0; i < grades.size(); i++){
            int a = grades.get(i);
            int b = grades.get(i) % 5;
            if (a < 38){
                finalGrade.add(a);
            } else if (a >= 38 && b > 2){
                finalGrade.add(a + 5 - b);
            } else {
                finalGrade.add(a);
            }
        }
        return finalGrade;
    }

}

