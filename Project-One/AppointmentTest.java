package com.project;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

class AppointmentTest {
    @Test
    void testAppointmentCreation() {
        Date futureDate = new Date(System.currentTimeMillis() + 100000);
        Appointment appointment = new Appointment("1234567890", futureDate, "Doctor Visit");
        assertNotNull(appointment);
        assertEquals("1234567890", appointment.getAppointmentId());
        assertEquals(futureDate, appointment.getAppointmentDate());
        assertEquals("Doctor Visit", appointment.getDescription());
    }
}
