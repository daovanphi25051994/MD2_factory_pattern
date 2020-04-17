public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal cat =  animalFactory.getAnimal("cat");
        Animal dog = animalFactory.getAnimal("dog");
        Animal mouse = animalFactory.getAnimal("mouse");
        cat.makeNoisy();
        dog.makeNoisy();
        mouse.makeNoisy();
    }
}
