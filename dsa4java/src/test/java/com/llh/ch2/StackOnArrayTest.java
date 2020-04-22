package com.llh.ch2;

import static org.junit.Assert.*;

import com.llh.exception.MyStackException;
import org.junit.Test;


/**
 * StackOnArrayTest
 * <p>
 * CreatedAt: 2020-04-22 23:30
 *
 * @author llh
 */
public class StackOnArrayTest {

    @Test
    public void testInit() {
        Stack<String> stack = new StackOnArray<>();
        assertEquals(0, stack.size());
        try {
            stack.pop();
        } catch (MyStackException e) {
            assertTrue(true);
        }
        stack.push("ele");
        assertEquals(1, stack.size());
        assertEquals("ele", stack.top());
        assertEquals(1, stack.size());
        assertEquals("ele", stack.pop());
        assertEquals(0, stack.size());
    }

}
