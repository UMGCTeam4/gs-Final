/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package architecture.hotel;

import enums.hotel.PetFriendly;
import enums.hotel.RoomType;
import enums.hotel.Smoking;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brandon Skrabanek
 */
public class MasterRoomList {

    ArrayList<Room> masterRoomList;

    public MasterRoomList() {
        masterRoomList = new ArrayList<Room>();
        createMasterList();
    }

    public ArrayList<Room> getMasterRoomList() {
        return masterRoomList;
    }

    public void addRoom(Room room) {
        masterRoomList.add(room);
    }

    public void removeRoom(Room room) {
        for (Room r : masterRoomList) {
            if (r.getRoomNumber().equals(room.getRoomNumber())) {
                masterRoomList.remove(r);
            }
        }
    }

    public void setDirty(Room room) {
        for (Room r : masterRoomList) {
            if (r.getRoomNumber().equals(room.getRoomNumber())) {
                r.setIsDirty(true);
            }
        }
    }

    public void setClean(Room room) {
        for (Room r : masterRoomList) {
            if (r.getRoomNumber().equals(room.getRoomNumber())) {
                r.setIsDirty(false);
            }
        }
    }

    public boolean checkDirty(Room room) {
        boolean isDirty = false;
        for (Room r : masterRoomList) {
            if (r.getRoomNumber().equals(room.getRoomNumber())) {
                isDirty = r.isIsDirty();
            }
        }
        return isDirty;
    }

//    public void checkCapacity(Room room, int numOfGuests) {
//        for (Room r : masterRoomList) {
//            if (r.getRoomNumber().equals(room.getRoomNumber())) {
//                if (r.getMaxGuest() > numOfGuests) {
//                    JOptionPane.showMessageDialog(null, "Room is at capacity. An additional room"
//                            + " is required.");
//                }
//            }
//        }
//    }

    private void createMasterList() {
        File file = new File("rooms.txt");
        FileReader fr;
        try {
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            RoomType type;
            Smoking smoke;
            PetFriendly pets;
            while ((line = br.readLine()) != null) {
                String[] split = line.split("\\s*,\\s*");
                String tempNum = split[0];           
                String tempType = split[1];
                if (tempType.contains("RoomType.KINGSINGLE")) {
                    type = RoomType.KINGSINGLE;
                } else {
                    type = RoomType.QUEENDOUBLE;
                }
                String tempSmoke = split[2];
                if (tempSmoke.contains("Smoking.SMOKING")) {
                    smoke = Smoking.SMOKING;
                } else {
                    smoke = Smoking.NONSMOKING;
                }
                String tempPets = split[3];
                if(tempPets.contains("YES"))
                    pets = PetFriendly.YES;
                else pets = PetFriendly.NO;
                
                Room tempRoom = new Room(tempNum, type, smoke, pets);
                addRoom(tempRoom);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MasterRoomList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MasterRoomList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
