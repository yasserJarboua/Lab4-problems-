package problem6;

public class Carpenter extends Person {
    public Carpenter(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString()+" the Carpenter";
    }

}
