package Day_6_STREAM_AND_OPTIONALS.D.Terminal;

public class BookMaker {
    //(i). We have define the variable of this class
    String title;
    int publicationYear;
    double price;
    String category;


    //(ii). We will now generate the constructors
    public BookMaker(String title, int publicationYear, double price, String category) {
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

    //v) Getter and Setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
