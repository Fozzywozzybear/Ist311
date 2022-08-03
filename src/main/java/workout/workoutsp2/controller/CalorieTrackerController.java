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
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import workout.workoutsp2.WorkoutApp;
import workout.workoutsp2.model.Food;
import workout.workoutsp2.model.User;
import workout.workoutsp2.model.FoodList;


import java.io.IOException;

public class CalorieTrackerController {

    FoodList fl = new FoodList();
    Double TotalCals=0.0;
    Double remainingCalories;
    Double workouts,Holderworkouts;
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    TextField M1F1;
    @FXML
    TextField M1S1;
    @FXML
    TextField M1C1;
    @FXML
    TextField M1F2;
    @FXML
    TextField M1S2;
    @FXML
    TextField M1C2;
    @FXML
    TextField M1F3;
    @FXML
    TextField M1S3;
    @FXML
    TextField M1C3;
    @FXML
    TextField M2F1;
    @FXML
    TextField M2S1;
    @FXML
    TextField M2C1;
    @FXML
    TextField M2F2;
    @FXML
    TextField M2S2;
    @FXML
    TextField M2C2;
    @FXML
    TextField M2F3;
    @FXML
    TextField M2S3;
    @FXML
    TextField M2C3;
    @FXML
    TextField M3F1;
    @FXML
    TextField M3S1;
    @FXML
    TextField M3C1;
    @FXML
    TextField M3F2;
    @FXML
    TextField M3S2;
    @FXML
    TextField M3C2;
    @FXML
    TextField M3F3;
    @FXML
    TextField M3S3;
    @FXML
    TextField M3C3;





    @FXML
    TextField MealsTxtField;
    @FXML
    TextField RemainingTxtField;
    @FXML
    TextField GoalsTxtField;
    @FXML
    GridPane MealOneGrid;
    @FXML
    Button SetGoalBttn;
    @FXML
    Button UpdateWorkoutBttn;
    @FXML
    TextField WorkoutsTxtField;
    @FXML
    TextField DateTxtField;


    @FXML
    protected void onCalcCaloriesClick(ActionEvent e) throws IOException {


        if (M1F1.getText()!=null&&M1F1.getLength()>0){
            System.out.println(this.fl.toString());

            Double f = Double.parseDouble(M1S1.getText());
            Integer i = Integer.parseInt(M1C1.getText());
            if (this.fl.contains(M1F1.getText())){
                System.out.println("already in system");
            }
            else if (this.fl.contains(M1F1.getText())==false){
                Food food1 = new Food(M1F1.getText(),f,i,DateTxtField.getText());
                this.TotalCals=TotalCals+food1.calcTotalCalories(food1);
                this.fl.addFood(food1);
                fl.writeWorkoutListFile();
                updateRemaining();
            }

        }
        if (M1F2.getText()!=null&&M1F2.getLength()>0) {
            Double f2 = Double.parseDouble(M1S2.getText());
            Integer i2 = Integer.parseInt(M1C2.getText());
            if (this.fl.contains(M1F2.getText())){
                System.out.println("already in system");
            }
            else {
                Food food2 = new Food(M1F2.getText(), f2, i2,DateTxtField.getText());
                this.TotalCals = TotalCals + food2.calcTotalCalories(food2);
                fl.addFood(food2);
                fl.writeWorkoutListFile();
                updateRemaining();
            }
        }
        if (M1F3.getText()!=null&&M1F3.getLength()>0) {
            Double f3 = Double.parseDouble(M1S3.getText());
            Integer i3 = Integer.parseInt(M1C3.getText());
            if (this.fl.contains(M1F3.getText())){
                System.out.println("already in system");
            }
            Food food3 = new Food(M1F3.getText(), f3, i3,DateTxtField.getText());
            this.TotalCals = TotalCals + food3.calcTotalCalories(food3);
            fl.addFood(food3);
            fl.writeWorkoutListFile();
            updateRemaining();

        }
        // Calories for meal 2

        if (M2F1.getText()!=null&&M2F1.getLength()>0){
            System.out.println(this.fl.toString());

            Double f = Double.parseDouble(M2S1.getText());
            Integer i = Integer.parseInt(M2C1.getText());
            if (this.fl.contains(M2F1.getText())){
                System.out.println("already in system");
            }
            else if (this.fl.contains(M2F1.getText())==false){
                Food food1 = new Food(M2F1.getText(),f,i,DateTxtField.getText());
                this.TotalCals=TotalCals+food1.calcTotalCalories(food1);
                this.fl.addFood(food1);
                fl.writeWorkoutListFile();
                updateRemaining();
            }

        }
        if (M2F2.getText()!=null&&M2F2.getLength()>0) {
            Double f2 = Double.parseDouble(M2S2.getText());
            Integer i2 = Integer.parseInt(M2C2.getText());
            if (this.fl.contains(M2F2.getText())){
                System.out.println("already in system");
            }
            else {
                Food food2 = new Food(M2F2.getText(), f2, i2,DateTxtField.getText());
                this.TotalCals = TotalCals + food2.calcTotalCalories(food2);
                fl.addFood(food2);
                fl.writeWorkoutListFile();
                updateRemaining();
            }
        }
        if (M2F3.getText()!=null&&M2F3.getLength()>0) {
            Double f3 = Double.parseDouble(M2S3.getText());
            Integer i3 = Integer.parseInt(M2C3.getText());
            if (this.fl.contains(M2F3.getText())){
                System.out.println("already in system");
            }
            Food food3 = new Food(M2F3.getText(), f3, i3,DateTxtField.getText());
            this.TotalCals = TotalCals + food3.calcTotalCalories(food3);
            fl.addFood(food3);
            fl.writeWorkoutListFile();
            updateRemaining();

        }
        // Calories for meal 3
        if (M3F1.getText()!=null&&M3F1.getLength()>0){
            System.out.println(this.fl.toString());

            Double f = Double.parseDouble(M3S1.getText());
            Integer i = Integer.parseInt(M3C1.getText());
            if (this.fl.contains(M3F1.getText())){
                System.out.println("already in system");
            }
            else if (this.fl.contains(M3F1.getText())==false){
                Food food1 = new Food(M3F1.getText(),f,i,DateTxtField.getText());
                this.TotalCals=TotalCals+food1.calcTotalCalories(food1);
                this.fl.addFood(food1);
                fl.writeWorkoutListFile();
                updateRemaining();
            }

        }
        if (M3F2.getText()!=null&&M3F2.getLength()>0) {
            Double f2 = Double.parseDouble(M3S2.getText());
            Integer i2 = Integer.parseInt(M3C2.getText());
            if (this.fl.contains(M3F2.getText())){
                System.out.println("already in system");
            }
            else {
                Food food2 = new Food(M3F2.getText(), f2, i2,DateTxtField.getText());
                this.TotalCals = TotalCals + food2.calcTotalCalories(food2);
                fl.addFood(food2);
                fl.writeWorkoutListFile();
                updateRemaining();
            }
        }
        if (M3F3.getText()!=null&&M3F3.getLength()>0) {
            Double f3 = Double.parseDouble(M3S3.getText());
            Integer i3 = Integer.parseInt(M3C3.getText());
            if (this.fl.contains(M3F3.getText())){
                System.out.println("already in system");
            }
            Food food3 = new Food(M3F3.getText(), f3, i3,DateTxtField.getText());
            this.TotalCals = TotalCals + food3.calcTotalCalories(food3);
            fl.addFood(food3);
            fl.writeWorkoutListFile();
            updateRemaining();

        }
        MealsTxtField.setText(Double.toString(this.TotalCals));
        System.out.println(this.fl.authDate("04/24/2022"));
        System.out.println(DateTxtField.getText());





    }
    @FXML
    protected void onSetGoalsClicked(ActionEvent e) throws IOException {
        this.remainingCalories=Double.parseDouble(GoalsTxtField.getText());
        RemainingTxtField.setText(GoalsTxtField.getText());
        this.fl.remakeFoodList();
        this.workouts=Double.parseDouble(WorkoutsTxtField.getText());
        this.Holderworkouts=null;
        this.workouts=null;
        WorkoutsTxtField.setText("");
        WorkoutsTxtField.setPromptText("Enter Calorie Burned");





    }
    @FXML
    protected void  OnBackButtonClicked(ActionEvent event) throws  IOException{
        Parent root =  FXMLLoader.load(WorkoutApp.class.getResource("menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void updateRemaining(){
        RemainingTxtField.setText(String.valueOf(this.remainingCalories-this.TotalCals));

    }
    @FXML
    protected void  onUpdateWorkoutClicked(ActionEvent e ) throws IOException{
        System.out.println(this.Holderworkouts);
        System.out.println(this.workouts);

        if (this.workouts==null) {
            this.workouts = Double.parseDouble(WorkoutsTxtField.getText());
            this.remainingCalories+=this.workouts;
        }
        this.Holderworkouts = Double.parseDouble(WorkoutsTxtField.getText());
        if (this.workouts==this.Holderworkouts){
            System.out.println("no updates found");

        }
        else if (this.workouts>=this.Holderworkouts){
            this.remainingCalories+=(this.Holderworkouts-this.workouts);
            this.workouts=this.Holderworkouts;

        }
        else if (this.workouts<this.Holderworkouts){
            this.remainingCalories+=(this.Holderworkouts-this.workouts);
            this.workouts=this.Holderworkouts;

        }
        updateRemaining();

    }






}
