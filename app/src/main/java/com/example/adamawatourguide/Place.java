package com.example.adamawatourguide;

public class Place {

    //Satic Final Variable used to check image availability
    private static final int NO_IMAGE_PROVIDED = -1;

    //Member variable to store name of place
    private String mname;

    //Member variable to store location of place
    private String mlocation;

    //Member variable, saves Image Value. Assigned to NO_IMAGE_PROVIDED
    private int mimgId = NO_IMAGE_PROVIDED;

    //Place constructor that takes in 2 parameters
    public Place(String mname, String mlocation) {
        this.mname = mname;
        this.mlocation = mlocation;
    }

    //Place constructor that takes in 3 parameters
    public Place(String mname, String mlocation, int mimgId) {
        this.mname = mname;
        this.mlocation = mlocation;
        this.mimgId = mimgId;
    }


    //Getters,used to get values of instance variables of the class
    public String getMname() {
        return mname;
    }

    public String getMlocation() {
        return mlocation;
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
                "mname='" + mname + '\'' +
                ", mlocation='" + mlocation + '\'' +
                ", mimgId=" + mimgId +
                '}';
    }
}
