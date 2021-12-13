import java.util.Optional;

public class MyStack implements Stackable {

    private final int size; //mSize - максимальный размер
    private final int[] array;
    private int top; //какой по счету елемент сверху (индекс последнего элемента)

    public MyStack(int s) {
        size = s;
        array = new int[size];
        top = -1;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {  //если =-1 то стек только создан, если >-1 то значит что то уже лежит в нём
        return (top == -1);
    }

    public void addElement(int element) throws StackIfFullException {

        if (isFull()) {
            throw new StackIfFullException("Stack if full");
        } else {
            array[++top] = element;
            System.out.println("After add element {" + array[top] + "} top is " + top);
        }

    }

    //    public void deleteElement() throws StackIsEmptyException {
//        if (isEmpty()) {
//            Optional.empty();
//            throw new StackIsEmptyException("Stack is empty");
//        } else {
//            System.out.println("Delete element {" + array[top] + "}  top is " + top);
//            Optional.of(top--);
//
//
//        }x
//    }
//    public Optional<Integer> putElement() throws StackIsEmptyException {
//        if (isEmpty()) {
//            throw new StackIsEmptyException("Stack is empty");
//        } else {
//            System.out.println("Delete element {" + array[top] + "}  top is " + top);
//            return Optional.of(top--);
//        }
//    }

    public Optional<Integer> deleteElement() {
        if (isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(array[top--]);
    }

    public int readTop() {
        if (isEmpty()) {
            System.out.println("Top is " + top);
            return 0;
        }
        System.out.println("Top is " + top);
        return array[top];
    }

    public boolean isFull() {

        return (top == size - 1);

    }
}

