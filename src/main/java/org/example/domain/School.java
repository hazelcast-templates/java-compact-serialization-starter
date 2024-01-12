package org.example.domain;

public class School {
    private int id;
    private Classroom[] classrooms;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Classroom[] getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(Classroom[] classrooms) {
        this.classrooms = classrooms;
    }
}
