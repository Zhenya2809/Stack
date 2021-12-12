public class Main {
    public static void main(String[] args) throws StackIsEmptyException, StackIfFullException {
        MyStack stack = new MyStack(4);
        stack.addElement(5);
        stack.addElement(1);
        stack.addElement(3);
        stack.deleteElement();
        stack.deleteElement();
        stack.deleteElement();
        stack.deleteElement();
    }
}


//    public void addElement(int element);
//
//    public void deleteElement();
//
//    public boolean isEmpty();
//
//    public int readTop();
//
//    public boolean isFull();