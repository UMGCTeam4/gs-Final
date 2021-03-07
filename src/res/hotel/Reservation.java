package res.hotel;

import architecture.hotel.Room;
import enums.hotel.PetFriendly;
import enums.hotel.Smoking;
import java.util.Date;

/**
 *
 * @author Brandon Skrabanek
 */
public class Reservation {

    private String firstName, lastName, boxName;
    private int numOfGuests;
    private Date stayStart, stayEnd;
    private Smoking smoke;
    private PetFriendly pet;
    private Room room;

    public Reservation(String firstName, String lastName, Room room, int numOfGuests,
            Date stayStart, Date stayEnd, Smoking smoke, PetFriendly pet) {
        if (firstName == null || lastName == null || room == null || numOfGuests == 0
                || stayStart == null || stayEnd == null || smoke == null || pet == null) {
            throw new NullPointerException();
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.room = room;
        this.numOfGuests = numOfGuests;
        this.stayStart = stayStart;
        this.stayEnd = stayEnd;
        this.smoke = smoke;
        this.pet = pet;
        boxName = lastName + ", " + firstName;
    }

    public int getNumOfGuests() {
        return numOfGuests;
    }

    public void setNumOfGuests(int numOfGuests) {
        if (numOfGuests == 0) {
            throw new NumberFormatException();
        } else {
            this.numOfGuests = numOfGuests;
        }
    }

    public Date getStayStart() {
        return stayStart;
    }

    public void setStayStart(Date stayStart) {
        if (stayStart.equals(null)) {
            throw new NullPointerException();
        } else {
            this.stayStart = stayStart;
        }
    }

    public Date getStayEnd() {
        return stayEnd;
    }

    public void setStayEnd(Date stayEnd) {
        if (stayEnd.equals(null)) {
            throw new NullPointerException();
        } else {
            this.stayEnd = stayEnd;
        }
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

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        if (room == null) {
            throw new NullPointerException();
        } else {
            this.room = room;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.equals("")) {
            throw new NullPointerException();
        } else {
            this.firstName = firstName;
            boxName = lastName + ", " + firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.equals("")) {
            throw new NullPointerException();
        } else {
            this.lastName = lastName;
            boxName = lastName + ", " + firstName;
        }
    }

    public String getBoxName() {
        return boxName;
    }
}
