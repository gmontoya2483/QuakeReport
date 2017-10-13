package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.io.IOException;
import java.util.ArrayList;


/**
 * Created by Gabriel on 13/10/2017.
 */

public class EarthquakeLoader extends AsyncTaskLoader <ArrayList<Earthquake>> {
    public EarthquakeLoader(Context context) {
        super(context);
    }

    @Override
    public ArrayList<Earthquake> loadInBackground() {

        String jSonResponse= null;
        ArrayList<Earthquake> earthquakes=null;
        try {
            jSonResponse = QueryUtils.makeHttpRequest();

            //Get the list of earthquaques from {@Link QueryUtils}
            earthquakes = QueryUtils.extractEarthquakes(jSonResponse);

        } catch (IOException e) {
            e.printStackTrace();

        }

        return earthquakes;

    }
}
