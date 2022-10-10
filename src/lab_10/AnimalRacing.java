package lab_10;

import java.util.Arrays;
import java.util.List;

public class AnimalRacing {
    public Animal getTheWinner(List<Animal> animalList) {
        Animal winner = animalList.get(0);
        for (Animal animal : animalList) {
            if (animal.getSpeed() > winner.getSpeed()) {
                winner = animal;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        AnimalRacing animalRacing = new AnimalRacing();
        Animal dog = new Dog().setName("Dog").setSpeed(60);
        Animal horse = new Horse().setName("Horse").setSpeed(50);
        Animal tiger = new Tiger().setName("Tiger").setSpeed(10);
        List<Animal> animalList = Arrays.asList(dog, horse, tiger);
        Animal winner = animalRacing.getTheWinner(animalList);
        System.out.println("The winner is: " + winner.getName());
        System.out.println("The winner speed is: " + winner.getSpeed());
    }
}