package workout.workoutsp2.model;

import java.io.Serializable;

public class CardioWorkout implements Serializable {
    private String catagorey;
    private double time;
    private String date;
    private double distance;

    public CardioWorkout(String catagorey, double time, String date,double distance) {
        this.catagorey = catagorey;
        this.time = time;
        this.date = date;
        this.distance=distance;
    }
    public String getDate() {
        return date;
    }

    public String getCatagorey() {
        return catagorey;
    }


    public double getTime() {
        return time;
    }

    public double getDistance() {
        return distance;
    }

    public double CalcCalories(CardioWorkout workout){
        if (workout.getCatagorey()=="biking") {
            double calories = 550;
            calories= calories * (workout.getTime()/60.00);
            return calories;

        }
        if (workout.getCatagorey()=="walking") {
            double calories = 100;
            calories= calories * (workout.getDistance());
            return calories;
        }
        if (workout.getCatagorey()=="running") {
            double calories = 120;
            calories= calories * (workout.getDistance());
            return calories;
        }
        if (workout.getCatagorey()=="swimming") {
            double calories = 220;
            calories= calories * (workout.getTime()/60.00);
            return calories;
        }
        return 0.0;


    }
}
