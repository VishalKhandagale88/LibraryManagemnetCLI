package domain;

public class Book extends AbstractEntity {
    private final String title;
    private final String author;
    private final String genre;
    private boolean issued;

    public Book(String title, String author, String genre, boolean issued) {
        super();
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.issued = issued;
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
}

