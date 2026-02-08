package Day_5_FUNCTIONAL_PROGRAMMING.Inbuilt;

import java.util.function.Supplier;

public class viii_SupplierDemo {
    static void main(String[] args) {

        /*SUPPLIER*/

        //Isse hum koi bhi random number generate kr skte hain
        // we can generate unlimited random number
        Supplier<Double> RandomNum = () -> Math.random();
        System.out.println(RandomNum.get());

       // Same we will replace with method reference
        Supplier<Double> RandomNum2 = Math::random;
        System.out.println(RandomNum2.get());
    }
}
