package com.infotechnocation.tripnepal.adapters;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.infotechnocation.tripnepal.R;

/**
 * Created by Prajin Bajracharya on 2/3/2017.
 */

public class DestinationViewHolder extends RecyclerView.ViewHolder {

    ImageView imageDest;
    TextView titleDest;
    TextView descDest;


    public DestinationViewHolder(View itemView) {
        super(itemView);
        imageDest = (ImageView)itemView.findViewById(R.id.dest_image);
        titleDest = (TextView)itemView.findViewById(R.id.dest_title);
        descDest = (TextView)itemView.findViewById(R.id.dest_desc);


    }

}
