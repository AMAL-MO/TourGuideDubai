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

public class ThemeParksFragment extends android.support.v4.app.Fragment {
    public ThemeParksFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.view_list, container, false);
        // Create a list of  locations
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.placeName12, R.string.Description12, R.string.AddressName12, R.string.phoneName12,
                R.drawable.motiongate));
        locations.add(new Location(R.string.placeName13, R.string.Description13, R.string.AddressName13, R.string.phoneName13,
                R.drawable.legoland));
        locations.add(new Location(R.string.placeName14, R.string.Description14, R.string.AddressName14, R.string.phoneName14,
                R.drawable.bollywood));
        // Create an {@link LocationAdapter}
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.id.image);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
