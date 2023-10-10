package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateOperations {
    public void showDate() {
        {
            // Aktuelles Datum und Uhrzeit abrufen
            LocalDateTime now = LocalDateTime.now();

            // Datums-/Zeitformat festlegen
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MMMM.yyyy HH:mm:ss");

        }
    }}