package problem6;

public class Plumber extends Person{
    public Plumber (String name){
        super(name);
    }

    @Override
    public String toString() {
        return super.toString()+" the Plumber";
    }

}
