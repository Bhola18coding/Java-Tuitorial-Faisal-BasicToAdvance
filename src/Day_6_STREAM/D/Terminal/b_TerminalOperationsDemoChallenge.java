package Day_6_STREAM.D.Terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class b_TerminalOperationsDemoChallenge {
    public static void main(String[] args) {
        // (iii)
        List<BookMaker> books = Arrays.asList(
                new BookMaker("Effective Java", 2017, 45.50, "Technology"),
                new BookMaker("The Alchemist", 1988, 12.99, "Fiction"),
                new BookMaker("Atomic Habits", 2018, 18.20, "Self-Help"),
                new BookMaker("The Rust Programming Language", 2018, 35.00, "Technology"),
                new BookMaker("Brave New World", 1932, 14.50, "Dystopian"),
                new BookMaker("The Silent Patient", 2019, 11.00, "Thriller"),
                new BookMaker("Heads First Java", 2003, 29.99, "Technology"),
                new BookMaker("Meditation", 2015, 9.99, "Philosophy"),
                new BookMaker("The Midnight Library", 2020, 16.50, "Fiction"),
                new BookMaker("Design Patterns", 1994, 55.00, "Technology")
        );



        /* Challenge 1- Total cost of all books in the bookstore */
        System.out.println("=== Total cost of all books in the bookstore ===");
        Double bookCost = books.stream()
                .mapToDouble(book -> book.price) // yeh isliye use kiya kyuki Jo Bookmaker ka object hain usme humein bs Price chahiye
                .reduce(0, Double::sum); // fir accumulate kr denge
        System.out.println(bookCost);






        /* Challenge 2- Collecting books into a list of titles */
        System.out.println("=== Collecting books into a list of titles ===");
        List<String> bookTitles = books.stream()
                .map(book -> book.title)
                .collect(Collectors.toList());
        System.out.println(bookTitles);







        /* Challenge 3-  Grouping Books by Category */
        // 1st way
       /* System.out.println("=== 1st way-  Grouping Books by Category ===");
         Map<String, List<BookMaker>> byCategory = books.stream()
                 .collect(Collectors.groupingBy(bookMakerStringFunction)); // yeh niche wala function le rha hain
         byCategory.forEach((category, bookList) -> {

                bookList.forEach(System.out::println);

         });

    }

    static Function<BookMaker, String> bookMakerStringFunction = new Function<BookMaker, String>() {
        @Override
        public String apply(BookMaker bookMaker) {
            return bookMaker.getCategory();
        }
    };*/







        //2nd Way
        System.out.println("=== 2nd way - Grouping Books by Category ===");

        Map<String, List<BookMaker>> byCategory = books.stream()
                .collect(Collectors.groupingBy(BookMaker::getCategory)); // yeh niche wala function le rha hain
        byCategory.forEach((category, bookList) -> {

            bookList.forEach(System.out::println);

        });
    }

}
