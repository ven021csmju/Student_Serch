package com.example.humanjavafxform;


import Personal.StudentPool;
import Personal.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtScore;

    @FXML
    protected void onRegisterButonClick() {
        Student s = new Student();
        s.setterID(txtID.getText());
        s.setterName(txtName.getText());
        s.setterScore(Integer.parseInt(txtScore.getText()));

        StudentPool sPool = new StudentPool();
        sPool.addStudent(s);

    }


}