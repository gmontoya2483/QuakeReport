package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Gabriel on 03/10/2017.
 */

class Earthquake {

    private String mMagnitude;
    private String mLocation;
    private long mDate;


    public Earthquake(String magnitude, String location, long date) {
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
     * @return the date in Unix format
     */
    public long getDate() {
        return mDate;
    }
}
