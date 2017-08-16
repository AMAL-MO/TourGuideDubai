package com.example.android.toyrguidedubai;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 8/14/2017.
 */

public class LocationAdapter extends ArrayAdapter<Location> {
    private int mImageResourceId;

    public LocationAdapter(Context context, ArrayList<Location> LocationList, int ImageResourceId) {
        super(context, 0, LocationList);
        mImageResourceId = ImageResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Location currentLocation = getItem(position);
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        TextView PlaceName = (TextView) listItemView.findViewById(R.id.place_name);
        PlaceName.setText(currentLocation.getPlaceName());

        TextView description =
                (TextView) listItemView.findViewById(R.id.description);
        description.setText(currentLocation.getDescription());

        TextView address = (TextView) listItemView.findViewById(R.id.address);
        address.setText(currentLocation.getAddress());
        TextView phone = (TextView) listItemView.findViewById(R.id.phone);
        phone.setText(currentLocation.getPhone());
        ImageView photo = (ImageView) listItemView.findViewById(R.id.image);

        if (currentLocation.hasImage()) {
            photo.setImageResource(currentLocation.getImageResourceId());
            photo.setVisibility(View.VISIBLE);
        } else {
            photo.setVisibility(View.GONE);
        }
        return listItemView;
    }


}
