package com.abduldevlab.expenses.domain;

public class Employee {
    private int id;
    private String title;
    private String firstName;
    private String surname;
    private String jobTitle;
    private Department department;
    //private ExpenseClaim[] claims;

    public Employee() {

    }

    public Employee(int id, String jobTitle) {
        this.id = id;
        this.jobTitle = jobTitle;
    }

    public Employee(int id, String title, String firstName, String surname, String jobTitle, Department department) {
        this.id = id;
        this.title = title;
        this.firstName = firstName;
        this.surname = surname;
        this.jobTitle = jobTitle;
        this.department = department;
    }

    public String getMailingName(){
        return title + " " + firstName + " " + surname;
    }

    public String getMailingName(boolean firstInitialOnly){
        if (firstInitialOnly){
            return title + " " + firstName.substring(0,1) +" " + surname;
        }else{
            return title + " " + surname;
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() < 2) {
            System.out.println("Error - first name must be at least 2 characters long.");
        } else {
            this.firstName = firstName;
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", department=" + department +
                '}';
    }
}