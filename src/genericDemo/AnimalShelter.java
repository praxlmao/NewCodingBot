package genericDemo;
import java.util.ArrayList;
import java.util.List;

class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Mammal extends Animal {
    public Mammal(String name) {
        super(name);
    }
}

class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }
}

public class AnimalShelter {

    public static void showAllAnimals(List<? extends Animal> animals) {
        System.out.println("All animals in the shelter:");
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }

    public static void showMammals(List<? extends Mammal> mammals) {
        System.out.println("Mammals in the shelter:");
        for (Mammal mammal : mammals) {
            System.out.println(mammal.getName());
        }
    }

    public static void showAnimalSection(List<? super Animal> animals) {
        System.out.println("Animal section:");
        for (Object animal : animals) {
            System.out.println(((Animal) animal).getName());
        }
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("Parrot"));
        animals.add(new Mammal("Elephant"));
        animals.add(new Dog("Golden Retriever"));

        List<Mammal> mammals = new ArrayList<>();
        mammals.add(new Mammal("Cat"));
        mammals.add(new Dog("Bulldog"));

        System.out.println("Welcome to the Animal Shelter!");

        showAllAnimals(animals);
        showMammals(mammals);
        showAnimalSection(animals);

        System.out.println("Thank you for visiting the Animal Shelter!");
    }
}
