package workout.workoutsp2.model;

import java.io.Serializable;

public class WeightWorkout  implements Serializable {
    private String catagorey,name;
    private int sets,reps;
    private double time;
    private String date;

    public WeightWorkout(String catagorey, String name, int sets, int reps, double time, String date) {
        this.catagorey = catagorey;
        this.name = name;
        this.sets = sets;
        this.reps = reps;
        this.time = time;
        this.date = date;
    }

    public String getCatagorey() {
        return catagorey;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public double getTime() {
        return time;
    }
    public String getTimeString(){
        return Double.toString(time);
    }


}
