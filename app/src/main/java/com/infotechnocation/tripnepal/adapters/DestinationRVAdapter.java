package com.infotechnocation.tripnepal.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.infotechnocation.tripnepal.R;
import com.infotechnocation.tripnepal.entity.Destination;

import java.util.ArrayList;

/**
 * Created by Prajin Bajracharya on 2/3/2017.
 */

public class DestinationRVAdapter extends RecyclerView.Adapter<DestinationViewHolder> implements View.OnClickListener{
    public Context context;
    public ArrayList<Destination> destinationList;
    private OnRecyclerViewClickListener mOnRecyclerViewClickListener;
    public Destination destination;

    public DestinationRVAdapter(Context context, ArrayList<Destination> destinationList) {
        this.context = context;
        this.destinationList = destinationList;

    }

    @Override
    public DestinationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.card_destination, parent, false);
        DestinationViewHolder mDestinationViewHolder = new DestinationViewHolder(v);
        return mDestinationViewHolder;
    }

    @Override
    public void onBindViewHolder(DestinationViewHolder holder, int position) {
        destination = destinationList.get(position);
        holder.titleDest.setText(destination.getTitleDest());
        holder.descDest.setText(destination.getDescDest());

        holder.itemView.setOnClickListener(this);

    }

    @Override
    public int getItemCount() {
        return destinationList.size();
    }

    public void setRecyclerItemClickListener(OnRecyclerViewClickListener mRecyclerItemClickListener){
        this.mOnRecyclerViewClickListener = mRecyclerItemClickListener;
    }

    @Override
    public void onClick(View v) {
        mOnRecyclerViewClickListener.onItemClick(destination);
    }

    public interface OnRecyclerViewClickListener{
        void onItemClick(Destination mDestination);
    }
}
