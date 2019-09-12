import java.util.stream.IntStream;

/**
 * Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography.
 * During his last hike he took exactly n steps. For every step he took, he noted if it was an uphill, U,
 * or a downhill, D step. Gary's hikes start and end at sea level and each step up or down represents a
 * unit change in altitude. We define the following terms:
 * <p>
 * -A mountain is a sequence of consecutive steps above sea level, starting with a step up from sea level and
 * ending with a step down to sea level.
 * -A valley is a sequence of consecutive steps below sea level, starting with a step down from sea level and
 * ending with a step up to sea level.
 * <p>
 * Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked
 * through. For example, if Gary's path is [DDUUUUUDD], he first enters a valley units deep. Then he climbs out an
 * up onto a mountain units high. Finally, he returns to sea level and ends his hike.
 * <p>
 * Function Description
 * Complete the countingValleys function in the editor below. It must return an integer that denotes the number
 * of valleys Gary traversed. countingValleys has the following parameter(s):
 * <p>
 * n: the number of steps Gary takes
 * s: a string describing his path
 */
public class CountingValleys {

    static int countingValleys(int n, String s) {
        int level = 0;
        int valleysCounter = 0;
        boolean isValley = false;

        IntStream.range(0, n)
                .forEach(x-> {

                });
        for (int i = 0; i < n; i++) {
            if (String.valueOf(s.charAt(i)).equals("D")) {
                level--;
            } else {
                level++;
            }

            if (level < 0) {
                isValley = true;
            }

            if (isValley && level == 0) {
                isValley = false;
                valleysCounter++;
            }
        }

        return valleysCounter;
    }


    public static void main(String[] args) {
        System.out.println(countingValleys(8, "UDDDUDUU"));
    }
}
