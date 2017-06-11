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
public class PeopleFragment extends Fragment {

    public PeopleFragment() {
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
        tourItems.add(new TourItem(R.drawable.crowley_apartments, getResources().getString(R.string
                .crowley_apartments), getResources().getString(R.string
                .crowley_apartments_address), getResources().getString(R
                .string.crowley_apartments_text), getResources().getString(R.string.crowley_apartments_price)));
        tourItems.add(new TourItem(R.drawable.lucan_home, getResources().getString(R.string
                .lucan_home),  getResources().getString(R.string.lucan_home_address), getResources().getString(R
                .string.lucan_home_text), getResources().getString(R.string
                .lucan_home_price)));
        tourItems.add(new TourItem(R.drawable.dr_crippen_home, getResources().getString(R.string
                .dr_crippen_home),  getResources().getString(R.string.dr_crippen_home_address), getResources().getString(R
                .string.dr_crippen_home_text), getResources().getString(R.string.dr_crippen_home_price)));
        tourItems.add(new TourItem(R.drawable.john_haigh_work, getResources().getString(R.string
                .john_haigh_work),  getResources().getString(R.string.john_haigh_work_address), getResources().getString(R
                .string.john_haigh_work_text), getResources().getString(R.string.john_haigh_work_price)));
        tourItems.add(new TourItem(R.drawable.calvi_bridge, getResources().getString(R.string
                .calvi_bridge),  getResources().getString(R.string.calvi_bridge_address), getResources().getString(R
                .string.calvi_bridge_text), getResources().getString(R.string.calvi_bridge_price)));
//
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
