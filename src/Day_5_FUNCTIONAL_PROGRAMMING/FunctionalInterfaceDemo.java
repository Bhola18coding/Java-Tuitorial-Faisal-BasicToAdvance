package Day_5_FUNCTIONAL_PROGRAMMING;



//B). LAMBDA EXPRESSION

@FunctionalInterface

//1- Assignment-01 - without parameter
//As we can see that there is only one Abstract method hain . so that is = Functional Interface
 interface BookAction {
    void perform();

}

//2- Assignment -02-With Parameter
/*(VI) Assignment - Now we have to do with Parameters In method*/
@FunctionalInterface
interface Operation{
    int add(int a, int b);
}

//(i)LAMBDA EXPRESSION = Jo code ko concise way me likh de . eg:- 4 line code ko ek me likh de (It will Be very UseFull)

//PARAMETER -> expression Body
// () -> {}

public class FunctionalInterfaceDemo {
  public static void main(String[] args) {

      //ASSIGNMENT-01

    //(ii) Jab Hum Object banayenge upar wale Interface ka toh jo Abstract method h woh auomatically aa jayega Override ho kar aur bolega that define me
    // But , Itne saare line of code hain in Below woh hum replace kr skte h with lambda.
    // Kyuki FunctionalInterface h toh java bhi jaanta h ek hi method isko hum Concise kr skte h confusion nhi hoga Developer ko
    // Humesha yaad rkhna h That Lambda Expression Humesha Functional Interface Mein hi lagega.

      //(iii) original Syntax = lengthy
      //STEP-01
    /*  BookAction action = new BookAction() {
          @Override
          public void perform() {
              System.out.println("Action Performed");
          }
      };

      action.perform(); */


      //(IV) Lambda Expression = Yahan Hum Interface ka naam hi le rhe h kyuki yahan bs ek hi abstact method hoga toh jaan hi jayega kon h kon nhi.
      // Yeh Humara code phele se Concise ho gya Hain.
      //STEP-02
      BookAction action = () -> {
          System.out.println("Action Performed");
      };
      action.perform();



      //(V) agar ek line ka hi expression/Definition hain toh hum without {} bhi use kr skte hain.
      // STEP-03
      BookAction action2 = () -> System.out.println("Only one line Definition . So don't required {}");
      action2.perform();



      //ASSIGNMENT-02

      /*(VII). Now we will do lambda expression Fo assignment -2 */
      // At first By Odject.
      //Step-01 - Original Syntax
      Operation op = new Operation() {
          @Override
          public int add(int a, int b) {
              return 10+20;
          }
      };
      System.out.println(op.add(10, 20));



      //STEP-02 , With lambda Expression
      Operation op1 = (int a, int b) -> {
          return a+b;
      };
      System.out.println(op1.add(20,30));



    // Assignment-03
    //Till Now We have done the Custom One , Now we will learn about Inbuilt Functional Interface
    //THREAD CLASS = RUNNABLE INTERFACE
      /*
      new Thread(new Runnable() {
          @Override
          public void run() {

          }
      }).start();
     */
      //Step-02
      new Thread (() -> System.out.println("New Thread Created")).start();

  }

}























////A. FUNCTIONAL INTERFACE
////(ii) We can give the annotation also, But it's not Mandatory, But Jo dusra developer hoga usko pta chlega that yes it is functionalInterface
//@FunctionalInterface
//
////(i) As we can see that there is only one Abstract method hain . so that is = Functional Interface
//interface BookAction {
//    void perform();
//    //(iii) If Hum dusra abstract method banayenge toh @FunctionInterface error dega
//    // void perform();
//
//}
//
//public class FunctionalInterfaceDemo {
//    public static void main(String[] args) {
//
//    }
//
//}
