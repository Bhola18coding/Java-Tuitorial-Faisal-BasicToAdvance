package Day_5_FUNCTIONAL_PROGRAMMING.Inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class iv_ConsumerDemo {
   public static void main(String[] args) {

       //CONSUMER

       /*
       // 1st way to represent - With lambda express

       //yahan hum string isliye pass kr rhe h kyuki parameter string type hoga
        Consumer<String> consumer1 = (str) -> System.out.println(str);

        // In Bifunction dekha jo apply tha waise hi yahan accept hota hain parameter ko value dene ke liye, and jo humne upar print statement diya hain usi se print hoga.
       // Aur yahan Multiple call hum kr skte hain.
        consumer1.accept("Hello");
        consumer1.accept("Hi");
      */





/*
       // 2nd way to represent - With method references

       // jaise humne dekha tha print statement me method reference lgta h
      //  bas ek line hi change krna tha.
       Consumer<String> consumer1 = System.out::println;
       consumer1.accept("Hello");
       consumer1.accept("Hi");

 */



/*
       // 3rd :- length of the string
       // Normal way
       Consumer<String>consumer2 = str -> System.out.println("Length : "+" "+ str.length());
       consumer2.accept("HelloBbu");
       consumer2.accept("Hi");
*/



       // 4th :- length of the string
       // Method Reference way
       Consumer<String>consumer2 = str -> System.out.println("Length : "+" "+ str.length());;
       consumer2.accept("HelloBbu");
       consumer2.accept("Hi");




       // 5. Real world Example of Consumer

       //Hum yahan kya karenge ki har ek number ko list me multiply by 2 karna h, suppose aise question ho aise solve krna h in Real Life Example
       // Yeh bohot shortline of code ho jaata h
       List<Integer> numbers = Arrays.asList(1,2,3,4,5);
       Consumer<Integer> multiplyByTwo = n -> System.out.println(n*2);
       // Yeh Jo foreach loop h isme waise bhi consumer hi leta h
       numbers.forEach(multiplyByTwo);

    }


}

