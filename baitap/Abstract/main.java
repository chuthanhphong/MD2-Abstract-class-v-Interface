package Abstract;

public class main {
    public static void main(String[] args) {
        Animal[] animals= new Animal[2];
        animals[0]= new Tiger();
        animals[1]= new chicken();
        System.out.println(animals[0].makeSound());
        System.out.println(animals[1].makeSound());
        Fruit fruit[] = new Fruit[2];
        fruit[0] = new apple();
        fruit[1] = new Orange();
        System.out.println(fruit[0].Howtoeat());
        System.out.println(fruit[1].Howtoeat());
    }
}
