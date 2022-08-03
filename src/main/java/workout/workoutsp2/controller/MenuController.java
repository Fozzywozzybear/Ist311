package workout.workoutsp2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import workout.workoutsp2.WorkoutApp;

import java.io.IOException;

public class MenuController {


    private Stage stage;
    private Scene scene;
    private Parent root;


    public void switchToLogin(ActionEvent event) throws IOException {
        Parent root =  FXMLLoader.load(WorkoutApp.class.getResource("Login.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void switchToWeightWorkout(ActionEvent event) throws IOException {
        Parent root =  FXMLLoader.load(WorkoutApp.class.getResource("WorkoutSelection.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void switchToCaridoWorkout(ActionEvent event) throws IOException {
        Parent root =  FXMLLoader.load(WorkoutApp.class.getResource("CardioSelection.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void SwitchToCalendar(ActionEvent event) throws IOException {
        Parent root =  FXMLLoader.load(WorkoutApp.class.getResource("Calendar.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    public void SwitchToCalorieTracker(ActionEvent event) throws IOException {
        Parent root =  FXMLLoader.load(WorkoutApp.class.getResource("CalorieTracker.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}
