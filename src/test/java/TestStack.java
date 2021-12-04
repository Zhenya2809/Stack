import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestStack {
    @Test
    void shouldCreateStack() {
        var mStack = new MyStack(5);
        int size = mStack.getSize();
        Assertions.assertEquals(size, 5);
    }

    @Test
    void testDeleteElement() {
        MyStack mStack = new MyStack(5);

        mStack.addElement(5);
        mStack.addElement(4);
        mStack.addElement(7);

        mStack.deleteElement();
        mStack.deleteElement();

        Assertions.assertEquals(5, mStack.readTop());
    }

    @Test
    void testAddElement() {
        MyStack mStack = new MyStack(5);
        mStack.addElement(5);
        Assertions.assertEquals(5, mStack.readTop());
    }

    @Test
    void testFullStack() {
        MyStack mStack = new MyStack(3);
        mStack.addElement(5);
        mStack.addElement(6);
        mStack.addElement(7);
        mStack.addElement(8);
        Assertions.assertTrue(mStack.isFull());

    }

    @Test
    void testEmptyStack() {
        MyStack mStack = new MyStack(3);
        Assertions.assertTrue(mStack.isEmpty());

    }

}
