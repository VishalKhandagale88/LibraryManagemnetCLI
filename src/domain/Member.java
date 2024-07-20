package domain;

public class Member extends Person{
    private final int memberId;

    public Member(String name, int memberId) {
        super(name);
        this.memberId = memberId;
    }

    public int getMemberId() {
        return memberId;
    }
    @Override
    public void display(){
        System.out.println("Member[ name =" + getName() +" , memberId="+memberId+"]" );
    }
}
