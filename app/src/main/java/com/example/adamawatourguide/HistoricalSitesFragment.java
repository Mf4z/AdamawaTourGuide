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

public class HistoricalSitesFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> sites = new ArrayList<>();

        sites.add(new Place("Welcome to Adamawa", "Yola-Numan road", R.drawable.welcomeadamawa));
        sites.add(new Place("Welcome to Yola", "Yola South", R.drawable.ylas));
        sites.add(new Place("Farewell from Yola", "Yola South", R.drawable.jippujam));
        sites.add(new Place("Central Mosque", "Yola town", R.drawable.ctrlmsq));
        sites.add(new Place("Lamido's Palace", "Yola town", R.drawable.palace));
        sites.add(new Place("House of Assembly", "Jimeta,Yola", R.drawable.houseassmbly));
        sites.add(new Place("Adamawa High Court", "Jimeta,Yola", R.drawable.court));


        PlaceAdapter adapter = new PlaceAdapter(getActivity(), sites, R.color.bluecolor);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Place place = sites.get(position);

                String name = place.getmName();
                Toast.makeText(getActivity(), name, Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}
