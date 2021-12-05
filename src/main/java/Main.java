public class Main {
    public static void main(String[] args) {
        MyStack stack =new MyStack(5);
        stack.addElement(5);
        stack.addElement(1);
        stack.addElement(3);
        stack.deleteElement();
        System.out.println("__________________________________");
        System.out.println("top element is "+stack.readTop());
        System.out.println("__________________________________");
        System.out.println("stack is full? "+stack.isFull());
        System.out.println("__________________________________");
        System.out.println("stack is empty? "+stack.isEmpty());
        System.out.println("__________________________________");
        System.out.println("size of stack = "+stack.getSize());
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