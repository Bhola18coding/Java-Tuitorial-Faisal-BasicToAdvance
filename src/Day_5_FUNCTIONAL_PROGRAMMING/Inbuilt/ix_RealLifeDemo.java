package Day_5_FUNCTIONAL_PROGRAMMING.Inbuilt;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class ix_RealLifeDemo {
    static void main(String[] args) {

        //1.  Using Bi-Function

        //Iss Format me humein string Chahiye , do chiz hain aur ise humko return krna hain.
       // <title> costs $<Price> = Format
        // We will use here Bi-Function , two input and one return type
        BiFunction<String, Double, String> formatter = (title, price) -> title + " costs $" + price;
        System.out.println(formatter.apply("Java Basics Book", 599.34));
        System.out.println(formatter.apply("python Book", 456.78));



        //2. Using Bi-Consumer

        // two argument no return type
        // In this Humein string ko return ni krna , print krna hain bs
        BiConsumer<String, Double> formatterConsumer = (title, price) -> System.out.println(title + " costs $" + price);
        formatterConsumer.accept("ABC Basics Book", 899.34);
        formatterConsumer.accept("Xyz Book", 956.78);


        //3. Using Predicate

        //IsExpensive
        Predicate<Double> isExpensive = price -> price > 500;
        System.out.println(isExpensive.test(900.4));
    }
}
