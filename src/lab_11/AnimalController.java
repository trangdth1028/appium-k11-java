package lab_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnimalController {
    private List<MoveAble> getAnimalRacer(List<MoveAble> moveAbleObjects) {
        List<MoveAble> animalRacer = new ArrayList<>();
        for (MoveAble moveAbleObject : moveAbleObjects) {
            if (moveAbleObject.Moveable()) {
                animalRacer.add(moveAbleObject);
            }
        }
        return animalRacer;
    }

    public MoveAble printOutTheWinner(List<MoveAble> moveAbleObjects) {
        List<MoveAble> raceableAnimals = getAnimalRacer(moveAbleObjects);
        MoveAble winner = raceableAnimals.get(0);
        for (MoveAble moveAbleObject : raceableAnimals) {
            if (moveAbleObject.speed() > winner.speed()) {
                winner = moveAbleObject;
            }
        }
        return winner;
    }

    public static void main(String[] args) {
        MoveAble dog = new Dog();
        MoveAble eagle = new Eagle();
        MoveAble falcon = new Falcon();
        MoveAble horse = new Horse();
        MoveAble antelope = new Antelope();
        List<MoveAble> animalList = Arrays.asList(dog, eagle, falcon, horse, antelope);
        AnimalController animalController = new AnimalController();
        List<MoveAble> animalRacer = animalController.getAnimalRacer(animalList);
        MoveAble winner = animalController.printOutTheWinner(animalRacer);
        System.out.println("The winner is: " + winner.getName());
        System.out.println("The winner speed is: " + winner.speed());
    }
}
