package workout.workoutsp2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import workout.workoutsp2.WorkoutApp;
import workout.workoutsp2.model.FoodList;
import workout.workoutsp2.model.WeightWorkout;
import workout.workoutsp2.model.WeightWorkoutList;
import workout.workoutsp2.model.userList;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.ResourceBundle;

public class WeightWorkoutController   {
    private Stage stage;
    private Scene scene;
    private Parent root;



    Double TotalCals=0.0;
    Double remainingCalories;
    @FXML
    Button UpdateBttn;
    @FXML
    TextField DateF;

    @FXML
    TextField W1C;
    @FXML
    TextField W1N;
    @FXML
    TextField W1S;
    @FXML
    TextField W1R;
    @FXML
    TextField W1T;
    @FXML
    TextField W1CC;

    @FXML
    TextField W2C;
    @FXML
    TextField W2N;
    @FXML
    TextField W2S;
    @FXML
    TextField W2R;
    @FXML
    TextField W2T;
    @FXML
    TextField W2CC;

    @FXML
    TextField W3C;
    @FXML
    TextField W3N;
    @FXML
    TextField W3S;
    @FXML
    TextField W3R;
    @FXML
    TextField W3T;
    @FXML
    TextField W3CC;

    @FXML
    TextField W4C;
    @FXML
    TextField W4N;
    @FXML
    TextField W4S;
    @FXML
    TextField W4R;
    @FXML
    TextField W4T;
    @FXML
    TextField W4CC;

    @FXML
    TextField W5C;
    @FXML
    TextField W5N;
    @FXML
    TextField W5S;
    @FXML
    TextField W5R;
    @FXML
    TextField W5T;
    @FXML
    TextField W5CC;

    @FXML
    Text W1CCC;

    @FXML
    Text W2CCC;
    @FXML
    Text W3CCC;
    @FXML
    Text W4CCC;
    @FXML
    Text W5CCC;

    @FXML
    protected void onUpdateButtonClicked(ActionEvent e) throws IOException {

        if (W1C.getText()!=null&&W1C.getLength()>0) {
            W1CCC.setText("Workout Added");
            WeightWorkout W1 = new WeightWorkout(W1C.getText(), W1N.getText(), Integer.parseInt(W1S.getText()), Integer.parseInt(W1R.getText()), Double.parseDouble(W1T.getText()), DateF.getText());
        }
        if (W2C.getText()!=null&&W2C.getLength()>0) {
            W2CCC.setText("Workout Added");
            WeightWorkout W2 = new WeightWorkout(W2C.getText(),W2N.getText(),Integer.parseInt(W2S.getText()),Integer.parseInt(W2R.getText()),Double.parseDouble(W2T.getText()),DateF.getText());
        }
        if (W3C.getText()!=null&&W3C.getLength()>0) {
            W3CCC.setText("Workout Added");
            WeightWorkout W3 = new WeightWorkout(W3C.getText(),W3N.getText(),Integer.parseInt(W3S.getText()),Integer.parseInt(W3R.getText()),Double.parseDouble(W3T.getText()),DateF.getText());
        }
        if (W4C.getText()!=null&&W4C.getLength()>0) {
            W4CCC.setText("Workout Added");
            WeightWorkout W4 = new WeightWorkout(W4C.getText(),W4N.getText(),Integer.parseInt(W4S.getText()),Integer.parseInt(W4R.getText()),Double.parseDouble(W4T.getText()),DateF.getText());
        }
        if (W5C.getText()!=null&&W5C.getLength()>0) {
            W5CCC.setText("Workout Added");
            WeightWorkout W5 = new WeightWorkout(W5C.getText(),W5N.getText(),Integer.parseInt(W5S.getText()),Integer.parseInt(W5R.getText()),Double.parseDouble(W5T.getText()),DateF.getText());
        }








    }

    @FXML
    protected void  OnBackButtonClicked(ActionEvent event) throws  IOException{
        Parent root =  FXMLLoader.load(WorkoutApp.class.getResource("menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }



}
