package workout.workoutsp2.controller;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import workout.workoutsp2.WorkoutApp;
import workout.workoutsp2.model.*;

import java.io.IOException;


public class LoginController {
    userList theUserList;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public LoginController(){
        theUserList = new userList();

    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    Button loginButton;
    @FXML
    TextField username;
    @FXML
    Label usernameLabel;
    @FXML
    PasswordField passwordField;

    @FXML
    protected void onLoginButtonClick(ActionEvent e) throws IOException {
         User user = new User(username.getText(),passwordField.getText());
         if(auth(user)){
             switchToLogin(e);
         }

    }

    public boolean auth(User user){

        if (theUserList.authenticate(user)){
            usernameLabel.setText("Login correct");
            return true;

        }
        else {
            usernameLabel.setText("Oops");
            return false;
        }
    }
    public void switchToLogin(ActionEvent event) throws IOException {
        Parent root =  FXMLLoader.load(WorkoutApp.class.getResource("menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();


    }

}