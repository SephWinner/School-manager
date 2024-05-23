package com.example.school_manager.interfaces;


import com.example.school_manager.models.Classroom;

public interface ClassroomInterface {
    void create(Classroom classroom);
    void read(int id);
    void update(Classroom classroom);
    void delete(int id);
}
