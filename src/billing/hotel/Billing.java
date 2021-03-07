package billing.hotel;

import res.hotel.Reservation;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;

/**
 *
 * @author Bronwyn Davies
 *
 */
public class Billing {

    //Created at checkout. Constructor takes in a reservation object.
    private Reservation res;
    private double hotelFee, discount, feeTotal;
    private int numOfRooms;
    private LinkedHashMap<String, Double> chargesPerDay;

    public Billing(Reservation res) {
        this.res = res;
        hotelFee = 22.90;
    }

    public void addDiscount(double discount) {
        this.discount += discount;
    }

    public void addFee(double fee) {
        feeTotal += fee;
    }

    public double getFeeTotal() {
        return feeTotal;
    }

    public void setFeeTotal(double feeTotal) {
        this.feeTotal = feeTotal;
    }

    public double getHotelFee() {
        return hotelFee;
    }

    public LinkedHashMap<String, Double> getChargesPerDay() {
        return chargesPerDay;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public Reservation getRes() {
        return res;
    }
    

    public double getDiscount() {
        return discount;
    }    

    public double getDayPrice(Date date) {
        double tempPrice = 0;

        // get day of the week from input date
        int day = getDayOfWeek(date);
        String dayOfWeek;
        
        //gets price from reservation
        switch (day) {
            case 1:
                dayOfWeek = "Sunday";
                tempPrice = 30;
                break;
            case 2:
                dayOfWeek = "Monday";
                tempPrice = 20;
                break;
            case 3:
                dayOfWeek = "Tuesday";
                tempPrice = 20;
                break;
            case 4:
                dayOfWeek = "Wednesday";
                tempPrice = 20;
                break;
            case 5:
                dayOfWeek = "Thursday";
                tempPrice = 30;
                break;
            case 6:
                dayOfWeek = "Friday";
                tempPrice = 40;
                break;
            case 7:
                dayOfWeek = "Saturday";
                tempPrice = 40;
                break;
            default:
                break;
        }
        return tempPrice;
    }

    public int getDayOfWeek(Date date) {
        //determines day of week that a date falls on and returns it
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek;
    }

    public double totalBill() {
        double totalPrice = 0.0;
        Date stayStartDate = res.getStayStart();
        Date stayEndDate = res.getStayEnd();
        Calendar stayStart = Calendar.getInstance();
        stayStart.setTime(stayStartDate);

        Calendar stayEnd = Calendar.getInstance();
        stayEnd.setTime(stayEndDate);
        stayEnd.add(Calendar.DATE, -1); //checkout date should not be considered, decrement by 1 day

        double roomPrice = res.getRoom().getRoomPrice();

        double tempPrice = 0.0;
        chargesPerDay = new LinkedHashMap<>();
        while (!stayStart.after(stayEnd)) { //loop will break if stay start date is after stay end date
            //getting current date (one dy at a time)
            Date currentDate = stayStart.getTime();
            //getting current day's temp price
            double dayPrice = getDayPrice(currentDate);
            //calculating current day's price
            double currentDayPrice = roomPrice + dayPrice;
            //adding the current day price in total price
            totalPrice += currentDayPrice;
            DateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");

            chargesPerDay.put(formatter.format(currentDate), currentDayPrice);

            //changing the date to next day
            stayStart.add(Calendar.DATE, 1); //increment day by 1
        }

        totalPrice = totalPrice + hotelFee + feeTotal;
        totalPrice = totalPrice - discount;
        return totalPrice;

    }
}
