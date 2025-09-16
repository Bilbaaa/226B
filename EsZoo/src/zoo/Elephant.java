package zoo;

public class Elephant extends Mammal implements Feedable{
    public Elephant(String name, int age, boolean hasFur ) {
        super(name, age, hasFur);

    }

    @Override
    public String makeSound() {
        return "WOOOOOO";
    }

    @Override
    public void eat(String food) {
        System.out.println("l'elefante sta mangiando il" + food);
    }

}
