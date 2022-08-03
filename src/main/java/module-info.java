module sample.workoutsp2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens workout.workoutsp2 to javafx.fxml;
    exports workout.workoutsp2;
    exports workout.workoutsp2.controller;
    opens workout.workoutsp2.controller to javafx.fxml;
}