package Day_5_FUNCTIONAL_PROGRAMMING.Inbuilt;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {

    //Bi-Function Method

    /* (A) ADDITION

    //(i)
    //Yahan 3 parameter pass hota h, 1 and 2 (Integer for argument) and 3rd Integer for return Output
    //Same Lambda Express jaise hi hoga  function = (Isme parameter pass hoga do) -> operation
    */
    public  static BiFunction<Integer, Integer, Integer> addFunction
            = (a, b) -> a+b;

    //(iii)
    // We can replace the above i.e = (a,b) -> a+b to = Integer :: sum (this is method reference)
    // Kyuki Integer value le rha h and sum kr rhe h and Method reference ko pta h bi function h toh do hi value hoga
         // = Integer::sum;



    //(B). SUBTRACTION
    //(i)
    public static BiFunction<Integer, Integer, Integer>subtraction
            =(a,b) -> a-b;



  public static void main(String[] args) {

      //(A).
      //(ii) Aur O/p jo function usko call krke .apply function lga denge jisme value hoga jo hain 10 and 20 yaa fir kuch bhi
      System.out.println(addFunction.apply(10,20));


      //(B).
      //(ii) We are printing the subtraction method
      System.out.println(subtraction.apply(20, 10));






      //(C). CHAINING IN BIFUNCTION

      // Yahan Function Inbuilt me Multiply ko create kr lenge do integer kyuki ek argument and ek result
      Function<Integer, Integer> multiplyby2 = x-> x * 2;
      // Fir, Hum bi-function me 3 argument pass krenge as we already discussed in above usme combined function declare krenge
      BiFunction<Integer, Integer, Integer>combinedFunction =
      // and jo addfunction hain woh krenge fir uske baad multiplyby2 function bhi krenge andthen mein isliye (multiplyby2) diya hain
              addFunction.andThen(multiplyby2);

      // we are passing here 3,5 i.e -> 3+5=8 andthen (8*2) = 16 answer
      System.out.println(combinedFunction.apply(3,5));
    }


    }

