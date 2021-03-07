/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts.hotel;

import gui.hotel.MainGUI;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brandon Skrabanek
 */
public class Login {

    private MainGUI main;
    private static final String FILE_NAME = "UserList.txt";

    public Login(MainGUI main) {
        this.main = main;
    }

// method that check if username and password exist in the file
    public boolean login(String user, String pass) {
        boolean Login = false;

        for (User u : main.getMasterUserList()) {
            if (u.getUsername().equals(user) && u.getPassword().equals(pass)) {
                main.setCurrentUser(u);
                Login = true;
                break;
            }
        }
        return Login;
    }

    public static ArrayList<User> getUsersList() {
        ArrayList<User> userList = new ArrayList<>();
        // creating object of file class
        File file = new File(FILE_NAME);

        FileReader fr;
        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;

            // reading from file and checks if it matches with file
            while ((line = br.readLine()) != null) {
                String[] split = line.split(", ");
                String username = split[0];
                String password = split[1];
                String firstName = split[2];
                String lastName = split[3];
                String email = split[4];
                String address = split[5];

                User user = new User(username, password, firstName, lastName, email, address);
                userList.add(user);
            }
            fr.close();
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userList;
    }

    public void addUserToFile(User user) {
        try {
            Files.write(Paths.get(FILE_NAME), (user.getUsername() + ", " + user.getPassword()
                    + ", " + user.getFirstName() + ", " + user.getLastName() + ", " + user.getEmail()
                    + ", " + user.getAddress()+ "\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateUsersToFile(){
        try {
            Files.delete(Paths.get(FILE_NAME));
            Files.createFile(Paths.get(FILE_NAME));
            for(User u : main.getMasterUserList()){
                addUserToFile(u);
            }
        } catch (IOException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
