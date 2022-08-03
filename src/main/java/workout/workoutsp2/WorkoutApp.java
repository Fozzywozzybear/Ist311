package workout.workoutsp2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WorkoutApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root =  FXMLLoader.load(WorkoutApp.class.getResource("Login.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Workout App!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}