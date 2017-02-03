package com.infotechnocation.tripnepal.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.infotechnocation.tripnepal.R;
import com.infotechnocation.tripnepal.adapters.DestinationRVAdapter;
import com.infotechnocation.tripnepal.entity.Destination;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Prajin Bajracharya on 2/3/2017.
 */

public class DestinationFragment extends Fragment {
    RecyclerView rvDestinationList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_destination, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvDestinationList = (RecyclerView)view.findViewById(R.id.rvDestinationList);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        rvDestinationList.setLayoutManager(manager);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        DestinationRVAdapter mDestinationRVAdapter = new DestinationRVAdapter(getContext(),getDestinationList());
        rvDestinationList.setAdapter(mDestinationRVAdapter);

        mDestinationRVAdapter.setRecyclerItemClickListener(new DestinationRVAdapter.OnRecyclerViewClickListener() {
            @Override
            public void onItemClick(Destination mDestination) {

                Fragment fragment = new DisplayFragment();
                FragmentManager fm = getFragmentManager();

                Bundle args = new Bundle();
                args.putSerializable("mDestination", mDestination);
                fragment.setArguments(args);
                fm.beginTransaction().replace(R.id.content_from, fragment).addToBackStack(null).commit();
                Toast.makeText(getContext(), mDestination.getTitleDest(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private ArrayList<Destination> getDestinationList(){
        ArrayList<Destination> destinationList = new ArrayList<>();

        destinationList.add(new Destination("Boudhanath", "This is the boudhanath stupa of kathmandu"));
        destinationList.add(new Destination("Boudhanath", "This is the boudhanath stupa of kathmandu"));
        destinationList.add(new Destination("Boudhanath", "This is the boudhanath stupa of kathmandu"));
        destinationList.add(new Destination("Boudhanath", "This is the boudhanath stupa of kathmandu"));
        destinationList.add(new Destination("Boudhanath", "This is the boudhanath stupa of kathmandu"));
        destinationList.add(new Destination("Boudhanath", "This is the boudhanath stupa of kathmandu"));
        destinationList.add(new Destination("Boudhanath", "This is the boudhanath stupa of kathmandu"));
        destinationList.add(new Destination("Boudhanath", "This is the boudhanath stupa of kathmandu"));
        destinationList.add(new Destination("Boudhanath", "This is the boudhanath stupa of kathmandu"));
        destinationList.add(new Destination("Boudhanath", "This is the boudhanath stupa of kathmandu"));

        return destinationList;
    }
}
