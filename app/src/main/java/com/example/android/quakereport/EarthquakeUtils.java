package com.example.android.quakereport;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Gabriel on 06/10/2017.
 */

public class EarthquakeUtils {

    /**
     * Format the object date to Show the date as String in the correct format.
     * @param dateObject
     * @return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    public static String formatDate(Date dateObject){
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    /**
     * Format the object date to Show the time as String in the correct format.
     * @param dateObject
     * @return tReturn the formatted date string (i.e. "4:30 PM") from a Date object.
     */
    public static String formatTime(Date dateObject){
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }


    /**
     * Return the formatted magnitude string showing 1 decimal place (i.e. "3.2")
     * from a decimal magnitude value.
     */
    public static String formatMagnitude(double magnitude) {
        DecimalFormat magnitudeFormat = new DecimalFormat("0.0");
        return magnitudeFormat.format(magnitude);
    }







}
