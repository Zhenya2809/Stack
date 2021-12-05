public class MyStack {

    private final int size; //mSize - максимальный размер
    private final int[] array;
    private int top; //какой по счету елемент сверху (индекс последнего элемента)

    public int getSize() {
        return size;
    }

    public MyStack(int s) {
        size = s;
        array = new int[size];
        top = -1;
    }

    public boolean isEmpty() {  //если =-1 то стек только создан, если >-1 то значит что то уже лежит в нём
        return (top == -1);
    }

    public void addElement(int element) {
        if (isFull()) {
            System.out.println("Stack is full!!!");
        } else {
            array[++top] = element;
            System.out.println("After add element {" + array[top] + "} top is " + top);
        }
    }

    public void deleteElement() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Top is " + top);
        } else {
            System.out.println("Delete element {" + array[top] + "}  top is " + top);
            top--;

        }
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
        try {
            return (top == size - 1);} catch (ArrayIndexOutOfBoundsException e){
            System.out.println("full");
        }
        return false;
    }
}

