package Day_7_OPTIONALS;

import java.util.Optional;

public class b_FunctionalOperations {
    public static void main(String[] args) {

        Optional<String> name = Optional.of("Python");
        Optional<String> nullVal = Optional.ofNullable(null);



        /* (i) ifPresent() */
         // Check that optional me value hain yaa nahi

        //a). on name
        System.out.println(" == Implementing ifPresent() on name ");
        name.ifPresent(value -> System.out.println(value)); // name present h toh print . toh woh value me name print hoga.
       // name.ifPresent(System.out::println); // By method Reference

        //b) on nullVal
        System.out.println(" == Implementing ifPresent() on nullVal ");
        nullVal.ifPresent(value2 -> System.out.println(value2)); // nullVal  me ofnullable(null) hain , toh kuch print nahi hoga
     // nullVal.ifPresent(System.out::println); // By method reference






        /* (ii) map() */
        // ek string parameter leta hain aur  Optional  value return  krega

        // a). on name
         System.out.println(" == Implementing map() on name ");
         Optional<String> upperCase = name.map(value -> value.toUpperCase());
         System.out.println(upperCase.orElse("default")); // if value hain toh uppercase kr do warna if null hain yaa empty h toh default print kr do


        // b). on nullVal
        System.out.println(" == Implementing map() on nullVal ");
        Optional<String> upperCase1 = nullVal.map(value -> value.toUpperCase());
        System.out.println(upperCase1.orElse("default")); // if value hain toh uppercase kr do warna if null hain yaa empty h toh default print kr do




        /* (iii) filter() */
        // Predicate lega aur ek optional value return krega

        // a). on name
        System.out.println(" == Implementing filter() on name ");
        Optional<String> temp = name.filter(n-> n.startsWith("P"));
        temp.ifPresent(System.out::println);  // if name optional me p hain toh Python print ho jayega warna kuch nhi print hoga

        // we can concise the above code
        System.out.println(" == Implementing filter() on name In a Concise way ");
        name.filter(n-> n.startsWith("P"))
                .ifPresent(System.out::println);





        /*COMBINED OPERATION = PIPELINE OF CHAINING*/
        System.out.println(" === Implementing COMBINED OPERATION = PIPELINE OF CHAINING of all above operation in name === ");
        name.filter(b-> b.startsWith("P")) // if name starts with P
                .map(String::toUpperCase)        // convert it into uppercase
                .ifPresent(System.out::println); // if present then print it. if nahi h then kuch nahi print hoga
    }
}
