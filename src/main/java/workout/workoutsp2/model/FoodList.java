package workout.workoutsp2.model;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class FoodList {private static ArrayList<Food> listOfFood;
    double totalCals=0;
    private String savedListOfFood = "foodlist.txt";
    public FoodList(){
        this.readWorkoutListFile();
        if (listOfFood == null || listOfFood.isEmpty() ) {
            listOfFood = new ArrayList<Food>();
            this.writeWorkoutListFile();

        }

    }

    public static ArrayList<Food> getListOfFood() {
        return listOfFood;
    }
    public boolean contains(String foodName){

        for(int i = 0; i<listOfFood.size();i++){
            if(foodName.equals(listOfFood.get(i).getFoodName())){

                    return true;
            }
        }
        return false;

    }

    public String containdateName(String date){

        for(int i = 0; i<listOfFood.size();i++){
            if(date.equals(listOfFood.get(i).getDate())){

                return (listOfFood.get(i).getFoodName());
            }
        }


        return date;
    }
    public int containdateCalories(String date){

        for(int i = 0; i<listOfFood.size();i++){
            if(date.equals(listOfFood.get(i).getDate())){

                return (listOfFood.get(i).getCalories());
            }
        }
        return 0;


    }
    public boolean authDate(String date){

        for(int i = 0; i<listOfFood.size();i++){
            if(date.equals(listOfFood.get(i).getDate())){

                return true;
            }
        }
        return false;



    }

    public void readWorkoutListFile() {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(savedListOfFood);
            in = new ObjectInputStream(fis);
            listOfFood = (ArrayList) in.readObject();
            in.close();
            if (!listOfFood.isEmpty()) {
                System.out.println("There are workout in the workout list");
            }
        } catch (FileNotFoundException fne) {
            System.out.println("File was not found, a new one will be created");
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void writeWorkoutListFile() {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(savedListOfFood);
            out = new ObjectOutputStream(fos);
            out.writeObject(listOfFood);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void setListOfFood(ArrayList<Food> listOfFood) {
        FoodList.listOfFood = listOfFood;
    }


    public void addFood(Food food){
        listOfFood.add(food);
    }
    public void remakeFoodList(){
        listOfFood= new ArrayList<Food>();
    }



}
