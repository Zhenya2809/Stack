public interface Stackable {
    void addElement(int element) throws StackIfFullException;

    void deleteElement() throws StackIsEmptyException;

    boolean isEmpty();

    int readTop();

    boolean isFull();
}
