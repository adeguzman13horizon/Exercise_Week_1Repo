package Wednesday1.PetExample;

public class Pet {
    //define variables or properties
    int eyes;
    int legs;
    String sound;
    String species;
    String name;
    String  owner;

    //constructor
    public Pet() {
        //since no values are passed in, we can set up default values
        this.name = "Ron";
        this.sound = "tsk";
        this.owner = "Geo";
        this.species = "Lizard";
        this.legs = 6;
        this.eyes = 4;
    }

    public Pet(int eyes, int legs, String name, String owner, String species, String sound) {
        this.eyes = eyes;
        this.legs = legs;
        this.name = name;
        this.owner = owner;
        this.species = species;
        this.sound = sound;
    }

    // we add void to this method declaration because it doesn't return anything
    public void  speak() {
        System.out.println(this.sound);
    }

    // here we specify int because we are returning an integer value:
    int getLegs() {
        return this.legs;
    }
    // we pass in an amount of the pet eats that much food:
    public void eat(int weight) {
        System.out.println(name + " ate " + weight + " oz of food");
    }





}
