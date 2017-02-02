package com.infotechnocation.tripnepal.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.infotechnocation.tripnepal.R;

/**
 * Created by Prajin Bajracharya on 2/2/2017.
 */

public class HeritageViewHolder extends RecyclerView.ViewHolder {

    ImageView imageCard;
    TextView titleCard;
    TextView descCard;

    public HeritageViewHolder(View itemView) {
        super(itemView);
        imageCard = (ImageView) itemView.findViewById(R.id.imagecard);
        titleCard = (TextView) itemView.findViewById(R.id.titlecard);
        descCard = (TextView) itemView.findViewById(R.id.desccard);
    }
}
