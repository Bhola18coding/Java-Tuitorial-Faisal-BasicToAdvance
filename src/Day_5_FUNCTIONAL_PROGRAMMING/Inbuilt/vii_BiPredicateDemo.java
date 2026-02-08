package Day_5_FUNCTIONAL_PROGRAMMING.Inbuilt;

import java.util.function.BiPredicate;

public class vii_BiPredicateDemo {
    static void main(String[] args) {

        BiPredicate<Integer, Integer>isSumEven = (a,b) -> (a+b) % 2 == 0;
        System.out.println(isSumEven.test(20,40)); // true , because 20+40=60 and it is even
        System.out.println(isSumEven.test(31, 50)); // false, it is odd

    }
}
