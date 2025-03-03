package com.project;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TaskTest {
    @Test
    void testTaskCreation() {
        Task task = new Task("1234567890", "Write Code", "Implement Java classes for CS320");
        assertEquals("1234567890", task.getTaskId());
        assertEquals("Write Code", task.getName());
        assertEquals("Implement Java classes for CS320", task.getDescription());
    }
}
