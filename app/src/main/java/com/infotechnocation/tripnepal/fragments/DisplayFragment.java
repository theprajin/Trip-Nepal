package com.infotechnocation.tripnepal.fragments;

import android.app.ActionBar;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.infotechnocation.tripnepal.MainActivity;
import com.infotechnocation.tripnepal.R;
import com.infotechnocation.tripnepal.entity.Destination;

/**
 * Created by Prajin Bajracharya on 2/3/2017.
 */

public class DisplayFragment extends Fragment {

    ImageView displayImage;
    TextView displayTitle;
    TextView displayDesc;

    private Destination mDestination;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //mDestination = new Destination("Nepal", "this is nepal");

        ((MainActivity) getActivity()).setActionBarTitle("Your title");


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_display, container, false);

        ActionBar actionBar = getActivity().getActionBar();
        actionBar.setTitle("Your title");

        displayImage = (ImageView) v.findViewById(R.id.display_image);
        displayTitle = (TextView) v.findViewById(R.id.display_title);
        displayDesc = (TextView) v.findViewById(R.id.display_desc);

        return v;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        displayTitle.setText(mDestination.getTitleDest());

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        /**Bundle bundle = this.getArguments();
        mDestination = (Destination) bundle.getSerializable("mDestination");*/

        Bundle bundle = new Bundle();

        mDestination = (Destination) bundle.getParcelable("MDestination");



        Log.e("destination", "the object destination has been assigned");

    }

    @Override
    public void onResume() {
        super.onResume();

        AppCompatActivity activity = (AppCompatActivity) getActivity();
        ActionBar actionBar = activity.getActionBar();
        actionBar.setTitle("Destination");
    }
}