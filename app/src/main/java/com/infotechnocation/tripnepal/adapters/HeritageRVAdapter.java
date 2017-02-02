package com.infotechnocation.tripnepal.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.infotechnocation.tripnepal.R;
import com.infotechnocation.tripnepal.entity.Heritage;

import java.util.ArrayList;

/**
 * Created by Prajin Bajracharya on 2/2/2017.
 */

public class HeritageRVAdapter extends RecyclerView.Adapter<HeritageViewHolder> {

    public Context context;
    public ArrayList<Heritage> heritageList;

    public HeritageRVAdapter(Context context, ArrayList<Heritage> heritageList) {
        this.context = context;
        this.heritageList = heritageList;
    }

    @Override
    public HeritageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.card_heritage, parent, false);
        HeritageViewHolder mHeritageViewHolder = new HeritageViewHolder(v);
        return mHeritageViewHolder;
    }

    @Override
    public void onBindViewHolder(HeritageViewHolder holder, int position) {
        Heritage heritage = heritageList.get(position);
        holder.titleCard.setText(heritage.getTilte());
        holder.descCard.setText(heritage.getDescription());

    }

    @Override
    public int getItemCount() {
        return heritageList.size();
    }
}
