package lab_08;

import java.util.Arrays;
import java.util.List;

public class AnimalController {
    public Animal raceWinner(List<Animal> animalList) {
        int maxSpeed = 0, speedIndex = 0;
        for (int i = 0; i < animalList.size(); i++) {
            int animalSpeed = animalList.get(i).getSpeed();
            if (animalSpeed > maxSpeed) {
                maxSpeed = animalSpeed;
                speedIndex = i;
            }
        }
        return animalList.get(speedIndex);
    }

    public static void main(String[] args) {
        AnimalController animalController = new AnimalController();
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();
        List<Animal> animalList = Arrays.asList(horse, tiger, dog);
        Animal winningAnimal = animalController.raceWinner(animalList);
        int winSpeed = winningAnimal.getSpeed();
        String winnerName = winningAnimal.getClass().getSimpleName();
        System.out.println("Winner is " + winnerName + ", with speed: " + winSpeed + " km/h");
    }
}
