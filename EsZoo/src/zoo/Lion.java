package zoo;

public class Lion extends Mammal implements Feedable{

    public Lion(String name, int age, boolean hasFur) {
        super(name, age, hasFur);
    }

    @Override
    public String makeSound() {
        return "ROARRRR";
    }

    @Override
    public void eat(String food) {
        System.out.println("il leone mangia la" + food);
    }
}
