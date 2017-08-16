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

public class ShopsFragment extends android.support.v4.app.Fragment {
    public ShopsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.view_list, container, false);
        // Create a list of Locations
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.placeName5, R.string.Description5, R.string.AddressName5, R.string.phoneName5,
                R.drawable.dubai));
        locations.add(new Location(R.string.placeName6, R.string.Description6, R.string.AddressName6, R.string.phoneName6,
                R.drawable.emirates));
        locations.add(new Location(R.string.placeName7, R.string.Description7, R.string.AddressName7, R.string.phoneName7,
                R.drawable.jbr
        ));
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.id.image);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
