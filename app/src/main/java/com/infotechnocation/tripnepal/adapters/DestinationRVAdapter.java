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

public class DestinationRVAdapter extends RecyclerView.Adapter<DestinationViewHolder>{
    public Context context;
    public ArrayList<Destination> destinationList;
    private OnRecyclerViewClickListener mOnRecyclerViewClickListener;
    public Destination destination;
    int position;

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
    public void onBindViewHolder(DestinationViewHolder holder, final int position) {
        destination = destinationList.get(position);
        this.position = position;
        holder.titleDest.setText(destination.getTitleDest());
        //holder.descDest.setText(destination.getDescDest());

        switch (destination.getTitleDest()){
            case "Poon Hill":
                holder.imageDest.setImageResource(R.drawable.poon_hill);
                break;

            case "Sarangkot":
                holder.imageDest.setImageResource(R.drawable.sarangkot);
                break;

            case "Kopan Monastery":
                holder.imageDest.setImageResource(R.drawable.kopan_monastery);
                break;

            case "Phewa Lake":
                holder.imageDest.setImageResource(R.drawable.phewa_lake);
                break;

            case "World Peace Stupa":
                holder.imageDest.setImageResource(R.drawable.world_peace_stupa);
                break;

            case "Budhanilkantha":
                holder.imageDest.setImageResource(R.drawable.pashupatinath);
                break;

            default:
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnRecyclerViewClickListener.onItemClick(destination,position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return destinationList.size();
    }

    public void setRecyclerItemClickListener(OnRecyclerViewClickListener mRecyclerItemClickListener){
        this.mOnRecyclerViewClickListener = mRecyclerItemClickListener;
    }


    public interface OnRecyclerViewClickListener{
        void onItemClick(Destination mDestination, int position);
    }
}
