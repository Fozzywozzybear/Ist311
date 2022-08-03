package workout.workoutsp2.model;

import java.io.*;
import java.util.ArrayList;

public class userList {private static ArrayList<User> listOfUsers;
    private String storeUserList = "userlist.txt";
    public userList(){
        this.readWorkoutListFile();
        if (listOfUsers == null ||listOfUsers.isEmpty() ) {
            listOfUsers = new ArrayList<User>();
            createUserList();
            this.writeWorkoutListFile();
        }

    }
    public static boolean authenticate(User user){
        for(int i = 0; i<listOfUsers.size();i++){
            if(user.getUserName().equals(listOfUsers.get(i).getUserName())){
                if(user.getPassword().equals(listOfUsers.get(i).getPassword())){
                    return true;
                }
            }
        }
        return false;

    }


    public void readWorkoutListFile() {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(storeUserList);
            in = new ObjectInputStream(fis);
            listOfUsers = (ArrayList) in.readObject();
            in.close();
            if (!listOfUsers.isEmpty()) {
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
            fos = new FileOutputStream(storeUserList);
            out = new ObjectOutputStream(fos);
            out.writeObject(listOfUsers);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public void createUserList(){

            User f = new User("fozzy", "IamLegend123!" );
            User m = new User("matt", "321!" );
            User r = new User("roy", "dontknow!" );
            listOfUsers.add(r);
            listOfUsers.add(f);
            listOfUsers.add(m);


    }

}
