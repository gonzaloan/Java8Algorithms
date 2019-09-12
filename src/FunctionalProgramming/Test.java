package FunctionalProgramming;

import java.util.function.Function;

public class Test {

    public static void main(String[] args) {

        System.out.println(factorial(5));

    }

    static int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num-1);
        }


    }
}
