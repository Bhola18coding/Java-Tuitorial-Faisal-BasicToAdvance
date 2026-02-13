package Day_7_OPTIONALS;

import java.util.Optional;

public class a_NPEDemo {
    public static void main(String[] args) {

        /*OPTIONALS*/
        String name = null;


        //1st - With If-Else
        /*This is Not the proper code , we have to concise the code . we can do it by Optionals */
        if(name!=null)
        System.out.println(name.length());
        else
            System.out.println("No name Value");




        //2nd  - With Optionals (Intro In Java 8)
        //Creating Optional
        System.out.println("=== CREATING OPTIONAL ===");
        Optional<String> optionalString = Optional.of("Java"); // .of = yeh jo optional me humne string define kiya hain mtlb ki , ek Optional Box hain usme String define hain, jisme Java hain. return Optional[java]
        System.out.println(optionalString);



        //empty Optional
        System.out.println("=== EMPTY OPTIONAL ===");
        Optional<String> empty = Optional.empty(); //  .empty = yeh empty Optional ko define krta hain . return .empty
        System.out.println(empty);




        //null Optional
        System.out.println("=== NULL OPTIONAL ===");
        Optional<String> mayBe = Optional.ofNullable(null); // .ofNullable = define the null value , and return .empty
        System.out.println(mayBe);




        //If we are Give null in of . then we will get NULL-POINTER-EXCEPTION
       /* System.out.println("=== NULL-POINTER-EXCEPTION ===");
        Optional<String> val = Optional.of(null); // in of if we write null , it will return NULL POINTER EXCEPTION
        System.out.println(val);
       */



        //Checking Values = isPresent()
        System.out.println("=== isPresent() ===");
        System.out.println(optionalString.isPresent()); // true because, java is present
        System.out.println(mayBe.isPresent()); // false , because in mayBe null is pass.



        //isEmpty()
        System.out.println("=== isEmpty() ===");
        System.out.println(optionalString.isEmpty()); // false because, java is present
        System.out.println(mayBe.isEmpty()); // true , because in mayBe null is there toh empty hain.



        //get() = we can retrieve the value
        System.out.println("=== get() ===");
        System.out.println(optionalString.get()); // we will get here "Java"
        System.out.println(mayBe.get()); // no such element exception






        /*3rd = By Safe how can we retrieve value from Optional */

        //(i) orElse()
    }
}
