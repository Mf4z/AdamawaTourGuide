package com.example.adamawatourguide;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class EventsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> events = new ArrayList<>();

        events.add(new Place("Eid el Kabir","Celebrating 10th ZulHajj"));
        events.add(new Place("Eid el Fitr","Celebrating the end of Ramadan"));
        events.add(new Place("Hawan Daushe","Eid Dabur"));
        events.add(new Place("Njuwa Fishing Festival"," March-May. Buatiya,Bata Adamawa"));
        events.add(new Place("Sharo Shadi Festival","Celebrated on Eid el Kabir day"));
        events.add(new Place("Sharo Shadi Festival","Celebrated on Eid el Kabir day"));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(),events,R.color.primaryColor);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Place place = events.get(position);

                String name = place.getmName();
                Toast.makeText(getActivity(),name,Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}
