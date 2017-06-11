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
public class FoodDrinkFragment extends Fragment {

    public FoodDrinkFragment() {
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
        tourItems.add(new TourItem(R.drawable.princess_louise_pub, getResources().getString(R.string
                .princess_louise_pub), getResources().getString(R.string
                .princess_louise_pub_address), getResources().getString(R
                .string.princess_louise_pub_text),
                getResources().getString(R.string.princess_louise_pub_price)));
        tourItems.add(new TourItem(R.drawable.the_blind_beggar, getResources().getString(R.string
                .the_blind_beggar),  getResources().getString(R.string.the_blind_beggar_address),
                getResources().getString(R.string.the_blind_beggar_text), getResources().getString(R.string
                .the_blind_beggar_price)));
        tourItems.add(new TourItem(R.drawable.the_fortune_of_war, getResources().getString(R.string
                .the_fortune_of_war),  getResources().getString(R.string.the_fortune_of_war_address), getResources
                ().getString(R
                .string.the_fortune_of_war_text), getResources().getString(R.string
                .the_fortune_of_war_price)));
        tourItems.add(new TourItem(R.drawable.ten_bells, getResources().getString(R.string
                .ten_bells),  getResources().getString(R.string.ten_bells_address), getResources()
                .getString(R
                .string.ten_bells_text), getResources().getString(R.string.ten_bells_price)));
        tourItems.add(new TourItem(R.drawable.the_magdala, getResources().getString(R.string
                .the_magdala),  getResources().getString(R.string.the_magdala_address), getResources()
                .getString(R.string.the_magdala_text), getResources().getString(R.string
                .the_magdala_price)));
        tourItems.add(new TourItem(R.drawable.the_pembroke, getResources().getString(R.string
                .the_pembroke),  getResources().getString(R.string.the_pembroke_address),
                getResources().getString(R.string.the_pembroke_text), getResources().getString(R.string
                .the_pembroke_price)));

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
