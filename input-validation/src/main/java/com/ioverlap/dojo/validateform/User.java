package com.ioverlap.dojo.validateform;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.*;

public class User {

    @NotBlank(message = "username cannot be blank")
    private String name;

    @NotBlank
    @Length(min = 6, max = 10, message = "length of password should between 6 to 10 characters")
    private String password;

    @NotNull
    @Min(value = 0, message = "grade cannot be least than 0 characters")
    @Max(value = 100, message = "grade cannot be over than 100 characters")
    private Double grade;

    @NotEmpty
    @Email
    private String email;

    public User(String name, String password, Double grade, String email) {
        this.name = name;
        this.password = password;
        this.grade = grade;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", grade=" + grade +
                '}';
    }
}
