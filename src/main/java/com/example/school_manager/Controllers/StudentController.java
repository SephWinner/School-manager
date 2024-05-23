package com.example.school_manager.Controllers;

import com.example.school_manager.models.Student;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.SQLException;
import java.time.LocalDate;

public class StudentController {

    @FXML
    private TextField firstName;
    @FXML
    private TextField lastName;
    @FXML
    private DatePicker dateOfBirth;
    @FXML
    private TextField placeOfBirth;
    @FXML
    private TextField state;
    @FXML
    private TextField classroomId;


    public void onSubmitStudent() throws SQLException {

        String firstname = firstName.getText().trim();
        String lastname = lastName.getText().trim();
        LocalDate dateOfBirth = this.dateOfBirth.getValue();
        String placeOfBirth = this.placeOfBirth.getText().trim();
        int state = Integer.parseInt(this.state.getText().trim());
        int classroomId = Integer.parseInt(this.classroomId.getText().trim());

        Student student = new Student();
        student.setFirstname(firstname);
        student.setLastname(lastname);
        student.setDateOfBirth(dateOfBirth);
        student.setPlaceOfBirth(placeOfBirth);
        student.setState(state);
        student.setClassroom_id(classroomId);
        student.create(student);
    }
}
