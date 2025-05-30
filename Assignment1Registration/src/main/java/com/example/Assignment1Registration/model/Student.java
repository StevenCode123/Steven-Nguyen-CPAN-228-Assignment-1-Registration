package com.example.Assignment1Registration.model;


public class Student {
    private String name;
    private String email;
    private String course;
    private String level;
    private String year;


    public String getYear(){
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Student() {}

    public Student(String name, String email, String course, String level) {
        this.name = name;
        this.email = email;
        this.course = course;
        this.level = level;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }
}
