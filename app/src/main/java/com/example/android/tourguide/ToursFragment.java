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
public class ToursFragment extends Fragment {

    public ToursFragment() {
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
        tourItems.add(new TourItem(R.drawable.the_krays_tour, getResources().getString(R.string
                .the_krays_tour), getResources().getString(R.string.the_krays_tour_phone),
                2, getResources().getString(R
                .string.the_krays_tour_address), getResources().getString(R.string.the_krays_tour_text) ,
                getResources().getString(R.string.the_krays_tour_price), getResources().getString(R.string.unit_hours)));
        tourItems.add(new TourItem(R.drawable.sweeney_todd_tour, getResources().getString(R.string
                .sweeney_todd_tour), getResources().getString(R.string.sweeney_todd_tour_phone),
                2, getResources().getString(R
                .string.sweeney_todd_tour_address), getResources().getString(R.string.sweeney_todd_tour_text) ,
                getResources().getString(R.string.sweeney_todd_tour_price), getResources().getString(R.string.unit_hours)));
        tourItems.add(new TourItem(R.drawable.jack_the_ripper_tour, getResources().getString(R.string
                .jack_the_ripper_tour), getResources().getString(R.string.jack_the_ripper_phone),
                2, getResources().getString(R
                .string.jack_the_ripper_address), getResources().getString(R.string.jack_the_ripper_text) ,
                getResources().getString(R.string.jack_the_ripper_price), getResources().getString(R.string.unit_hours)));
        tourItems.add(new TourItem(R.drawable.the_plague_tour, getResources().getString(R.string
                .the_plague_tour), getResources().getString(R.string.the_plague_tour_phone),
                2, getResources().getString(R
                .string.the_plague_tour_address), getResources().getString(R.string.the_plague_tour_text) ,
                getResources().getString(R.string.the_plague_tour_price), getResources().getString(R.string.unit_hours)));
        tourItems.add(new TourItem(R.drawable.london_ghost_walk_tour, getResources().getString(R.string
                .london_ghost_walk_tour), getResources().getString(R.string.london_ghost_walk_phone),
                2, getResources().getString(R
                .string.london_ghost_walk_address), getResources().getString(R.string.london_ghost_walk_text) ,
                getResources().getString(R.string.london_ghost_walk_price), getResources().getString(R.string.unit_hours)));
        tourItems.add(new TourItem(R.drawable.the_blood_and_tears_walk_tour, getResources().getString(R.string
                .the_blood_and_tears_walk_tour), getResources().getString(R.string.the_blood_and_tears_phone),
                2, getResources().getString(R
                .string.the_blood_and_tears_address), getResources().getString(R.string.the_blood_and_tears_text) ,
                getResources().getString(R.string.the_blood_and_tears_price), getResources().getString(R.string.unit_hours)));
//        tourItems.add(new TourItem(R.drawable.tour_forum, getResources().getString(R.string
//                .tour_forum), getResources().getString(R.string.phone_number_tour_forum),
//                4, getResources().getString(R
//                .string.address_tour_forum), getResources().getString(R.string.subtext_tour_forum) ,
//                getResources().getString(R.string.price_range_tour_forum), getResources().getString(R.string.unit_hours)));
//        tourItems.add(new TourItem(R.drawable.tour_countryside, getResources().getString(R.string
//                .tour_countryside), getResources().getString(R.string.phone_number_tour_countryside),
//                10, getResources().getString(R
//                .string.address_tour_countryside), getResources().getString(R.string.subtext_tour_colosseum) ,
//                getResources().getString(R.string.price_range_tour_countryside), getResources().getString(R.string.unit_hours)));
//        tourItems.add(new TourItem(R.drawable.tour_museums, getResources().getString(R.string
//                .tour_museums), getResources().getString(R.string.phone_number_tour_museums),
//                2, getResources().getString(R
//                .string.address_tour_museums), getResources().getString(R.string.subtext_tour_museums) ,
//                getResources().getString(R.string.price_range_tour_museums), getResources().getString(R.string.unit_days)));
//        tourItems.add(new TourItem(R.drawable.tour_crypts, getResources().getString(R.string
//                .tour_crypts), getResources().getString(R.string.phone_number_tour_crypts),
//                4, getResources().getString(R
//                .string.address_tour_crypts), getResources().getString(R.string.subtext_tour_crypts) ,
//                getResources().getString(R.string.price_range_tour_crypts), getResources().getString(R.string.unit_hours)));

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
