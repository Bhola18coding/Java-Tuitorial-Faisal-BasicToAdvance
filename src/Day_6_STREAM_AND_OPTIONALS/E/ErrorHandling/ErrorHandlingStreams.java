package Day_6_STREAM_AND_OPTIONALS.E.ErrorHandling;

import java.util.List;

public class ErrorHandlingStreams {
  public  static void main(String[] args) {

       /* Try & Catch in Stream */
      // Yes we can use try and catch in stream
      List<String> books = List.of("Java", "Python", "C++");
                books.stream()
                        .forEach(b->{
                            try{
                                if(b.equals("Python")) // agar python hain toh Error dega jo ki diya hain i.e-> Invalid Book
                                    throw new RuntimeException("Invalid Book");
                                System.out.println(b);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        });
    }
}
