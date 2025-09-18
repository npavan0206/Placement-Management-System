package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "certificates")
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "hall_ticket_number", unique = true, nullable = false)
    private String hallTicketNumber;

    private String course;

    @Column(name = "unique_hash")
    private String uniqueHash;

    @Column(name = "year_of_passing")
    private int yearOfPassing;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStudentName() { return studentName; }
    public void setStudentName(String studentName) { this.studentName = studentName; }

    public String getHallTicketNumber() { return hallTicketNumber; }
    public void setHallTicketNumber(String hallTicketNumber) { this.hallTicketNumber = hallTicketNumber; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public String getUniqueHash() { return uniqueHash; }
    public void setUniqueHash(String uniqueHash) { this.uniqueHash = uniqueHash; }

    public int getYearOfPassing() { return yearOfPassing; }
    public void setYearOfPassing(int yearOfPassing) { this.yearOfPassing = yearOfPassing; }
}
