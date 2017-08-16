package com.example.android.toyrguidedubai;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by user on 8/14/2017.
 */

public class RestaurantsFragment extends android.support.v4.app.Fragment {
    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.view_list, container, false);

        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.placeName8, R.string.Description8, R.string.AddressName8, R.string.phoneName8,
                R.drawable.alto));
        locations.add(new Location(R.string.placeName9, R.string.Description9, R.string.AddressName9, R.string.phoneName9,
                R.drawable.mome));
        locations.add(new Location(R.string.placeName10, R.string.Description10, R.string.AddressName10, R.string.phoneName10,
                R.drawable.pierchic));
        locations.add(new Location(R.string.placeName11, R.string.Description11,R.string.AddressName11,R.string.phoneName11,
                R.drawable.catc
        ));
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.id.image);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}