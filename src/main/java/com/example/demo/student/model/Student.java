package com.example.demo.student.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_name",
            sequenceName = "student_name",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_name"
    )
    long id;
    String name;
    String mail;
    String address;
    LocalDate dob;

    public Student(long id) {
        this.id = id;
    }

    public Student(long id, String name, String mail, String address, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.mail = mail;
        this.address = address;
        this.dob = dob;
    }

    public Student(String name, String mail, String address, LocalDate dob) {
        this.name = name;
        this.mail = mail;
        this.address = address;
        this.dob = dob;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", address='" + address + '\'' +
                ", dob=" + dob +
                '}';
    }
}
