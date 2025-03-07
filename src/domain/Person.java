package domain;

public class Person extends AbstractEntity {
    private String name;

    public Person(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void display(){
        System.out.println("Person[ name =" + name );
    }
}
