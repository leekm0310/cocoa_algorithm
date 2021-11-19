package algorithm191121;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class CompareTheTriplets{

    /*
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        result.add(0, 0);
        result.add(1,0);
        for (int i = 0; i < a.size(); i ++){
            int alice = a.get(i);
            int bob = b.get(i);
            int score = 1;
            if (alice > bob){
                result.set(0, result.get(0) + score);
            } else if (alice < bob){
                result.set(1, result.get(1) + score);
            }
        }

        return result;

    }

}
