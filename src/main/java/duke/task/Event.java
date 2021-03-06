package duke.task;

import java.time.LocalDate;

public class Event extends Task {
    protected LocalDate at;

    /**
     * Creates a type of task with timing.
     *
     * @param description detail of the task.
     * @param at          time in yyyy-mm-dd.
     */
    public Event(String description, String at) {
        super(description);
        this.at = convertToLocalDate(at);
    }


    public Event(String description, boolean isDone, String at) {
        super(description, isDone);
        this.at = convertToLocalDate(at);
    }


    /**
     * Overrides the toString method.
     *
     * @return a custom event description.
     */
    @Override
    public String toString() {
        return "[E][" + super.getStatusIcon() + "] " + super.description + " (at: "
                + convertToString(this.at) + ")";
    }


    /**
     * Returns a fixed format in string to store the task to storage.
     *
     * @return E | 0 | return book | June 6th
     */
    public String toCustomString() {
        return "E | " + (super.isDone ? 1 : 0) + " | " + super.description + " | " + at;
    }


}
