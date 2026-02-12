package Day_6_STREAM_AND_OPTIONALS.D.Terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class a_TerminalOperationsDemo {
   public static void main(String[] args) {

       /* TERMINAL OPERATOR */
       // Terminal Operators , intermediate operator ke baad use hota hain. There are types of Terminal Operators*/

       List<Integer> numbers = Arrays.asList(10,20,30,40, 55, 65, 20); //List




       /* (i) reduce() */
       // From the result we have in streams, we will make it one final result
       // 1st way:- LongCut
       System.out.println("== reduce() ==");
       System.out.println("== 1st way reduce() ==");
       Stream<Integer> integerStream = numbers.stream(); // Converted the above list into Stream
      // int sum = integerStream.reduce(0, (acc, num) -> acc + num); //this will work as an accumulator, the Dry run we have understood in copy.(version 1), yeh identity start hota hain, acc = accumulator result , num = current element in the stream, acc+num = new accumulated value, yahan hum new accumualted value ko hum define kr skte h yahan requirement tha sum, if we want multiply then yes we can
       int sum = integerStream.reduce(0, Integer::sum); // Method Reference
       System.out.println("SUM : " + sum);



       //2nd way = Shortcut way
       System.out.println("== 2nd way reduce() ==");
       int total = numbers.stream()
               .reduce(0, Integer::sum);
       System.out.println("TOTAL : " + total);











       /* (ii) collect () */
       // It is also a terminal operation, jo stream me result hain usko hum collect kr skte hain
       // collect hum different form me kr skte jaise , in list, set etc
       //Q). We will take out all the even-numbers from above list
       System.out.println("== collect() ==");

       //1st way = collecting in List
       System.out.println("== 1st way collect() , List ==");
       List<Integer> evenNumbers = numbers.stream()
               .filter(n -> n%2==0)
               .collect(Collectors.toList());
       System.out.println("Even Nos With List : " + evenNumbers);



       //2nd Way = Collecting in set
       System.out.println("== 2nd way collect() , Set ==");
       Set<Integer> evenNumbersSet = numbers.stream()
               .filter(n -> n%2==0)
               .collect(Collectors.toSet());
       System.out.println("Even Nos With Set : " + evenNumbersSet); // Unordered way me print hoga, duplicate value ko nhi print krega










       /*(iii) find & match */
       System.out.println("== find & match ==");
       // If humare paas list hain aur humain kuch find krna hain toh hum find & match ka use kr skte h

       // a). find - findFirst, findAny
       System.out.println("== find ==");
       System.out.println(numbers.stream().findFirst().get()); // o/p:- 10
       System.out.println(numbers.stream().findAny().get());  // o/p:- 10

       // b). match = anyMatch, allMatch, noneMatch
       // we will match that ki 40 number ka element h ki nhi humare list , if hain then true, otherwise false
       System.out.println("== match ==");
       boolean has40 = numbers.stream()
               .anyMatch(n -> n==40); // yeh jo anymatch ke andar hain yeh predicate hain
       System.out.println(has40);









       /* (iv) Iteration */
       System.out.println("== Iterator ==");
       System.out.println("== 1st way Iterator ==");
       numbers.stream()
               .forEach(n-> System.out.println(n));


       System.out.println("==  2nd way Iterator (Method Reference)  ==");
       numbers.stream()
               .forEach(System.out::println);

   }
}
