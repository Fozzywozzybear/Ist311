package workout.workoutsp2.model;

import java.io.Serializable;

public class Food implements Serializable {
    private String foodName,date;
    private double servingSize;
    private int calories;
    private double totalCalories;


    public Food(String foodName, double servingSize, int  calories,String date) {
        this.foodName = foodName;
        this.servingSize = servingSize;
        this.calories = calories;
        this.date = date;

    }

    public String getFoodName() {
        return foodName;
    }


    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getServingSize() {
        return servingSize;
    }

    public void setServingSize(double servingSize) {
        this.servingSize = servingSize;
    }

    public int getCalories() {
        return calories;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public double calcTotalCalories(Food food){
        this.totalCalories=this.getCalories()*this.getServingSize();
        return this.totalCalories;

    }
}
