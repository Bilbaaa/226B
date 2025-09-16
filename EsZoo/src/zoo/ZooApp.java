package zoo;
import java.util.ArrayList;
import java.util.List;

public class ZooApp {
    public static void main(String[] args) {
        Lion lion1 = new Lion("Leonino",23,true);
        Lion lion2 = new Lion("Leonessa", 12,false);
        Elephant elephant1 = new Elephant("Dumbo",27,false);
        Elephant elephant2 = new Elephant("Orso",14,false);
        Parrot parrot1 = new Parrot("Pappagallino",3);
        Parrot parrot2 = new Parrot("pappagallo",1);
        List<Animal> animals = new ArrayList<>();
        animals.add(lion1);
        animals.add(lion2);
        animals.add(elephant1);
        animals.add(elephant2);
        animals.add(parrot1);
        animals.add(parrot2);

        for (Animal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.makeSound());
            if (animal instanceof Feedable) {
                if (animal instanceof Lion) {
                    ((Feedable) animal).eat("Carne");
                }
            }
            if (animal instanceof Feedable) {
                if (animal instanceof Elephant) {
                    ((Feedable) animal).eat("Spagnolette");
                }
            }
            if (animal instanceof Feedable) {
                if (animal instanceof Parrot) {
                    ((Feedable) animal).eat("Semi");
                }
            }
        }
    }
}
