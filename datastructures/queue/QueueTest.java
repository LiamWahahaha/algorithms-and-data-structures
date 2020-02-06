import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import jdk.jfr.Timestamp;

public class QueueTest {
    Queue<Integer> queue;

    @Before
    public void setup() {
        queue = new Queue<Integer>();
    }

    @Test
    public void testEmptyQueue() {
        assertTrue(queue.isEmpty());
        assertEquals(queue.size(), 0);
    }

    @Test(expected = Exception.class)
    public void testDequeueEmpty() {
        queue.dequeue();
    }

    @Test(expected = Exception.class)
    public void testPeekOnEmpty() {
        queue.peek();
    }

    @Test
    public void testEnqueue() {
        queue.enqueue(2);
        assertTrue(queue.peek() == 2);
        assertEquals(queue.size(), 1);
    }

    @Test
    public void testPeek() {
        queue.enqueue(2);
        assertTrue(queue.peek() == 2);
        assertEquals(queue.size(), 1);
    }

    @Test
    public void testDequeue() {
        queue.enqueue(2);
        assertTrue(queue.dequeue() == 2);
        assertEquals(queue.size(), 0);
    }
}