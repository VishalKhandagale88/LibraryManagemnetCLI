package domain;

public abstract class AbstractEntity {
    // 1st object
    // 0.0 1
    // 2nd object
    // 0.0 2
    // 3rd object
    // 0.0 3
    private static long idCounter = 0;
    private final long id;  // 0.0

    public AbstractEntity() {
        this.id = idCounter++;
    }

    public long getId() {
        return id;
    }

    public abstract void display();

}
