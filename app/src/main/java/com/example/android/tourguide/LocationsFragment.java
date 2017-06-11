package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class LocationsFragment extends Fragment {

    public LocationsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Find and inflate ListView to use with adapter
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        // Create a list of Sights
        final ArrayList<TourItem> tourItems = new ArrayList<TourItem>();

        // Populate item list
        tourItems.add(new TourItem(R.drawable.drury_lane_plague, getResources().getString(R.string
                .drury_lane_plague), getResources().getString(R.string
                .drury_lane_plague_address), getResources().getString(R
                .string.drury_lane_plague_text), getResources().getString(R.string.drury_lane_plague_price)));
        tourItems.add(new TourItem(R.drawable.goulston_street_graffiti, getResources().getString(R.string
                .goulston_street_graffiti),  getResources().getString(R.string.goulston_street_graffiti_address), getResources().getString(R
                .string.goulston_street_graffiti_text), getResources().getString(R.string
                .goulston_street_graffiti_price)));
        tourItems.add(new TourItem(R.drawable.gladiators_arena, getResources().getString(R.string
                .gladiators_arena),  getResources().getString(R.string.gladiators_arena_address), getResources().getString(R
                .string.gladiators_arena_text), getResources().getString(R.string.gladiators_arena_price)));
        tourItems.add(new TourItem(R.drawable.temple_church, getResources().getString(R.string
                .temple_church),  getResources().getString(R.string.temple_church_address), getResources().getString(R
                .string.temple_church_text), getResources().getString(R.string.temple_church_price)));
        tourItems.add(new TourItem(R.drawable.st_andrew, getResources().getString(R.string
                .st_andrew),  getResources().getString(R.string.st_andrew_address), getResources().getString(R
                .string.st_andrew_text), getResources().getString(R.string.st_andrew_price)));
        tourItems.add(new TourItem(R.drawable.mithraic_temple, getResources().getString(R.string
                .mithraic_temple),  getResources().getString(R.string.mithraic_temple_address), getResources().getString(R
                .string.mithraic_temple_text), getResources().getString(R.string.mithraic_temple_price)));

        // Create an {@link CustomItemAdapter}, whose data source is a list of {@link TourItem}s.
        // The adapter knows how to create list items for each item in the list.
        CustomItemAdapter adapter = new CustomItemAdapter(getActivity(), tourItems);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // tour_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link CustomItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link TourItem} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}
