class Bird extends Animal {
    private String featherColour, breed;

    Bird(String featherColour, String breed) {
        this.featherColour = featherColour;
        this.breed = breed;
    }

    Bird() {

    }

    public String getFeatherColour() {
        return this.featherColour;
    }

    public void setFeatherColour(String featherColour) {
        this.featherColour = featherColour;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void Voice() {
        // TODO Auto-generated method stub
        System.out.println("Jib Jib Jib!");
    }
}

class Falcon extends Bird {
    public static String FeatherColour, Breed;

    Falcon(String featherColour, String breed) {
        super(featherColour, breed);
        FeatherColour = featherColour;
        Breed = breed;
        // TODO Auto-generated constructor stub
        Animal.name = "Sky";
        Animal.age = "1 year";
        Animal.weightFields = "3.5kg";
        featherColour = "Brown";
        breed = "Falcon";

    }

    Falcon() {

    }

    public static void FalconDisplay() {
        System.out.println(String.format("Name: %s, Age: %s, Weight: %s, " +
                "Feather Colour: %s, Breed: %s", Animal.name, Animal.age, Animal.weightFields,
                FeatherColour, Breed));
        Animal.Eat();
    }
}