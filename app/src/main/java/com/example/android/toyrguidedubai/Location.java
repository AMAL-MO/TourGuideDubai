package com.example.android.toyrguidedubai;

/**
 * Created by user on 8/14/2017.
 */

public class Location {

    private int placeName;
    private int description;
    private int address;
    private int phone;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mimageResourceId = NO_IMAGE_PROVIDED;

    public Location(int placeName, int description, int address, int phone, int imageResourceId) {
        this.placeName = placeName;
        this.description = description;
        this.address = address;
        this.phone = phone;
        this.mimageResourceId = imageResourceId;
    }

    public int getPlaceName() {
        return placeName;
    }

    public int getDescription() {
        return description;
    }

    public int getAddress() {
        return address;
    }

    public int getPhone() {
        return phone;
    }

    public int getImageResourceId() {
        return mimageResourceId;
    }

    public boolean hasImage() {
        return mimageResourceId != NO_IMAGE_PROVIDED;
    }


}
