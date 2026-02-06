package Day_5_FUNCTIONAL_PROGRAMMING.Inbuilt;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferencesDemo {
   public static void main(String[] args) {

       /*  Method references  Indicate to this syntax - ::, Aur yeh ek Short hand notation hota hain , Jiske jariye hum method ko refer kr skte hain*/

       //1ST
       //Traditional WAY, Bruteforce check krenge phele fir optimize me jayenge
       //Yahan hum list bana rhe hain but , array class se hi hum element put krenge yahan hum arraylist ka use ni krenge.
       // Array ek aisa class jisme Copy, Binarysearch, sort sab kr skte h
       List<String> names = Arrays.asList("Alice", "Bob", "Charlie");


       //(i) - By For Loop to iterate
       System.out.println("By For Loop");
       for(int i=0; i< names.size(); i++) {
           System.out.println(names.get(i));
       }



       //(ii) - By For Each Loop (Enhanced For Loop)
       System.out.println("By For Each");
       for(String name : names)
           System.out.println(name);



       //(iii) - By using Consumer for each
       System.out.println("By For Each Consumer");
       //Yahan jo names. hain woh list ka naam h jisme humara elements h sab.
       // Toh usse hum forEach bana rhe h, Jisme consumer le rha h aur fir ovveride krke ek accept ka method aa rha jisme parameter uss element ka type likhene and ek variable fir wohi variable ko print krenge hum.
       // hum log wohi type pass krenge in accepts method jis type ka elements iterate krna rhega. We can see in Below
       names.forEach(new Consumer<String>() {
           @Override
           public void accept(String name) {
               System.out.println(name);
           }
       });




       //(iv) - By lambda expression to optimize above code of consumer
       System.out.println("By Lambda");

       names.forEach((String s) ->{
           System.out.println(s);
       });



       //(v) - By lambda , But ab hum datatype nhi denge . isko ~ INFERRED  kehte h
       System.out.println("By Lambda Using INFERRED");

       names.forEach((n) ->{
           System.out.println(n);
       });



       //(vi) - we can remove the Curli Brackets also because ek hi line ka code hain
       System.out.println("By Lambda Using INFERRED, And in line ");

       names.forEach((n) -> System.out.println(n));









       //2nd
       //Lambda with Method References
       System.out.println("By Lambda With Method References ");

       //It is best way to iterate as we have seen from above that the transition kaise bade se chota syntax krna hota hain.
       // System.out::println aisa hain syntax mtlb ki :: println (Prnt krna h names naam ke list ko)
       // Isse Readability badh jata hain Code ka , Chota sa method hain toh thik h
       names.forEach(System.out::println);


   }
}
