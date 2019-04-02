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

public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> attractions = new ArrayList<>();

        attractions.add(new Place("Sukur Cultural Landscape","Mandara Mountains",R.drawable.sukur));
        attractions.add(new Place("Koma Hills","NG-CMR boarder",R.drawable.komahills));
        attractions.add(new Place("Mandara Mountains","NG-CMR boarder",R.drawable.mandaramount));
        attractions.add(new Place("Lamurde Hot Spring","Gyakan village",R.drawable.lamurde));
        attractions.add(new Place("A.U.N","Yola bypass",R.drawable.aun));
        attractions.add(new Place("Yola Airport","Jimeta,Adamawa",R.drawable.ylaarprt));
        attractions.add(new Place("Adamawa State University","Mubi,Adamawa",R.drawable.stateuni));
        attractions.add(new Place("F.M.C","Yola bypass",R.drawable.fmc));
        attractions.add(new Place("Nigerian Law School,Yola","Yola bypass",R.drawable.lawsch));
        attractions.add(new Place("F.C.E","Yola Road, Jimeta",R.drawable.fce));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(),attractions,R.color.primaryColor);

        ListView listView = rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Place place = attractions.get(position);

                String name = place.getmName();
                Toast.makeText(getActivity(),name,Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}
