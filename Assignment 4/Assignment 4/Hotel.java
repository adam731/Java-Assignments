/**
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

public class Hotel {
    /**
     * Initialed hotel object
     * @param name hotel name
     */

    public Hotel(String name) {
       this.name = name;
    }

    /**
     * Gets Name
     * @return name
     */

    public String getName() {
        return name;
    }

    /**
     * Gets String of get form hotel
     * @return Hotel Name
     */

    public Guest getGuest() {
        return guest;
    }

    /**
     * Gets Guest from guest
     * @param guest
     */

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    /**
     * Return setter for guest object
     * @return setguest
     */

    public double getRate() {
        return rate;
    }

    /**
     * Gets rate from hotel
     * @param rate
     */

    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * Gets Setrate from room
     */

    public void printRegister() {
        System.out.println(getName());
        System.out.println("===================");
        System.out.println("Guest Register");
        System.out.println("");
        System.out.println(guest.getName() + " " + (rate*3));
    }

    /**
     * Print Register
     * And blanker plus gets the getname from getter above
     *
     */


    private String name;
    private Guest guest;
    private double rate;
}

