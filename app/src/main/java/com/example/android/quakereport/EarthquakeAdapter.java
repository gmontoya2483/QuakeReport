package com.example.android.quakereport;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Gabriel on 03/10/2017.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake>{

    /**
     *
     * *This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context  The current context. Used to inflate the layout file.
     * @param objects List of Earthquakes objects to display in a list
     */

    public EarthquakeAdapter(@NonNull Context context, @NonNull List<Earthquake> objects) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, objects);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        // Check if the existing view is being reused, otherwise inflate the view
        if (listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.earthquake_list_item,parent,false);
        }

        Earthquake currentEarthquake=getItem(position);

        TextView magTextView=(TextView) listItemView.findViewById(R.id.magnitude);
        magTextView.setText(currentEarthquake.getMagnitude());

        TextView locationTextView=(TextView) listItemView.findViewById(R.id.location);
        locationTextView.setText(currentEarthquake.getLocation());

        TextView dateTextView=(TextView) listItemView.findViewById(R.id.date);
        dateTextView.setText(currentEarthquake.getDate());

        return listItemView;

    }
}
