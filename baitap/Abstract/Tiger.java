package Abstract;

public class Tiger extends Animal implements Editbale {

    @Override
    public String makeSound() {
        return "Tiger sound" ;
    }

    @Override
    public String Howtoeat() {
        return "guugugu";
    }
}
