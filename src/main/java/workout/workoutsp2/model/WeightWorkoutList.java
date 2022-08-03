package workout.workoutsp2.model;

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;

public class WeightWorkoutList {private static ArrayList<WeightWorkout> listOfWeightWorkout;
    private String storeWeightWorkoutList = "weightWorkouts.txt";
    public WeightWorkoutList(){
        this.readWorkoutListFile();
        if (listOfWeightWorkout == null ||listOfWeightWorkout.isEmpty() ){
            listOfWeightWorkout = new ArrayList<WeightWorkout>() ;
            createWWList();
            this.writeWorkoutListFile();
        }
//        createWorkoutList();


    }


//    public void createWorkoutList(){
//
//        WeightWorkout f = new WeightWorkout("Leg", "Squat","hard",290,55 );
//        WeightWorkout m = new WeightWorkout("Chest", "chest press","hard",100,55 );
//        WeightWorkout r = new WeightWorkout("Arm", "bi curl","easy",50,10 );
//        WeightWorkout b = new WeightWorkout("Shoulder", "bi curl","easy",50,10 );
//        WeightWorkout l = new WeightWorkout("Back", "bi curl","easy",50,10 );
//
//
//        listOfWeightWorkout.add(r);
//        listOfWeightWorkout.add(f);
//        listOfWeightWorkout.add(m);
//        listOfWeightWorkout.add(b);
//        listOfWeightWorkout.add(l);
//
//
//    }
    public WeightWorkout getWorkout( String catagorey){
        for(int i = 0; i<listOfWeightWorkout.size();i++){
            if(catagorey.equals(listOfWeightWorkout.get(i).getCatagorey())){
                System.out.println(listOfWeightWorkout.get(i));

                return listOfWeightWorkout.get(i);
            }
        }
        return null;

    }
    public String containdateName(String date){

        for(int i = 0; i<listOfWeightWorkout.size();i++){
            if(date.equals(listOfWeightWorkout.get(i).getDate())){

                return (listOfWeightWorkout.get(i).getName());
            }
        }


        return "none";
    }
    public String containdateTime(String date){

        for(int i = 0; i<listOfWeightWorkout.size();i++){
            if(date.equals(listOfWeightWorkout.get(i).getDate())){

                return (Double.toString(listOfWeightWorkout.get(i).getTime()));
            }
        }


        return "none";
    }

    public boolean authDate(String date){

        for(int i = 0; i<listOfWeightWorkout.size();i++){
            if(date.equals(listOfWeightWorkout.get(i).getDate())){

                return true;
            }
        }
        return false;



    }
    public void readWorkoutListFile() {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(storeWeightWorkoutList);
            in = new ObjectInputStream(fis);
            listOfWeightWorkout = (ArrayList) in.readObject();
            in.close();
            if (!listOfWeightWorkout.isEmpty()) {
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
            fos = new FileOutputStream(storeWeightWorkoutList);
            out = new ObjectOutputStream(fos);
            out.writeObject(listOfWeightWorkout);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void createWWList(){

        WeightWorkout r = new WeightWorkout("legs","leg press",4,12,10,"04/24/2022");
        WeightWorkout f = new WeightWorkout("arms","curls",4,12,10,"04/25/2022");
        WeightWorkout m =new WeightWorkout("chest","chest press",4,12,10,"04/26/2022");
        listOfWeightWorkout.add(r);
        listOfWeightWorkout.add(f);
        listOfWeightWorkout.add(m);


    }
}



