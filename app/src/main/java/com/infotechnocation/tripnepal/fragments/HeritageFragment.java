package com.infotechnocation.tripnepal.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.infotechnocation.tripnepal.DisplayActivity;
import com.infotechnocation.tripnepal.R;
import com.infotechnocation.tripnepal.adapters.HeritageRVAdapter;
import com.infotechnocation.tripnepal.entity.Heritage;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Prajin Bajracharya on 2/2/2017.
 */

public class HeritageFragment extends Fragment {

    RecyclerView rvHeritageList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_heritage, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvHeritageList = (RecyclerView)view.findViewById(R.id.rvHeritageList);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        rvHeritageList.setLayoutManager(manager);
    }

@Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        HeritageRVAdapter heritageRVAdapter = new HeritageRVAdapter(getContext(),getHeritageList());
        rvHeritageList.setAdapter(heritageRVAdapter);

        heritageRVAdapter.setRecyclerViewListener(new HeritageRVAdapter.OnRecyclerViewListener() {
            @Override
            public void onItemClick(Heritage mHeritage, int position) {
                Intent intent = new Intent(getActivity(), DisplayActivity.class);
                intent.putExtra("position",position);
                //intent.putExtra("heritage", (Serializable) mHeritage);
                startActivity(intent);

                //Toast.makeText(getContext(), mHeritage.getTilte() + " " + position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private ArrayList<Heritage> getHeritageList() {
        ArrayList<Heritage> heritageArrayLists = new ArrayList<>();
        heritageArrayLists.add(new Heritage("Boudhanath", "Boudhanath Stupa (or Bodnath Stupa) is the largest stupa in Nepal and the holiest Tibetan Buddhist temple outside Tibet. It is the center of Tibetan culture in Kathmandu and rich in Buddhist symbolism. "));
        heritageArrayLists.add(new Heritage("Patan Durbar Square", "Patan Durbar Square is situated at the centre of the city of Lalitpur in Nepal.One of its attraction is the ancient royal palace where the Malla Kings of Lalitpur resided.The Durbar Square is a marvel of Newa architecture."));
        heritageArrayLists.add(new Heritage("Swayambhunath", "This world heritage site is also called Monkey Temple"));
        heritageArrayLists.add(new Heritage("Bhaktapur Durbar Square", "Bhaktapur  literally translates to Place of devotees. Also known as Bhadgaon or Khwopa ), it is an ancient Newar city in the east corner of the Kathmandu Valley, Nepal, about 8 miles (13 km) from the capital city, Kathmandu. It is located in Bhaktapur District in the Bagmati Zone. "));
        heritageArrayLists.add(new Heritage("Kathmandu Durbar Square", "This world heritage site is also called Monkey Temple"));
        heritageArrayLists.add(new Heritage("Pashupatinath", "Hindu temple of god Shiva one of the important god of Hindus dedicated to Pashupatinath is located on the banks of the Bagmati River."));
        heritageArrayLists.add(new Heritage("Changu Narayan", "This world heritage site is also called Monkey Temple"));
        heritageArrayLists.add(new Heritage("Lumbini", "This world heritage site is also called Monkey Temple"));
        heritageArrayLists.add(new Heritage("Chitwan National Park", "This world heritage site is also called Monkey Temple"));
        heritageArrayLists.add(new Heritage("Sagarmatha National Park", "This world heritage site is also called Monkey Temple"));

        return heritageArrayLists;
    }
}
