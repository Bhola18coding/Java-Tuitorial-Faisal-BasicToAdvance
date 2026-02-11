package Day_6_STREAM_AND_OPTIONALS.Intermediate;

public class Book {
    //(i). We have define the variable of this class
    String title;
    int publicationYear;
    double price;
    String category;


    //(ii). We will now generate the constructors
    public Book(String title, int publicationYear, double price, String category) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.price = price;
        this.category = category;
    }

    // (iv) A). toString = Because we want to print the Book Object so humein yeh create krna hoga
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
