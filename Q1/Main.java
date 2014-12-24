package nevelev.dima;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Animal> zoo = new ArrayList<Animal>();
        zoo.add(new Dog());
        zoo.add(new Horse());
        zoo.add(new Snake());
        zoo.add(new Chameleon());
        zoo.add(new Parrot());
        zoo.add(new Owl());

		System.out.println("Maman 12 Q1, By Dima Nevelev 308877489");
        System.out.println("\n\nWelcome to the zoo.\n\n" +
                "Meet our animals: ");
        for (Animal animal: zoo){
            System.out.println(animal.toString());
        }
        seperate();

        System.out.println("\n\nLets hear them:\n");
        for (Animal animal: zoo){
            System.out.println(animal.getVoice());
        }
        seperate();

        System.out.println("\n\nLet them grow:\n");
        for (Animal animal: zoo){
            animal.grow(3);
        }
        seperate();

        System.out.println("\n\nLets hear them again, the parrot grow up and can talk now:\n");
        for (Animal animal: zoo){
            System.out.println(animal.getVoice());
        }
        seperate();

        System.out.println("\n\nLet them get their food:\n");
        for (Animal animal: zoo){
            animal.getFood();
            System.out.println();
        }
        seperate();

        System.out.println("\n\nLets feed them:\n");
        for (Animal animal: zoo){
            animal.eat(animal._maxStomachSize *2);
        }
        seperate();

        System.out.println("\n\nThey are tiered, let them sleep:\n");
        for (Animal animal: zoo){
            animal.sleep();
        }
        seperate();


        System.out.println("\n\nLets let the mammals grow and see if the still get breastfeed:\n");
        for (Animal animal: zoo){
            if(animal instanceof Mammal ){
                animal.grow(((Mammal) animal)._breastfeedingAge);
                animal.eat(((Mammal) animal)._breastfeedingAge);
            }
        }
        seperate();

        System.out.println("\n\nAnd the final show is, every one has his special thing:\n");
        ((Dog)zoo.get(0)).protect();
        ((Horse)zoo.get(1)).neigh();
        ((Snake)zoo.get(2)).bite();
        ((Chameleon)zoo.get(3)).changeColor();
        ((Parrot)zoo.get(4)).talk();
        ((Owl)zoo.get(5)).nightVision();

        System.out.println("You finished your zoo visit.\nBye! ");

    }

    public static void seperate(){
        System.out.print("*********************************************************************");
    }
}
