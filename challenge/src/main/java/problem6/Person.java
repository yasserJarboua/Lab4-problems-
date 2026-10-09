package problem6;

public class Person {
    private String name;
    public Person(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "I am "+this.name;
    }
    public void display(){
        System.out.println(this.toString());
    }
}
