package project.example.To_do_list.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;
    private String priority;
    private String date;

    public Task() {}

    public Task(String text, String priority, String date) {
        this.text = text;
        this.priority = priority;
        this.date = date;
    }

    // Getters & Setters
}

