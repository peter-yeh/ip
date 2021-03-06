package duke.task;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class TaskTest {
    private final Task task = new Task("Review this week's lecture");
    private final Task task2 = new Task("Review Code", true);

    @Test
    public void testMarkAsDone() {
        task.markAsDone();
        assertEquals("[T][\u2713] Review this week's lecture", task.toString());

        task2.markAsDone();
        assertEquals("[T][\u2713] Review Code", task2.toString());
    }

    @Test
    public void testToString() {
        assertEquals("[T][\u2718] Review this week's lecture", task.toString());
        assertEquals("[T][\u2713] Review Code", task2.toString());
    }

    @Test
    public void testToCustomString() {
        assertEquals("T | 0 | Review this week's lecture", task.toCustomString());
        assertEquals("T | 1 | Review Code", task2.toCustomString());
    }


}
