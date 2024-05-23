package com.example.school_manager.interfaces;


import com.example.school_manager.models.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentInterface {
    void create(Student student) throws SQLException;
    void read(int id);
    void update(Student student);
    void delete(int id);

    List<Student> list() throws SQLException;

    void setlastname(String lastname);

    void setId_Student(int idStudent);

    void setplaceOfBirth(String placeOfBirth);
}
