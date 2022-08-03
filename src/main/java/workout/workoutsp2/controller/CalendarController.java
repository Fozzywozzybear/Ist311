package workout.workoutsp2.controller;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import workout.workoutsp2.WorkoutApp;
import workout.workoutsp2.model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;


public class CalendarController {
    FoodList fl = new FoodList();
    WeightWorkoutList wl = new WeightWorkoutList();
    CardioWorkoutList cl= new CardioWorkoutList();
    ArrayList<String> Week1 = new ArrayList<String>();
    ArrayList<String> Week2 = new ArrayList<String>();
    int calories = -2500;
    private Stage stage;
    private Scene scene;
    private Parent root;






    @FXML
    GridPane FirstDateGrid;
    @FXML
    Button NextWeekBttn;


    @FXML
    Text DateRange;
    @FXML
    Text D1C1;
    @FXML
    Text D1W1;
    @FXML
    Text D1CW1;
    @FXML
    Text D2C1;
    @FXML
    Text D2W1;
    @FXML
    Text D2CW1;
    @FXML
    Text D3C1;
    @FXML
    Text D3W1;
    @FXML
    Text D3CW1;
    @FXML
    Text D4C1;
    @FXML
    Text D4W1;
    @FXML
    Text D4CW1;
    @FXML
    Text D5C1;
    @FXML
    Text D5W1;
    @FXML
    Text D5CW1;
    @FXML
    Text D6C1;
    @FXML
    Text D6W1;
    @FXML
    Text D6CW1;
    @FXML
    Text D7C1;
    @FXML
    Text D7W1;
    @FXML
    Text D7CW1;



    @FXML
    Text Date1Text;
    @FXML
    Text Date2Text;
    @FXML
    Text Date3Text;
    @FXML
    Text Date4Text;
    @FXML
    Text Date5Text;
    @FXML
    Text Date100Text;
    @FXML
    Text Date7Text;
    @FXML
    Text Welcometext;

    @FXML
    Button backBttn;

    @FXML
    Text D1TC1;
    @FXML
    Text D2TC1;
    @FXML
    Text D3TC1;
    @FXML
    Text D4TC1;
    @FXML
    Text D5TC1;
    @FXML
    Text D6TC1;
    @FXML
    Text D7TC1;




    public CalendarController(){

        Week1.add("04/24/2022");
        Week1.add("04/25/2022");
        Week1.add("04/26/2022");
        Week1.add("04/27/2022");
        Week1.add("04/28/2022");
        Week1.add("04/29/2022");
        Week1.add("04/30/2022");
        Week2.add("05/01/2022");
        Week2.add("05/02/2022");
        Week2.add("05/03/2022");
        Week2.add("05/04/2022");
        Week2.add("05/05/2022");
        Week2.add("05/06/2022");
        Week2.add("05/07/2022");







    }


    @FXML
    public void NextWeek(ActionEvent e) throws IOException {
        Welcometext.setText("");

        Date1Text.setText(Week2.get(0));
        Date2Text.setText(Week2.get(1));
        Date3Text.setText(Week2.get(2));
        Date4Text.setText(Week2.get(3));
        Date5Text.setText(Week2.get(4));
        Date100Text.setText(Week2.get(5));
        Date7Text.setText(Week2.get(Week2.size()-1));
        D1C1.setText("");
        D1W1.setText("");
        D1CW1.setText("");
        D1TC1.setText("");
        D2C1.setText("");
        D2W1.setText("");
        D2CW1.setText("");
        D2TC1.setText("");
        D3C1.setText("");
        D3W1.setText("");
        D3CW1.setText("");
        D3TC1.setText("");
        D4C1.setText("");
        D4W1.setText("");
        D4CW1.setText("");
        D4TC1.setText("");
        D5C1.setText("");
        D5W1.setText("");
        D5CW1.setText("");
        D5TC1.setText("");
        D6C1.setText("");
        D6W1.setText("");
        D6CW1.setText("");
        D6TC1.setText("");
        D7C1.setText("");
        D7W1.setText("");
        D7CW1.setText("");
        D7TC1.setText("");


        DateRange.setText(this.Week2.get(0)+ "-" +this.Week2.get(Week2.size()-1));


        if (fl.authDate(Week2.get(0))) {

            String Calories =  Integer.toString(fl.containdateCalories(Week2.get(0)));

            D1C1.setText(Calories);
        }
        if (wl.authDate(Week2.get(0))) {
            String name = wl.containdateName(Week2.get(0));
            String time = (wl.containdateTime(Week2.get(0)));
            D1W1.setText(name+"\n"+time);
        }
        if (cl.authDate(Week2.get(0))) {
            String Calories = (cl.containdateCals(Week2.get(0)));
            String category = (cl.containdateName(Week2.get(0)));
            D1CW1.setText(category+"\n"+Calories);
        }
        // --------------
        if (fl.authDate(Date2Text.getText())) {
            String Calories =  Integer.toString(fl.containdateCalories(Date2Text.getText()));
            D2C1.setText(Calories);
        }
        if (wl.authDate(Date2Text.getText())) {
            String name = wl.containdateName(Date2Text.getText());
            String time = (wl.containdateTime(Date2Text.getText()));
            D2W1.setText(name+"\n"+time);
        }
        if (cl.authDate(Date2Text.getText())) {
            String Calories = (cl.containdateCals(Date2Text.getText()));
            String category = (cl.containdateName(Date2Text.getText()));
            D2CW1.setText(category+"\n"+Calories);
        }
        // -------------------------------

        if (fl.authDate(Date3Text.getText())) {
            String Calories =  Integer.toString(fl.containdateCalories(Date2Text.getText()));
            D3C1.setText(Calories);
        }
        if (wl.authDate(Date3Text.getText())) {
            String name = wl.containdateName(Date3Text.getText());
            String time = (wl.containdateTime(Date3Text.getText()));
            D3W1.setText(name+"\n"+time);
        }
        if (cl.authDate(Date3Text.getText())) {
            String Calories = (cl.containdateCals(Date3Text.getText()));
            String category = (cl.containdateName(Date3Text.getText()));
            D3CW1.setText(category+"\n"+Calories);
        }
        //--------------

        if (fl.authDate(Date4Text.getText())) {
            String Calories =  Integer.toString(fl.containdateCalories(Date4Text.getText()));
            D4C1.setText(Calories);
        }
        if (wl.authDate(Date4Text.getText())) {
            String name = wl.containdateName(Date4Text.getText());
            String time = (wl.containdateTime(Date4Text.getText()));
            D4W1.setText(name+"\n"+time);
        }
        if (cl.authDate(Date4Text.getText())) {
            String Calories = (cl.containdateCals(Date4Text.getText()));
            String category = (cl.containdateName(Date4Text.getText()));
            D4CW1.setText(category+"\n"+Calories);
        }

        if (fl.authDate(Date5Text.getText())) {
            String Calories =  Integer.toString(fl.containdateCalories(Date5Text.getText()));
            D5C1.setText(Calories);
        }
        if (wl.authDate(Date5Text.getText())) {
            String name = wl.containdateName(Date5Text.getText());
            String time = (wl.containdateTime(Date5Text.getText()));
            D5W1.setText(name+"\n"+time);
        }
        if (cl.authDate(Date5Text.getText())) {
            String Calories = (cl.containdateCals(Date5Text.getText()));
            String category = (cl.containdateName(Date5Text.getText()));
            D5CW1.setText(category+"\n"+Calories);
        }
        if (fl.authDate(Date100Text.getText())) {
            String Calories =  Integer.toString(fl.containdateCalories(Date100Text.getText()));
            D6C1.setText(Calories);
        }
        if (wl.authDate(Date100Text.getText())) {
            String name = wl.containdateName(Date100Text.getText());
            String time = (wl.containdateTime(Date100Text.getText()));
            D6W1.setText(name+"\n"+time);
        }
        if (cl.authDate(Date100Text.getText())) {
            String Calories = (cl.containdateCals(Date100Text.getText()));
            String category = (cl.containdateName(Date100Text.getText()));
            D6CW1.setText(category+"\n"+Calories);
        }
        if (fl.authDate(Date7Text.getText())) {
            String Calories =  Integer.toString(fl.containdateCalories(Date7Text.getText()));
            D7C1.setText(Calories);
        }
        if (wl.authDate(Date7Text.getText())) {
            String name = wl.containdateName(Date7Text.getText());
            String time = (wl.containdateTime(Date7Text.getText()));
            D7W1.setText(name+"\n"+time);
        }
        if (cl.authDate(Date7Text.getText())) {



            String Calories = (cl.containdateCals(Date7Text.getText()));
            String category = (cl.containdateName(Date7Text.getText()));
            D7CW1.setText(category+"\n"+Calories);
        }



        }

    @FXML
    public void PrvWeek(ActionEvent e) throws IOException {
        Welcometext.setText("");
        Date1Text.setText(Week1.get(0));
        Date2Text.setText(Week1.get(1));
        Date3Text.setText(Week1.get(2));
        Date4Text.setText(Week1.get(3));
        Date5Text.setText(Week1.get(4));
        Date100Text.setText(Week1.get(5));
        Date7Text.setText(Week1.get(Week1.size()-1));

        D1C1.setText("");
        D1W1.setText("");
        D1CW1.setText("");
        D1TC1.setText("");
        D2C1.setText("");
        D2W1.setText("");
        D2CW1.setText("");
        D2TC1.setText("");
        D3C1.setText("");
        D3W1.setText("");
        D3CW1.setText("");
        D3TC1.setText("");
        D4C1.setText("");
        D4W1.setText("");
        D4CW1.setText("");
        D4TC1.setText("");
        D5C1.setText("");
        D5W1.setText("");
        D5CW1.setText("");
        D5TC1.setText("");
        D6C1.setText("");
        D6W1.setText("");
        D6CW1.setText("");
        D6TC1.setText("");
        D7C1.setText("");
        D7W1.setText("");
        D7CW1.setText("");
        D7TC1.setText("");



        DateRange.setText(this.Week1.get(0)+ "-" +this.Week1.get(Week1.size()-1));

        if (fl.authDate(Week1.get(0))) {
            String Calories =  Integer.toString(fl.containdateCalories(Week1.get(0)));
            int NewCalories = calories + fl.containdateCalories(Week1.get(0));
            D1TC1.setText(Integer.toString(NewCalories));
            D1C1.setText(Calories);
        }
        if (wl.authDate(Week1.get(0))) {
            String name = wl.containdateName(Week1.get(0));
            String time = (wl.containdateTime(Week1.get(0)));
            D1W1.setText(name+"\n"+time);
        }
        if (cl.authDate(Week1.get(0))) {
            String Calories = (cl.containdateCals(Week1.get(0)));
            String category = (cl.containdateName(Week1.get(0)));
            D1CW1.setText(category+"\n"+Calories);
        }
        if (fl.authDate(Date2Text.getText())) {
            String Calories =  Integer.toString(fl.containdateCalories(Date2Text.getText()));
            D2C1.setText(Calories);
            int NewCalories = calories + fl.containdateCalories(Date2Text.getText());
            D2TC1.setText(Integer.toString(NewCalories));
        }
        if (wl.authDate(Date2Text.getText())) {
            String name = wl.containdateName(Date2Text.getText());
            String time = (wl.containdateTime(Date2Text.getText()));
            D2W1.setText(name+"\n"+time);
        }
        if (cl.authDate(Date2Text.getText())) {
            String Calories = (cl.containdateCals(Date2Text.getText()));
            String category = (cl.containdateName(Date2Text.getText()));
            D2CW1.setText(category+"\n"+Calories);
        }
        if (fl.authDate(Date3Text.getText())) {
            String Calories =  Integer.toString(fl.containdateCalories(Date2Text.getText()));
            D3C1.setText(Calories);
            int NewCalories = calories + fl.containdateCalories(Date3Text.getText());
            D3TC1.setText(Integer.toString(NewCalories));
        }
        if (wl.authDate(Date3Text.getText())) {
            String name = wl.containdateName(Date3Text.getText());
            String time = (wl.containdateTime(Date3Text.getText()));
            D3W1.setText(name+"\n"+time);
        }
        if (cl.authDate(Date3Text.getText())) {
            String Calories = (cl.containdateCals(Date3Text.getText()));
            String category = (cl.containdateName(Date3Text.getText()));
            D3CW1.setText(category+"\n"+Calories);
        }
        if (fl.authDate(Date4Text.getText())) {
            String Calories =  Integer.toString(fl.containdateCalories(Date4Text.getText()));
            D4C1.setText(Calories);
            int NewCalories = calories + fl.containdateCalories(Date4Text.getText());
            D4TC1.setText(Integer.toString(NewCalories));
        }
        if (wl.authDate(Date4Text.getText())) {
            String name = wl.containdateName(Date4Text.getText());
            String time = (wl.containdateTime(Date4Text.getText()));
            D4W1.setText(name+"\n"+time);
        }
        if (cl.authDate(Date4Text.getText())) {
            String Calories = (cl.containdateCals(Date4Text.getText()));
            String category = (cl.containdateName(Date4Text.getText()));
            D4CW1.setText(category+"\n"+Calories);
        }
        if (fl.authDate(Date5Text.getText())) {
            String Calories =  Integer.toString(fl.containdateCalories(Date5Text.getText()));
            D5C1.setText(Calories);
            int NewCalories = calories + fl.containdateCalories(Date5Text.getText());
            D5TC1.setText(Integer.toString(NewCalories));
        }
        if (wl.authDate(Date5Text.getText())) {
            String name = wl.containdateName(Date5Text.getText());
            String time = (wl.containdateTime(Date5Text.getText()));
            D5W1.setText(name+"\n"+time);
        }
        if (cl.authDate(Date5Text.getText())) {
            String Calories = (cl.containdateCals(Date5Text.getText()));
            String category = (cl.containdateName(Date5Text.getText()));
            D5CW1.setText(category+"\n"+Calories);
        }
        if (fl.authDate(Date100Text.getText())) {
            String Calories =  Integer.toString(fl.containdateCalories(Date100Text.getText()));
            D6C1.setText(Calories);
            int NewCalories = calories + fl.containdateCalories(Date100Text.getText());
            D6TC1.setText(Integer.toString(NewCalories));
        }
        if (wl.authDate(Date100Text.getText())) {
            String name = wl.containdateName(Date100Text.getText());
            String time = (wl.containdateTime(Date100Text.getText()));
            D6W1.setText(name+"\n"+time);
        }
        if (cl.authDate(Date100Text.getText())) {
            String Calories = (cl.containdateCals(Date100Text.getText()));
            String category = (cl.containdateName(Date100Text.getText()));
            D6CW1.setText(category+"\n"+Calories);
        }
        if (fl.authDate(Date7Text.getText())) {
            String Calories =  Integer.toString(fl.containdateCalories(Date7Text.getText()));
            D7C1.setText(Calories);
            int NewCalories = calories + fl.containdateCalories(Date7Text.getText());
            D7TC1.setText(Integer.toString(NewCalories));
        }
        if (wl.authDate(Date7Text.getText())) {

            String name = wl.containdateName(Date7Text.getText());
            String time = (wl.containdateTime(Date7Text.getText()));
            if (name.equals(null)&&time.equals(null)){
                D7W1.setText("empty");
            }
            D7W1.setText(name+"\n"+time);
        }
        if (cl.authDate(Date7Text.getText())) {
            String Calories = (cl.containdateCals(Date7Text.getText()));
            String category = (cl.containdateName(Date7Text.getText()));
            D7CW1.setText(category+"\n"+Calories);
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














