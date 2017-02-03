package com.infotechnocation.tripnepal.fragments;

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

import com.infotechnocation.tripnepal.R;
import com.infotechnocation.tripnepal.adapters.HeritageRVAdapter;
import com.infotechnocation.tripnepal.entity.Heritage;

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
    }

    private ArrayList<Heritage> getHeritageList() {
        ArrayList<Heritage> heritageArrayLists = new ArrayList<>();
        heritageArrayLists.add(new Heritage("Swyambhu", "This world heritage site is also called Monkey Temple"));
        heritageArrayLists.add(new Heritage("Swyambhu", "This world heritage site is also called Monkey Temple"));
        heritageArrayLists.add(new Heritage("Swyambhu", "This world heritage site is also called Monkey Temple"));
        heritageArrayLists.add(new Heritage("Swyambhu", "This world heritage site is also called Monkey Temple"));
        heritageArrayLists.add(new Heritage("Swyambhu", "This world heritage site is also called Monkey Temple"));
        heritageArrayLists.add(new Heritage("Swyambhu", "This world heritage site is also called Monkey Temple"));
        heritageArrayLists.add(new Heritage("Swyambhu", "This world heritage site is also called Monkey Temple"));
        heritageArrayLists.add(new Heritage("Swyambhu", "This world heritage site is also called Monkey Temple"));
        heritageArrayLists.add(new Heritage("Swyambhu", "This world heritage site is also called Monkey Temple"));
        heritageArrayLists.add(new Heritage("Swyambhu", "This world heritage site is also called Monkey Temple"));

        return heritageArrayLists;
    }
}
