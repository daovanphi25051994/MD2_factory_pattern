public class AnimalFactory {
    private static final String CAT = "cat";
    private static final String DOG = "dog";
    private static final String MOUSE = "mouse";

    public Animal getAnimal(String animal){
        switch (animal){
            case CAT: return new Cat();
            case DOG: return new Dog();
            case MOUSE: return new Mouse();
            default:return null;
        }
    }
}
