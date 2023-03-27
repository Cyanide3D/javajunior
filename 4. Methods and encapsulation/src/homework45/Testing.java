package homework45;

import java.util.List;

public class Testing {

    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        List<Animal> animals = List.of(new Dog("Vasyan"), new Cat("Kogtezub"), new Bear("Pushistic"));

        animals.forEach(veterinarian::treatAnimal);
        animals.forEach(a -> {
            a.makeNoise();
            a.eat();
        });
    }

}
