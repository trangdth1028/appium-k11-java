package lab_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalRacing {
    private List<Animal> getAnimalRacer(List<Animal> animalList) {
        List<Animal> animalRacer = new ArrayList<>();
        for (Animal animal : animalList) {
            if (!animal.isFlyable()) {
                animalRacer.add(animal);
            }
        }
        return animalRacer;
    }

    public Animal getTheWinner(List<Animal> animalList) {
        List<Animal> raceableAnimals = getAnimalRacer(animalList);
        Animal winner = raceableAnimals.get(0);
        for (Animal animal : raceableAnimals) {
            if (animal.getSpeed() > winner.getSpeed()) {
                winner = animal;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        Animal dog = new Animal.Builder().setName("Dog").setSpeed(60).setFlyable(false).build();
        Animal horse = new Animal.Builder().setName("Horse").setSpeed(75).setFlyable(false).build();
        Animal tiger = new Animal.Builder().setName("Tiger").setSpeed(100).setFlyable(false).build();
        Animal falcon = new Animal.Builder().setName("Falcon").setSpeed(50).setFlyable(true).build();
        Animal eagle = new Animal.Builder().setName("Eagle").setSpeed(90).setFlyable(true).build();
        AnimalRacing animalRacing = new AnimalRacing();
        List<Animal> animalList = Arrays.asList(dog, horse, tiger, falcon, eagle);
        List<Animal> animalRacer = animalRacing.getAnimalRacer(animalList);
        Animal winner = animalRacing.getTheWinner(animalRacer);
        System.out.println("The winner is: " + winner.getName());
        System.out.println("The winner speed is: " + winner.getSpeed());
    }
}

