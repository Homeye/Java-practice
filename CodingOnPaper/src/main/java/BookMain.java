import java.util.ArrayList;
import java.util.List;

public class BookMain {

    /**
     * Finds the oldest book from a list
     *
     * @param books list of books
     * @return the oldest book's issue year
     */
    public int getOldestBookIssueYear(List<Book> books) {
        int result = Integer.MAX_VALUE;
        for (Book book : books) {
            if (book.getIssueYear() < result) {
                result = book.getIssueYear();
            }
        }
        return result;
    }

    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<Book>();
        Book book1 = new Book("Book1", 2014);
        Book book2 = new Book("Book2", 2017);
        Book book3 = new Book("Book3", 2013);
        Book book4 = new Book("Book4", 2000);
        Book book5 = new Book("Book5", 1953);
        Book book6 = new Book("Book6", 1978);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);

        System.out.println(new BookMain().getOldestBookIssueYear(bookList));

    }
}
