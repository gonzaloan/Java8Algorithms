import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of
 * integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
 *
 * For example, there are n = 7 socks with colors ar = [1,2,1,2,1,3,2] There is one pair of color and one of color .
 * There are three odd socks left, one of each color. The number of pairs is 2
 *
 * Complete the sockMerchant function in the editor below. It must return an integer representing the number of
 * matching pairs of socks that are available.
 *
 * sockMerchant has the following parameter(s):
 *
 *     n: the number of socks in the pile
 *     ar: the colors of each sock
 *
 *
 */
public class SocksPair {

    static int sockMerchant(int n, int[] ar) {
        //mapea todos los objetos iguales
        return Arrays.stream(ar)
                .boxed()
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .filter(x -> x > 1)
                .map(x -> x / 2)
                .collect(Collectors.toList())
                .stream()
                .reduce(0L, Long::sum)
                .intValue();
    }

    public static void main(String[] args) {

        //Cuenta los pares
        sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20});
    }
}
