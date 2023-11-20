package org.example;

public class School {
    int id;
    Classroom[] classrooms;

    public School(int id, Classroom[] classrooms) {
        this.id = id;
        this.classrooms = classrooms;
    }

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
