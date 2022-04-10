public class Mammal extends Animal {
    private String breed, species, legs;

    Mammal(String breed, String species, String legs) {
        this.breed = breed;
        this.species = species;
        this.legs = legs;
    }

    public Mammal() {

    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getLegs() {
        return this.legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    @Override
    public void Voice() {
        // TODO Auto-generated method stub
        System.out.println("Bark Bark!!");
    }
}

class Dog extends Mammal {
    public static String Breed, Species, Legs;

    Dog(String breed, String species, String legs) {
        super(breed, species, legs);
        Breed = breed;
        Species = species;
        Legs = legs;

        // TODO Auto-generated constructor stub
        Animal.age = "2 years";
        Animal.name = "Ricky";
        Animal.weightFields = "12kg";
        breed = "German Shepherd";
        species = "Dog";
        legs = "4";
    }

    Dog() {

    }

    public static void DogDisplay() {
        System.out.println(String.format("Name: %s, Age: %s, Weight: %s, " +
                "Breed: %s, Species: %s, Legs: %s", Animal.name, Animal.age, Animal.weightFields,
                Breed, Species, Legs));
        Animal.Eat();
    }
}
