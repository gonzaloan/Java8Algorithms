import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros.
 * Print the decimal value of each fraction on a new line.
 * <p>
 * Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though
 * answers with absolute error of up to 10**(-4) are acceptable.
 * <p>
 * For example, given the array arr = [1,1,0,-1,-1] there are elements, two positive,
 * two negative and one zero. Their ratios would be 2/5 = 0.400000, 2/5 = 0.400000 and 1/5= 0.2000000. It should be
 * printed as 0.40000, 0.400000, 0.200000
 */
public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        long positives = Arrays.stream(arr).filter(x -> x > 0).count();

        long negatives = Arrays.stream(arr).filter(x -> x < 0).count();


        long zeros = Arrays.stream(arr).filter(x -> x == 0).count();


        BigDecimal r1 = BigDecimal.valueOf((double) positives / (double) arr.length).setScale(6, 6);
        BigDecimal r2 = BigDecimal.valueOf((double) negatives / (double) arr.length).setScale(6, 6);
        BigDecimal r3 = BigDecimal.valueOf((double) zeros / (double) arr.length).setScale(6, 6);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);


    }

    public static void main(String[] args) {
        int[] myIntArray = {-4, 3, -9, 0, 4, 1};

        plusMinus(myIntArray);
    }
}
