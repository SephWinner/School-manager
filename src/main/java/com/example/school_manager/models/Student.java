package com.example.school_manager.models;

import com.example.school_manager.dbConfig.IDBConfig;
import com.example.school_manager.interfaces.StudentInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Student implements StudentInterface {
        private int id_Student;
        private String firstname;
        private String lastname;
        private LocalDate dateOfBirth;
        private String placeOfBirth;
        private int state;
        private int classroom_id;

    public int getId_Student() {
        return id_Student;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getClassroom_id() {
        return classroom_id;
    }

    public void setClassroom_id(int classroom_id) {
        this.classroom_id = classroom_id;
    }


    private Connection connection;


    @Override
    public  void create(Student client) throws SQLException {
        connection = IDBConfig.getConnection();
        if (connection != null) {

            String req = "INSERT INTO student (firstname, lastname, dateOfBirth, placeOfBirth, state, classroom_id) VALUES (?,?,?,?,?,?)";
            PreparedStatement prepareStatement = this.connection.prepareStatement(req);
            prepareStatement.setString(1, getFirstname());
            prepareStatement.setString(2, getLastname());
            prepareStatement.setString(3, String.valueOf(getDateOfBirth()));
            prepareStatement.setString(4, getPlaceOfBirth());
            prepareStatement.setInt(5, getState());
            prepareStatement.setInt(6, getClassroom_id());


            prepareStatement.executeUpdate();
            prepareStatement.close();
            this.connection.close();

            System.out.println("Etudiant ajpouté avec succès !");
        }

    }




        @Override
        public void read(int id) {

        }

        @Override
        public void update(Student student) {

        }

        @Override
        public void delete(int id) {

        }


    @Override
    public List<Student> list() throws SQLException {
        List<Student> student = new ArrayList<>();

        /*connection = IDBConfig.getConnection();
        if (connection != null) {

            String req = "SELECT * FROM clients";
            PreparedStatement prepareStatement = this.connection.prepareStatement(req);

            ResultSet resultSet = prepareStatement.executeQuery();

            while (resultSet.next()) {
                Student client = new Student();
                client.setId_Student(resultSet.getInt("id_Student"));
                client.setfirstname(resultSet.getString("firstname"));
                client.setlastname(resultSet.getString("lastname"));
                client.setdateOfBirth(resultSet.getString("dateOfBirth"));
                client.setplaceOfBirth(resultSet.getString("placeOfBirth"));

                Student.add((com.example.school_manager.models.Student) Student);
            }
            prepareStatement.close();
            this.connection.close();
        }*/

        return student;
    }

    @Override
    public void setlastname(String lastname) {

    }

    @Override
    public void setId_Student(int idStudent) {

    }

    @Override
    public void setplaceOfBirth(String placeOfBirth) {

    }
}





