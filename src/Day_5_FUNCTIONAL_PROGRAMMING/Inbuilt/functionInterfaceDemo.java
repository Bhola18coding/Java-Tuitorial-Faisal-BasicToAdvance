package Day_5_FUNCTIONAL_PROGRAMMING.Inbuilt;

import java.util.function.Function;

public class functionInterfaceDemo {

     /* FUNCTION INTERFACE - Yeh Hum use krte jab ek Input Pass krna h aur ek Output hi chahiye tab */
    // (I)
    /* Yeh Function Interface hain, Functional Interface & Function Interface dono alag hain, In Functional Interface phele Humein Interface banana padta fir Notation , and fir uska lambda express krna hota, But yahan Hum ek hi line me kr de rhe h  */
    // In Functional Interface hum log argument ek se jyada de skte the, But In this hum bs ek hi argument de skte hain sirf ek
    // Yeh class ke andar banta h and jo Iska result jo hain woh humein Main function me print krna padta hain

    // ADD Function
     public  static Function<Integer, Integer> addFunction = (a) -> a + 3;

     // Sub Function
     public  static Function<Integer, Integer> subFunction = (a) -> a - 5;


    public static void main(String[] args) {

       // (II)
       // Jo upar wala Function Interface hain uska addFunction ko print kr rhe h In main Function
       // Jo a ka value hain woh yahan .apply krke dena hain humein
       // Add
       System.out.println(addFunction.apply(100));

       // Sub
        System.out.println(subFunction.apply(100));
    }
}
