package Wednesday1.PetExample;

public class PetStore {
    public static void main(String[] args) {
        System.out.println("This is our pet store");

        Pet pet1 = new Pet();

        pet1.name = "Ashes";
        pet1.species = "cat";
        pet1.owner = "Rory";
        pet1.eyes = 2;
        pet1.legs = 4;
        pet1.sound = "meow";

        Pet pet2 = new Pet();

        pet2.name = "Jo";
        pet2.species = "dog";
        pet2.owner = "Sarah";
        pet2.eyes = 2;
        pet2.legs = 4;
        pet2.sound = "woof";

        System.out.println("My name is: " + pet1.name);
        System.out.println("My owner is: " + pet1.owner);

        System.out.println("My name is: " + pet2.name);
        System.out.println(pet2.sound);





        pet1.speak();
        pet1.eat(10);
        pet1.eat(20);
        System.out.println(pet1.getLegs());


        Pet pet3 = new Pet();
        pet3.speak();
        pet3.eat(4);


        Pet pet4 = new Pet(2, 4, "Jake", "Robin", "parrot", "kaw-kaw");
        pet4.speak();
        pet4.eat(10); double








    }



}
