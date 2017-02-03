package com.infotechnocation.tripnepal.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_display, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        displayImage = (ImageView)view.findViewById(R.id.display_image);
        displayTitle = (TextView)view.findViewById(R.id.display_title);
        displayDesc = (TextView)view.findViewById(R.id.display_desc);




        displayTitle.setText(mDestination.getTitleDest());




    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Bundle bundle = this.getArguments();
        mDestination = (Destination) bundle.getSerializable("mDestination");





    }
}
