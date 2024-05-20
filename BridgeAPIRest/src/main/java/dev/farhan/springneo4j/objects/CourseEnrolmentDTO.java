package dev.farhan.springneo4j.objects;

import dev.farhan.springneo4j.models.Curso;

public class CourseEnrolmentDTO {
    private String name;
    private String username;
    private Curso curso;

    public CourseEnrolmentDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Curso getCourse() {
        return curso;
    }

    public void setCourse(Curso curso) {
        this.curso = curso;
    }
}
