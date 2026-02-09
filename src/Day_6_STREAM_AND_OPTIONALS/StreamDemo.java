package Day_6_STREAM_AND_OPTIONALS;

//Util packages what we are using below
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
   public static void main(String[] args) {

      /* STREAMS */

     //Stream --> Assembly Line / Pipeline
     // If we create a list of items/List of object and we want to put it in the collections and process it we can use Streams
     // Before Streams we have to write so many lines of codes , but after java 8 it is introduced and it is easy to use
     //It is very Important concept

       //(i). We are printing the element with simple For-Each Loop
       List<String> items = Arrays.asList("Apple", "Grapes", "Mango");
       for(String fruit : items)
           System.out.println(fruit);






       //(ii) In above yeh ek simple example hain, Stream bht complicated code me use hota hain
       // But for understanding we will see the above one example using it streams
       // In this code same hum items list ko iterate kr rhe h . iska line of code bhi bht kam h

      // Stream<String> stream = items.stream(); //items list ko stream kr rha hain
      // stream.forEach((item) -> System.out.println(item)); // fir same hum foreach loop banaye . But yahan as lambda express denote kiye






       //(iii). By Implementing Method Reference
       Stream<String> stream = items.stream(); //items list ko stream kr rha hain
       stream.forEach(System.out::println); // fir same hum foreach loop banaye . But yahan as lambda express denote kiye






       //iv). We will filter the words by letter

      // System.out.println("== Filtered Fruits ==");
      /* Stream<String> streamNew = items.stream(); // We have make a new var i.e- streamNew, jo items list indicate kr rha ho point kr rha ho
       Stream<String> filterStream
               = streamNew.filter(name ->name.startsWith("M")); // Fir ek FilterStream ka variable banayenge aur jo streamNew krke point kiya tha usi me filter ka operation krenge lambda ka use ho rha hain yahan aur startsWith() krke ek Inbuit method  call kr rhe h isi me letter dena hoga ki kis letter se start hota h word filter krega tab hi
       filterStream.forEach(System.out::println); // Mango print hoga kyuki M se yehin start hota hain, yahan method reference ka use kr rhe h
      */






       //(v). Can be  concise the above code
       System.out.println("== Filtered Fruits ==");
       items.stream() // Created Stream
               .filter(name -> name.startsWith("A")) // Filtered it
               .forEach(System.out::println);  // print it




       /* (VI) USE-CASES :-
       *  A). Filtering = we have already seen
       *  B). Mapping = ek tarah ka element usko map krna chahte hain dusre tarike ke element se
       *  C). Aggregation =  Addition , multiply by 2, only even number addition.
       *  D). Searching = For Searching the Element
       *  E). Iteration = Print krna h, action perform krna hain har ek element pr
        */



   }
}
