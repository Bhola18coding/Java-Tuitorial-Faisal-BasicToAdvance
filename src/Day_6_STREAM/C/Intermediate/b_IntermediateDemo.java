package Day_6_STREAM.C.Intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class b_IntermediateDemo {
   public static void main(String[] args) {

       /*(iii) List Of Book*/
       //Yeh humne isliye create kiya hain kyuki - Agar hum Object ke saath kaam kr rhe h aur humare paas yeh book class hain, tohhumare pass list ki object kahi se v aa skti hain, maan lijiye hum Database se saari ki saari books fetch kr rhe hain ki kitne books hain humare software me
       // toh humein isi tarah se list milegi lekin data base se, hum agar kisi 3rd part API ko call krke data le skte hain . toh woh v humein list ke form me hi milegi
       // Humare paas avi koi data base toh hain nhi naa hi koi 3rd party API toh humne yahan hard code list hi bana diye hain
       List<a_Book> books = Arrays.asList(
               new a_Book("The Great Gatsby", 1925, 15.99, "Fiction"),
               new a_Book("1984", 1949, 12.50, "Dystopian"),
               new a_Book("The Hobbit", 1937, 20.00, "Fantasy"),
               new a_Book("A Brief History of Time", 1988, 18.99, "Science"),
               new a_Book("The Catcher in the Rye", 1951, 10.99, "Fiction"),
               new a_Book("Sapiens", 2011, 22.50, "History"),
               new a_Book("Clean Code", 2008, 45.00, "Technology"),
               new a_Book("The Alchemist", 1988, 14.25, "Adventure"),
               new a_Book("Dune", 1965, 25.99, "Science Fiction"),
               new a_Book("Thinking, Fast and Slow", 2011, 21.00, "Psychology")
       );



       //(iv) NOW WE WILL SEE SOME SCENARIO KI HUM CUSTOM CLASS ME STREAM KA KAISE USE KRE.
       // WE WILL DO SOME OPERATION


       /* A) FILTERING: Books Cheaper than $20 */
       System.out.println("== FILTER EXAMPLE ==");

       //1st way = shortcut way
      /* Stream<Book> stream1 = books.stream(); // Filter = Book Object ka Stream Banega
       Stream<Book> stream2=stream1.filter(b-> b.price < 20); // yeh jo filter me kr rhe h yeh predicate ka symbol h as we already seen it.(input  -> predicate leta hain. (short-way) iss filter ko humein stream var ke andar hi define krna hoga
       stream2.forEach(System.out::println); // For printing humein foreach loop chahiye , method Reference me print kr rhe h, and book ek object ko hum print kr rhe h toh toString lgega i.e- in Book class
      */


       //2nd way = long cut Expanding way
       /*Stream<Book> stream1 = books.stream();
       Stream<Book> stream2 = stream1.filter(predicate); // long cut= isme jo niche expanded way me predicate ko define kiya hain wohi yahan pass kiya hain, lekin iss filter ko humein stream var ke andar hi define krna hoga , isliye hum shortcut me hi jayenge from next time
       stream2.forEach(System.out::println); // For printing humein foreach loop chahiye , method Reference me print kr rhe h, and book ek object ko hum print kr rhe h toh toString lgega i.e- in Book class
      */


       // 3rd Way = Chaining method
          Stream<a_Book> filteredBook = books.stream()
                      . filter(book -> book.price < 20);
                  filteredBook.forEach(System.out::println);









        /*B). MAPPING :- Convert Book Titles to Uppercase*/
           System.out.println("== MAP EXAMPLE ==");
            Stream<String> upperCaseTitles = books.stream() //string ka stream banega isme Object nhi lega, in map string type ka stream banega
                    .map(book -> book.title.toUpperCase()); // Book ke kisko uppercase dena h define krna h humein
            upperCaseTitles.forEach(System.out::println); //print kr dena hain humein by foreach loop






        /* C). SORTING :- Books By Publication Data*/
       System.out.println("== SORTING EXAMPLE ==");
       Stream<a_Book> sortedBooks = books.stream() // we will first make the books stream in Sorting, Book object ka stream banega
               .sorted(Comparator.comparingInt(book -> book.publicationYear)); // Yahan hum Sorted comparator ka use krenge. yeh publication year ko sort krte rhega year by year
       sortedBooks.forEach(System.out::println); // and fir usko print kr denge






       /* D). DISTINCT:- Remove duplicate Titles */
       System.out.println("== DISTINCT EXAMPLE ==");
       Stream<a_Book>distinctBook = books.stream().distinct(); // saara duplicate ko remove krke distict value dega
         distinctBook.forEach(System.out::println); // printing the distinct value








         /* E). LIMIT :- If we want to Display only the first 3 books*/

       // 1st way
       System.out.println("== 1st Way LIMIT EXAMPLE ==");
       Stream<a_Book> firstThreeBooks = books.stream()
               .limit(3);
       firstThreeBooks.forEach(System.out::println);



       //2nd way
       System.out.println("== 2nd Way LIMIT EXAMPLE WITH SORTING CHAIN BY PUBLICATION YEAR ==");
       Stream<a_Book> firstThreeBookBySortChain = books.stream()
               .sorted(Comparator.comparingInt(book -> book.publicationYear)) //Yahan sort hoga year wise
               .limit(3); // yahan sort ke hisab se first 3 book dega output
       firstThreeBookBySortChain.forEach(System.out::println);







       /*F). SKIP:- Skip the first 2 books */
       System.out.println("== SKIP:- Display After skipping first 2 Books ==");
       Stream<a_Book> afterSkipTwo = books.stream()
               .skip(2);
       afterSkipTwo.forEach(System.out::println);

    }

    /*A) 2nd way. Expand way of filter by defining the whole predicate*/
    /*static Predicate<Book> predicate = new Predicate<Book>() {
        @Override
        public boolean test(Book book) {
            return book.price <20;

        }
    };*/
}
