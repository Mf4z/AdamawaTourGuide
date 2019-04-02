package com.example.adamawatourguide;

public class Place {

    //Satic Final Variable used to check image availability
    private static final int NO_IMAGE_PROVIDED = -1;

    //Member variable to store name of place
    private String mName;

    //Member variable to store location of place
    private String mLocation;

    //Member variable, saves Image Value. Assigned to NO_IMAGE_PROVIDED
    private int mimgId = NO_IMAGE_PROVIDED;

    //Place constructor that takes in 2 parameters
    public Place(String mName, String mLocation) {
        this.mName = mName;
        this.mLocation = mLocation;
    }

    //Place constructor that takes in 3 parameters
    public Place(String mName, String mLocation, int mimgId) {
        this.mName = mName;
        this.mLocation = mLocation;
        this.mimgId = mimgId;
    }


    //Getters,used to get values of instance variables of the class
    public String getmName() {
        return mName;
    }

    public String getmLocation() {
        return mLocation;
    }

    public int getMimgId() {
        return mimgId;
    }

    //Method to check if image is available or not
    public boolean hasImage() {
        return mimgId != NO_IMAGE_PROVIDED;
    }


    @Override
    public String toString() {
        return "Place{" +
                "mName='" + mName + '\'' +
                ", mLocation='" + mLocation + '\'' +
                ", mimgId=" + mimgId +
                '}';
    }
}
