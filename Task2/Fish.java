class Fish extends Animal {
    private String oxygen;

    Fish(String oxygen) {
        this.oxygen = oxygen;
    }

    Fish() {

    }

    public String getOxygen() {
        return this.oxygen;
    }

    public void setOxygen(String oxygen) {
        this.oxygen = oxygen;
    }

    @Override
    public void Voice() {
        // TODO Auto-generated method stub
        System.out.println("Bladder Bladder!");
    }
}

class Tuna extends Fish {
    public static String Oxygen;

    Tuna(String oxygen) {
        super(oxygen);
        Oxygen = oxygen;
        // TODO Auto-generated constructor stub
        Animal.name = "Mr.Tuna";
        Animal.age = "3 years";
        Animal.weightFields = "300g";
        oxygen = "No";

    }

    Tuna() {

    }

    public static void TunaDisplay() {
        System.out.println(String.format("Name: %s, Age: %s, Weight: %s, Oxygen: %s",
                Animal.name, Animal.age, Animal.weightFields, Oxygen));
        Animal.Eat();
    }
}