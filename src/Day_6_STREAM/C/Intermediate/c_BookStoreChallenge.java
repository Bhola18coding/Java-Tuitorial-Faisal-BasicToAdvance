package Day_6_STREAM.C.Intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class c_BookStoreChallenge {
   public static void main(String[] args) {

       /*In This Class We Will Practice Whatever We Learned Just Before*/

       /*We will use here the same Book List only*/
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


       /* SOLVING IN - SHORTCUT WAY*/

       //1. Identify all books that are priced over $20
       System.out.println("== Identify all books that are priced over $20 ==");
       books.stream().filter(b-> b.price>20).forEach(System.out::println); //we have done in a shortcut way here in filter book ek var hain b bhi likh skte hain.



       //2. Identify and Display books that we published before the year 2000
       System.out.println("== Identify and Display books that we published before the year 2000 ==");
       books.stream().filter(b-> b.publicationYear<2000).forEach(System.out::println);


       //3. Add suffix "(Coming Soon)" to all the current titles
       System.out.println("== Add suffix \"(Coming Soon)\" to all the current titles ==");
       books.stream().map(b-> b.title +" "+  "(Coming Soon)" ).forEach(System.out::println); // map isliye use hoga kyuki hum transform kr rhe hain. filter use nhi hoga



       //4. Display the books sorted by their prices in Ascending order
       System.out.println("== Display the books sorted by their prices in Ascending order ==");
       books.stream()
               .sorted(Comparator.comparingDouble(b-> b.price))
               .forEach(System.out::println);



       //5. Rare Books is One where the title has mre than 20 characters
       System.out.println("== Rare Books is One where the title has mre than 20 characters ==");
       books.stream()
               .filter(b-> b.title.length() > 20)
               .forEach(System.out::println);

   }
}
