package com.llh.ch2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * QueueArrayTest
 * <p>
 * CreatedAt: 2020-04-26 21:34
 *
 * @author llh
 */
public class QueueArrayTest {

    @Test
    public void testInit() {
        QueueOnArray<Double> queue = new QueueOnArray<>();
        assertEquals(0, queue.size());
        queue.enqueue(3.3);
        queue.enqueue(75.3);
        queue.enqueue(3.34);
        assertEquals(3, queue.size());
        assertEquals(3.3, queue.dequeue(), 0.0);
        assertEquals(75.3, queue.front(), 0.0);
        assertEquals(2, queue.size());
        queue.printSelf();
    }
}
