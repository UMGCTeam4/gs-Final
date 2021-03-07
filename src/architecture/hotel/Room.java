/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package architecture.hotel;

import enums.hotel.PetFriendly;
import enums.hotel.RoomType;
import enums.hotel.Smoking;

/**
 *
 * @author Brandon Skrabanek
 */
public class Room {
    private RoomType roomType;
    private Smoking smoke;
    private PetFriendly pet;
    private double roomPrice;
    private int maxGuest;
    private boolean isDirty;
    private String roomNumber;

    public Room(String roomNumber, RoomType roomType, Smoking smoke, PetFriendly pet) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.smoke = smoke;
        this.pet = pet;
        isDirty = false;
        if (roomType == RoomType.KINGSINGLE){
            maxGuest = 3;
            roomPrice = 100.25;
        }else if (roomType == RoomType.QUEENDOUBLE){
            maxGuest = 5;
            roomPrice = 125.75;
        }
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public boolean isIsDirty() {
        return isDirty;
    }

    public void setIsDirty(boolean isDirty) {
        this.isDirty = isDirty;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public Smoking getSmoke() {
        return smoke;
    }

    public void setSmoke(Smoking smoke) {
        this.smoke = smoke;
    }

    public PetFriendly getPet() {
        return pet;
    }

    public void setPet(PetFriendly pet) {
        this.pet = pet;
    }
    
    @Override
    public String toString(){
        return "Room Number: " + roomNumber + " Room Type: " + roomType +
                " Smoking: " + smoke + " Pets: " + pet + "\n";
    }
    
    
}
