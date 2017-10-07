package com.example.android.quakereport;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Gabriel on 03/10/2017.
 */

class Earthquake {

    private double mMagnitude;
    private String mLocation;
    private long mDate;
    private String mUrl;


    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        this.mMagnitude = magnitude;
        this.mLocation = location;
        this.mDate = timeInMilliseconds;
        this.mUrl = url;
    }

    /**
     * Getter method for the member variable mMag
     * @return the magnitude
     */
    public double getMagnitude() {
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


    /**
     * Getter method for the member variable mUrl
     * @return the url
     */
    public String getUrl() {
        return mUrl;
    }



}
