package cat.itacademy.s04.t02.n01.exception;

public class FruitNotFoundException extends RuntimeException {
    public FruitNotFoundException(Integer id) {
        super("Fruit not found with id: " + id);
    }
}