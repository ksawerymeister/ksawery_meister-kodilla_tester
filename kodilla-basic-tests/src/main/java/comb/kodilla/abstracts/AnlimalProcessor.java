package comb.kodilla.abstracts;

public class AnlimalProcessor {

    Animal dog = new Dog(4);

    public void process(Animal animal){
        System.out.println("Animal has " + dog.getNumberOfLegs() + " legs");
        dog.giveVoice();
    }


}
