package Day_4_EXCEPTION_HANDLING;


//D). Custom Exception
class hey{

}
//Library class
class Library {
    //Available Book 3 hain
    int availableBooks = 3;

    public void borrowBook(int booksRequestedCount) throws Exception {

           // Exception 1
            if (booksRequestedCount > availableBooks)
                // Here we are throwing exception but not handling it. InFact we will add one signature throws Jo Ki Void Ke Sath Likha Jayega throws Exception as we can see there in above
                throw new Exception("Not enough books are available");

            // Exception 2
           if (booksRequestedCount < 0)
           {
               throw new Exception("you must request at least one book");
           }
    }
}



public class LibraryDemo {
   public static void main(String[] args) {
       //B.
       //3.Making an object of library class
       Library library = new Library();

       // Yeh exception trow krega kyuki available books sirf 3 hain aur hum 10 chaah rhe h, isliye jo catch(Exception e) mein jo diya hain wohi msg show krega iske baad finally wala bhi o/p aayega woh hoga hi
       try {
           library.borrowBook(-10);
           //If Book 1 to 3 raha toh yes available otherwise Exception Occurred
           System.out.println("If your Request is from 1 to 3 then, Yes book is available");
       } catch (Exception e) {
           /*Yeh ho Gya Simple msg*/
           //System.out.println("Exception Occurred");

           /*Agar hum chahte jo Void function me throw me jo likha h wo as a error humein o/p de toh e.printStackTrace() ka use kr skte h*/
           //e.printStackTrace();

           /*Now we want that ki, Jo as a error aa rha h in Prinstacktrace wo as a output aaye toh e.getmessage() use kr skte h*/
           System.out.println("Exception Occurred" + " "+e.getMessage());

       }
   }
}













//A) Usage Of Try , Catch And Finally Block

////Library class
//class Library {
//
//     public void borrowBook(int booksRequested) {
//
//         //6. try and catch block, Yeh kya hoga ki in 5 no. we can see in below , jo hum outofbound wala jo access krna chahte the isme catch wala msg aa jayega . toh acha hoga without any error
//         // hum multiple catch block de skte h , and last me finally bhi
//         // ya toh catch block ko hum skip bhi kr skte h try ke saath sirf finally bhi rkh skte h. lekin yeh sahi tareeka nahi hain
//         try {
//             int[] books = {101, 102, 103};
//             System.out.println("Book Requested : " + books[booksRequested]);
//
//         }catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Exception Occurred, You requested a book is invalid! ");
//         }catch (NullPointerException e) {
//             System.out.println("NullPointerException");
//         } finally {
//             System.out.println("finally Block");
//         }
//
//         /*
//         //1.Array Books
//         int[] books = {101, 102, 103};
//         //2.Printing
//         System.out.println("Book Requested : " + books[booksRequested]);
//         */
//     }
//}

//public class LibraryDemo {
//    public static void main(String[] args) {
//
//        //A).
////       //3.Making an object of library class
////       Library library = new Library();
////
////       //4.Calling the borrowBook Method , we are not putting in print statement because it's a void type
////       // In the below one it will not give error
////       library.borrowBook(2);
////
////       //5. But in this it will give error, IndexOutOfBound error
////       // so, now we will see that how can we handle this.
////       library.borrowBook(3);
//    }
//};













////B). throw

////Library class
//class Library {
//    //Available Book 3 hain
//    int availableBooks = 3;
//
//    // yeh jo argument pass hain woh count krega jitna book requested hoga
//    public void borrowBook(int booksRequestedCount) {
//
//        try {
//
//            // This we have written in copy in detail, yahan humein array ka jrurat ngi para
//            if (booksRequestedCount > availableBooks)
//                throw new Exception("Not enough books are available");
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception Occurred, You requested a book is invalid! ");
//        }catch (Exception e) {
//            System.out.println("Throw will occur as bookRequestedCount is not Bigger than available books ");
//        }
//        finally {
//            System.out.println("finally Block");
//        }
//
//    }
//}
//
//
//
//public class LibraryDemo {
//    public static void main(String[] args) {
//        //B.
//        //3.Making an object of library class
//        Library library = new Library();
//
//        // Yeh exception trow krega kyuki available books sirf 3 hain aur hum 10 chaah rhe h, isliye jo catch(Exception e) mein jo diya hain wohi msg show krega iske baad finally wala bhi o/p aayega woh hoga hi
//        library.borrowBook(10);
//
//
//
//    }
//}














////C). throws
//
////Library class
//class Library {
//    //Available Book 3 hain
//    int availableBooks = 3;
//
//    public void borrowBook(int booksRequestedCount) throws Exception {
//
//        // Exception 1
//        if (booksRequestedCount > availableBooks)
//            // Here we are throwing exception but not handling it. InFact we will add one signature throws Jo Ki Void Ke Sath Likha Jayega throws Exception as we can see there in above
//            throw new Exception("Not enough books are available");
//
//        // Exception 2
//        if (booksRequestedCount < 0)
//        {
//            throw new Exception("you must request at least one book");
//        }
//    }
//}
//
//
//
//public class LibraryDemo {
//    public static void main(String[] args) {
//        //B.
//        //3.Making an object of library class
//        Library library = new Library();
//
//        // Yeh exception trow krega kyuki available books sirf 3 hain aur hum 10 chaah rhe h, isliye jo catch(Exception e) mein jo diya hain wohi msg show krega iske baad finally wala bhi o/p aayega woh hoga hi
//        try {
//            library.borrowBook(-10);
//            //If Book 1 to 3 raha toh yes available otherwise Exception Occurred
//            System.out.println("If your Request is from 1 to 3 then, Yes book is available");
//        } catch (Exception e) {
//            /*Yeh ho Gya Simple msg*/
//            //System.out.println("Exception Occurred");
//
//            /*Agar hum chahte jo Void function me throw me jo likha h wo as a error humein o/p de toh e.printStackTrace() ka use kr skte h*/
//            //e.printStackTrace();
//
//            /*Now we want that ki, Jo as a error aa rha h in Prinstacktrace wo as a output aaye toh e.getmessage() use kr skte h */
//            System.out.println("Exception Occurred" + " "+e.getMessage());
//
//        }
//    }
//}













