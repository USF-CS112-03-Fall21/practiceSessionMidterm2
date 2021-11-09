package solution;

import java.util.ArrayList;
import java.util.List;

/** Write a method
 public static List<String> assignGrades(List<Float> arr)
 in class Grader that takes an list (ArrayList) of Float objects as a parameter
 (where each element is the student’s numerical grade in the class such as 93.2),
 and returns a list (an ArrayList) of strings, where each element is the corresponding letter grade assigned to the student.

 Use the following grading scheme:
 A:  grade >= 94
 B: 84 <= grade < 94
 C: 74 <= grade <84
 D: 60 <= grade <74
 F: grade < 60

 */
public class Grader {
    public static List<String> assignGrades(List<Float> arr) {
        List<String> letterGrades = new ArrayList<>();
        for (Float grade: arr) {
            if (grade >= 94)
                letterGrades.add("A");
            else if (grade >= 84)
                letterGrades.add("B");
            else if (grade >= 74)
                letterGrades.add("C");
            else if (grade >= 60)
                letterGrades.add("D");
            else
                letterGrades.add("F");
        }

        return letterGrades;
    }
}
