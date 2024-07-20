package domain;

public class Book extends AbstractEntity implements Comparable<Book> {
    private final String title;
    private final String author;
    private final String genre;
    private boolean issued;

    public Book(String title, String author, String genre) {
        super();
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.issued = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }
    @Override
    public void display(){
        System.out.println("Book[ title =" +title + "author ="+author+", genre ="+genre+" , issued="+issued);
    }
    @Override
    public int compareTo(Book other){
        // for number comparision
//        return Integer.compare(this.title,other.title);

        // for string
        return this.title.compareTo(other.title);
    }
}

