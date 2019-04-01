package com.example.adamawatourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PlaceAdapter extends ArrayAdapter<Place> {


    //Instance variable for color resource id
    private int mColorResourceId;

    public PlaceAdapter(Context context,@NonNull List<Place> objects,int colorResId) {
        super(context, 0, objects);

        //Resource color for background of color of list of words
        mColorResourceId = colorResId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Place curPlace = getItem(position);

        TextView name_tv = listItemView.findViewById(R.id.name_tv);
        name_tv.setText(curPlace.getMname());

        TextView location_tv = listItemView.findViewById(R.id.location_tv);
        location_tv.setText(curPlace.getMlocation());

        ImageView defImg = listItemView.findViewById(R.id.image_iv);

        if (curPlace.hasImage()) {
            defImg.setImageResource(curPlace.getMimgId());
            defImg.setVisibility(View.VISIBLE);
        }

        else {
            defImg.setVisibility(View.GONE);
        }


        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);

        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
