class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Falcon fal = new Falcon();
        Tuna tuna = new Tuna();

        dog.DogDisplay();
        dog.Voice();

        fal.FalconDisplay();
        fal.Voice();

        tuna.TunaDisplay();
        tuna.Voice();
    }
}