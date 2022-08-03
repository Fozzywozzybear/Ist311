package workout.workoutsp2.model;

import java.io.*;
import java.util.ArrayList;

public class CardioWorkoutList {private static ArrayList<CardioWorkout> listOfCardioWorkout;
    private String storeCardioWorkouts = "cardioWorkouts.txt";

    public CardioWorkoutList(){
        this.readWorkoutListFile();
        if (listOfCardioWorkout == null ||listOfCardioWorkout.isEmpty() ) {
            listOfCardioWorkout = new ArrayList<CardioWorkout>();
            createCWList();
            this.writeWorkoutListFile();
        }


    }

    public boolean authDate(String date){

        for(int i = 0; i<listOfCardioWorkout.size();i++){
            if(date.equals(listOfCardioWorkout.get(i).getDate())){

                return true;
            }
        }
        return false;



    }
    public String containdateName(String date){

        for(int i = 0; i<listOfCardioWorkout.size();i++){
            if(date.equals(listOfCardioWorkout.get(i).getDate())){

                return (listOfCardioWorkout.get(i).getCatagorey());
            }
        }


        return "none";
    }
    public String containdateCals(String date){

        for(int i = 0; i<listOfCardioWorkout.size();i++){
            if(date.equals(listOfCardioWorkout.get(i).getDate())){

                return Double.toString((listOfCardioWorkout.get(i)).CalcCalories(listOfCardioWorkout.get(i)));
            }
        }


        return "none";
    }

    public void readWorkoutListFile() {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(storeCardioWorkouts);
            in = new ObjectInputStream(fis);
            listOfCardioWorkout = (ArrayList) in.readObject();
            in.close();
            if (!listOfCardioWorkout.isEmpty()) {
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
            fos = new FileOutputStream(storeCardioWorkouts);
            out = new ObjectOutputStream(fos);
            out.writeObject(listOfCardioWorkout);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void createCWList(){

        CardioWorkout r = new CardioWorkout("biking",20,"04/24/2022",20.2);
        CardioWorkout f = new CardioWorkout("walking",40,"04/25/2022",20.2);
        CardioWorkout m = new CardioWorkout("running",100,"04/26/2022",20.2);
        listOfCardioWorkout.add(r);
        listOfCardioWorkout.add(f);
        listOfCardioWorkout.add(m);


    }
}
