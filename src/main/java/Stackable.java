import java.util.Optional;

public interface Stackable {
    void addElement(int element) throws StackIfFullException;

    Optional<Integer> deleteElement() throws StackIsEmptyException;

    boolean isEmpty();

    int readTop();

    boolean isFull();
}
