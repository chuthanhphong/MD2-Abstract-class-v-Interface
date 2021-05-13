package Abstract;

public class chicken extends Animal implements Editbale {
    @Override
    public String makeSound() {
        return "Chicken sound";
    }

    @Override
    public String Howtoeat() {
        return "cluck cluck";
    }
}
