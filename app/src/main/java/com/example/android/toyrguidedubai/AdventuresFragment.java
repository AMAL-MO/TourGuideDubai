package com.example.android.toyrguidedubai;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by user on 8/14/2017.
 */

public class AdventuresFragment extends Fragment {

    public AdventuresFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.view_list, container, false);

        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<>();
        locations.add(new Location(R.string.placeName, R.string.Description, R.string.AddressName, R.string.phoneName,
                R.drawable.sky));
        locations.add(new Location(R.string.placeName2, R.string.Description2, R.string.AddressName2, R.string.phoneName2,
                R.drawable.watersports));
        locations.add(new Location(R.string.placeName3, R.string.Description3, R.string.AddressName3, R.string.phoneName3,
                R.drawable.desert));
        locations.add(new Location(R.string.placeName4, R.string.Description4, R.string.AddressName4, R.string.phoneName4,
                R.drawable.palms));

        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.id.image);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
