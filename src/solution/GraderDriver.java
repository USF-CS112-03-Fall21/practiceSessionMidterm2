package solution;

import java.util.ArrayList;
import java.util.List;

/** Create an ArrayList with several float values,
 * call assignGrades method from class Grader and output the result to
 * the console.
 */
public class GraderDriver {
    public static void main(String[] args) {
        List<Float> scores = new ArrayList<>();
        scores.add(85.5f);
        scores.add(98.5f);
        scores.add(87.0f);
        scores.add(57.3f);
        scores.add(72.4f);
        scores.add(80.25f);

        System.out.println(Grader.assignGrades(scores));


    }
}

