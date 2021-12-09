/*
 ---------------------------------------                 ---------------------------
 ---Hotel ------------------------------    <-----       ----- Java.lang.String ----
 ---------------------------------------                 ---------------------------
 --- Rate : Double ---------------------
 --- guest : Guest ---------------------
 --- Name : String ---------------------                                               -------------------------
 ---------------------------------------                                           <----Java.lang.String--------
 --- + Hotel (Name : String) -----------                                               -------------------------
 ---- + getName() : String -------------       <-------------------------------------------------------------------------------------------
 --- + getGuest() : Guest --------------                                                               ------------ Guest -----------------
 --------------------------------------                                                               --------- getName() : String--------
 --- + setGuest(guest : Guest) : void --                                                               -- SetName (Name: String) : Void ---
 --- + getRate(): double ---------------                                                               ------------------------------------
 --- + setRate(rate : double) : void ---   <-----       ---------------------------
 --- + printRegister() : void ----------                -----------double----------
 ---------------------------------------                ---------------------------
 */

/**
 - Student Name: Adam
 - Student Number: 20158881

 */
public class TestHotel {

    public static void main(String[] args) {
        Guest guest = new Guest("Walter Cronkite");
        Hotel hotel = new Hotel("Adams Elliott Hotel");
        hotel.setRate(99.95);
        hotel.setGuest(guest);
        hotel.printRegister();
        System.out.println("From TestHotel>>>>>" + guest.getName() + "<<<<<");


    }
}

