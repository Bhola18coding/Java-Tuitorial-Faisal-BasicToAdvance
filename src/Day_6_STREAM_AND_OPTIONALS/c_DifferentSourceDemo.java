package Day_6_STREAM_AND_OPTIONALS;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class c_DifferentSourceDemo {
    public static void main(String[] args) {

        /*There are different sources to create stream . all the things we have written in copy*/
        // Now we will see one by one the creation of Stream



       //1). From Collection Source to make Stream :- collection.stream().
       System.out.println("COLLECTION STREAM");
       List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
       Stream<Integer> integerStream = numbers.stream(); // numbers is collection= collection.stream() , Jo ki hum iska stream bana rhe hain
       integerStream.forEach(System.out::println);




       //2). From Arrays Source to make Stream :- Arrays.stream(array)
       System.out.println("ARRAYS STREAM");
       int[] numberArray = {1,2,3,4,5};
       IntStream arrayStream = Arrays.stream(numberArray); // Yahan Stream ki Jagah Intstream isliye hoga kyuki Primtive Data type int h array ka
       arrayStream.forEach(System.out::println);





       //3). From Specific Values Source to make a stream :- Stream.of("a", "b", "c")
       //4). From Functions :- Stream.iterate(0, n->n+2)
      /* System.out.println("SPECIFIC AND FUNCTIONS WE WILL DO IN SAME ONLY");
       Stream<String> stringStream = Stream.of("a", "b", "c"); // From Specific Values
       Stream<Integer> integerStream1 = Stream.iterate(0, n -> n+2); // From Functions
       integerStream1.forEach(System.out::println); // It will give infinite output, 2 add hote jayega
      */




       //5). From Files Source  to make stream :- Files.lines(path)
        System.out.println("FILES STREAM");
       try {
           Stream<String> fileStream = Files.lines(Path.of("PATH")); // yahan try catch aayega if file ka path naa mile toh catch par jayega jo Ki obvious hain nhi milega , kyuki Valid Url Path nahi hain.
       } catch (IOException e) {
           throw new RuntimeException(e);
       }




       //6). Empty Stream
        System.out.println("EMPTY STREAM");
       Stream<String> emptyStream = Stream.empty();
   }

}
