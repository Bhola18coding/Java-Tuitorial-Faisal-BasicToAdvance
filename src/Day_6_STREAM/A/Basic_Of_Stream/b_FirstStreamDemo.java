package Day_6_STREAM.A.Basic_Of_Stream;

//Util Packages
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class b_FirstStreamDemo {
   public static void main(String[] args) {
       //Source
       List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

       //Intermediate
       //LIST:- EVEN NUMBER from "numbers" list
       // Humein iss List me bs Even numbers hi chahiye




       /* ITERATION - 3 */
       //C).ADVANCE LEVEL :- We will do the above code in one line only
       // i) AT first we are converting our list to stream.
         List<Integer> evenNumbers3 = numbers.stream()
       // ii)  and then we are filtering it . we are putting the p2 var as in below we have done the operation in predicate
                 .filter(p2)
       // iii) we don't have to use predicate also we can directly assign to, But aise assign krne ke liye  stream ka util package hona jruri hain warna error dega filter
       // and integer jo de rhe h woh Predicate se aa rha hain
                 .filter(integer -> integer%2==0)
        // iv). we are putting the filter content into this collect, this is terminal
                 //.collect(Collectors.toList());
         // v) we can use method reference also
                .toList();
       System.out.println("Even Numbers With Streams 2: "+ " "+ evenNumbers3);
   }

   //C).  vi) concise code of Predicate even number operation
    static  Predicate<Integer> p2 = (integer) -> integer % 2 == 0;
}































/*

//ITERATION - 1 = BASIC LEVEL (Using For-Each Loop)
//Source
List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

//Intermediate
//LIST:- EVEN NUMBER from "numbers" list
// Humein iss List me bs Even numbers hi chahiye

// ITERATION - 1 - USING FOR-EACH
//A). BASIC LEVEL :- Hum yahan forEach loop use krenge
List<Integer> evenNumber1 = new ArrayList<>();
        for(int num:numbers) {
        if(num%2==0)
        evenNumber1.add(num);
        }
                System.out.println("Even Numbers With ForEach : "+ " "+ evenNumber1);
 */















// Iteration - 02 - Using Stream But in medium level
/*
//Source
List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

//Intermediate
//LIST:- EVEN NUMBER from "numbers" list
// Humein iss List me bs Even numbers hi chahiye


// ITERATION - 2 - USING STREAM IN DETAILS

//B).MEDIUM LEVEL = Using Streams
//(i) Conversion from list to stream first in below line, of Integer type and numbers is the list name and integerNumber1 is the variable.
Stream<Integer> integerStream1 = numbers.stream();
//(ii) Now we will filter the even number from the list. so here we will do not shortcut but we will write predicate code also at below aur yahan predicate ka variable pass kr dunga, phele p pass kr rhe the abi predicate code ko concise krke jo p2 variable hain usko pass krenge
Stream<Integer> FilterIntegerStream2 = integerStream1.filter(p2);
List<Integer> evenNumber2 = FilterIntegerStream2.toList();
       System.out.println("Even Numbers With Streams 1: "+ " "+ evenNumber2);


//B). (iii) we will write the predicate also now, Jo filter me dena hota , baad me hum shortcut ka use krenge but now hum pura details me kr lete hain.
    static Predicate<Integer> p = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            int remainder = integer % 2;
            if(remainder==0)
                return true;
            return false;
        }
    };


   //B). (iv) we can also Concise the predicate code i.e- (iii). but here we are using lambda
    static  Predicate<Integer> p2 = (integer) -> integer % 2 == 0;
}
 */