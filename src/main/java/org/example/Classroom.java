package org.example;

public class Classroom {
    private int id;
    private Student[] students;

    public Classroom(int id, Student[] students) {
        this.id = id;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
