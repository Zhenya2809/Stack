import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

public class TestStack {
    @Test
    void shouldCreateStack() {
        var mStack = new MyStack(5);
        int size = mStack.getSize();
        Assertions.assertEquals(size, 5);
    }

    @Test
    void testDeleteElement() throws StackIsEmptyException, StackIfFullException {
        MyStack mStack = new MyStack(5);

        mStack.addElement(5);
        mStack.addElement(4);
        mStack.addElement(7);

        mStack.deleteElement();
        mStack.deleteElement();

        Assertions.assertEquals(5, mStack.readTop());
    }

    @Test
    void testAddElement() throws StackIfFullException {
        MyStack mStack = new MyStack(5);
        mStack.addElement(5);
        Assertions.assertEquals(5, mStack.readTop());
    }


    @Test
    public void testFullStack() throws StackIfFullException {
        //given
        MyStack mStack = new MyStack(1);
        mStack.addElement(4);
        //when
        StackIfFullException stackIfFullException = Assertions.assertThrows(
                StackIfFullException.class, () -> mStack.addElement(7));
        //then
        Assertions.assertEquals(stackIfFullException.getMessage(), "Stack if full");

    }

    @Test
    void testEmptyStack() {
        //given
        MyStack mStack = new MyStack(1);
        //when

        //then
        Optional<Integer> stack = mStack.deleteElement();
        Assertions.assertEquals(Optional.empty(), stack);
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    void testOption() throws StackIfFullException {
        //given
        MyStack mStack = new MyStack(3);
        mStack.addElement(4);
        mStack.addElement(4);
        //when
        Optional<Integer> stack = mStack.deleteElement();
        stack.ifPresent(System.out::println);


    }


}
