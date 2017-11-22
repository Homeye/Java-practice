public class Book {

    /**
     * Book class for BookMain
     */
    private String title;

    private int issueYear;

    public Book(String title, int issueYear) {
        this.title = title;
        this.issueYear = issueYear;
    }

    public String getTitle() {
        return title;
    }

    public int getIssueYear() {
        return issueYear;
    }

}
