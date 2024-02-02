package org.example.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.example.embed.FullName;

@Entity
@Table(name = "student_d")
public class Student {
    @Id
    private String id;
    private FullName name;
    private String address;

    public Student(String id, FullName name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Student() {
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FullName getName() {
        return name;
    }

    public void setName(FullName name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
