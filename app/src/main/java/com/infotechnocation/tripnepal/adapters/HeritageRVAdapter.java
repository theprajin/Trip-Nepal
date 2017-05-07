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

    private OnRecyclerViewListener mOnRecyclerViewListener;

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
    public void onBindViewHolder(HeritageViewHolder holder, final int position) {
        final Heritage heritage = heritageList.get(position);
        holder.titleCard.setText(heritage.getTilte());
        //holder.descCard.setText(heritage.getDescription());

        switch (heritage.getTilte()){
            case "Swayambhunath":
                holder.imageCard.setImageResource(R.drawable.swayambhu);
                break;

            case "Boudhanath":
                holder.imageCard.setImageResource(R.drawable.boudhanath);
                break;

            case "Patan Durbar Square":
                holder.imageCard.setImageResource(R.drawable.patandurbarsquare);
                break;

            case "Bhaktapur Durbar Square":
                holder.imageCard.setImageResource(R.drawable.bhaktapurdurbarsquare);
                break;

            case "Kathmandu Durbar Square":
                holder.imageCard.setImageResource(R.drawable.ktmdurbar);
                break;

            case "Pashupatinath":
                holder.imageCard.setImageResource(R.drawable.pashupatinath);
                break;

            case "Changu Narayan":
                holder.imageCard.setImageResource(R.drawable.changu_narayan);
                break;

            case "Lumbini":
                holder.imageCard.setImageResource(R.drawable.lumbini);
                break;

            case "Chitwan National Park":
                holder.imageCard.setImageResource(R.drawable.chitwannationalpark);
                break;

            case "Sagarmatha National Park":
                holder.imageCard.setImageResource(R.drawable.sagarmathanationalpark);
                break;
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mOnRecyclerViewListener.onItemClick(heritage,position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return heritageList.size();
    }

    public void setRecyclerViewListener(OnRecyclerViewListener mRecyclerViewListener){
        this.mOnRecyclerViewListener = mRecyclerViewListener;
    }

    public interface OnRecyclerViewListener{
        void onItemClick(Heritage mHeritage, int position);
    }
}
