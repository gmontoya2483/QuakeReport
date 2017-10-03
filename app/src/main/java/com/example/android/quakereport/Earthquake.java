package com.example.android.quakereport;

/**
 * Created by Gabriel on 03/10/2017.
 */

class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private String mDate;


    public Earthquake(String magnitude, String location, String date) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mDate = date;
    }

    /**
     * Getter method for the member variable mMag
     * @return the magnitude
     */
    public String getMagnitude() {
        return mMagnitude;
    }

    /**
     * Getter method for the member variable mLocation
     * @return the location
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Getter method for the member variable mDate
     * @return the date
     */
    public String getDate() {
        return mDate;
    }
}
