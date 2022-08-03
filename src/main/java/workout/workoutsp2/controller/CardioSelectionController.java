package workout.workoutsp2.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import workout.workoutsp2.WorkoutApp;
import workout.workoutsp2.model.CardioWorkout;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class CardioSelectionController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    TextField DistanceText;

    @FXML
    TextField TimeSpentText;
    @FXML
    TextField DateText;

    @FXML
    Button BackBttn;
    @FXML
    Button AddBttn;
    @FXML
    Button UpdateBttn;

    @FXML
    Text CBurnedText;

    @FXML
    Text ChoiceText;



    @FXML
    ChoiceBox<String> CardioChoiceBox;

    @FXML
    Text ErrorText;
    @FXML
    Text CompleteText;

    private String [] CardioWorkouts = {"biking","running","swimming","walking","other"};


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CardioChoiceBox.getItems().addAll(CardioWorkouts);
    }

    public void getCardioChoice(ChoiceBox<String> cardioChoiceBox){



    }

    public void onUpdateButtonClicked(ActionEvent event) throws IOException {


        if (ChoiceText.getText()!=null&&DateText.getText()!=null&&TimeSpentText.getText()!=null&&DistanceText.getText()!=null) {
            String CardioChoice = CardioChoiceBox.getValue();
            ChoiceText.setText(CardioChoice);
            CardioWorkout NewCardio = new CardioWorkout(ChoiceText.getText(), Double.parseDouble(TimeSpentText.getText()),DateText.getText(), Double.parseDouble(DistanceText.getText()));
            if (ChoiceText.getText()=="other"){
                CBurnedText.setText("We can not calculate calories for other.");
            }
            else{
                Double Calories = NewCardio.CalcCalories(NewCardio);
                CBurnedText.setText(Double.toString(Calories));
            }



            CompleteText.setText("new cardio workout Added!");







    }
        else {
            ErrorText.setText("Please fill out all forms of data.");
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
