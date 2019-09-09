import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 * <p>
 * For example, the square matrix
 * <p>
 * is shown below:
 * <p>
 * 1 2 3
 * 4 5 6
 * 9 8 9
 * <p>
 * The left-to-right diagonal = 1 + 5 + 9 = 15,
 * . The right to left diagonal 3 + 5 + 9 = 17 . Their absolute difference is |15 - 17| = 2.
 */

public class DiagonalDifference {

    private static int diagonalDifference(List<List<Integer>> arr) {

        final AtomicInteger counter = new AtomicInteger(0);
        final AtomicInteger leftValue = new AtomicInteger(0);
        AtomicInteger rightValue = new AtomicInteger(0);

        arr.forEach(x -> {
            leftValue.getAndAdd(x.get(counter.get()));
            counter.incrementAndGet();
        });
        counter.decrementAndGet();

        arr.forEach(x -> {
            rightValue.getAndAdd(x.get(counter.get()));
            counter.decrementAndGet();
        });


        return Math.abs(leftValue.get() - rightValue.get());
    }

    public static void main(String[] args) {

        List<Integer> firstRow = Arrays.asList(11, 2, 4);
        List<Integer> secondRow = Arrays.asList(4, 5, 6);
        List<Integer> thirdRow = Arrays.asList(10, 8, -12);
        System.out.println(diagonalDifference(Arrays.asList(firstRow, secondRow, thirdRow)));

    }
}
