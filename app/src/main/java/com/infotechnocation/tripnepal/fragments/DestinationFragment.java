package com.infotechnocation.tripnepal.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
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

import com.infotechnocation.tripnepal.DestinationActivity;
import com.infotechnocation.tripnepal.DisplayActivity;
import com.infotechnocation.tripnepal.MainActivity;
import com.infotechnocation.tripnepal.R;
import com.infotechnocation.tripnepal.adapters.DestinationRVAdapter;
import com.infotechnocation.tripnepal.entity.Destination;
import com.infotechnocation.tripnepal.entity.Heritage;
import com.infotechnocation.tripnepal.interfaces.PassObjects;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Prajin Bajracharya on 2/3/2017.
 */

public class DestinationFragment extends Fragment{

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
        DestinationRVAdapter destinationRVAdapter = new DestinationRVAdapter(getContext(),getDestinationList());
        rvDestinationList.setAdapter(destinationRVAdapter);

        destinationRVAdapter.setRecyclerItemClickListener(new DestinationRVAdapter.OnRecyclerViewClickListener() {
            @Override
            public void onItemClick(Destination mDestination, int position) {
                Intent intent = new Intent(getActivity(), DestinationActivity.class);
                intent.putExtra("thisposition",position);
                startActivity(intent);

                Toast.makeText(getContext(),position, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private ArrayList<Destination> getDestinationList() {
        ArrayList<Destination> destinationArrayLists = new ArrayList<>();
        destinationArrayLists.add(new Destination("Poon Hill", "Ghorepani Poon Hill Trekking, also popularly known as Annapurna Sunrise Trekking, or Annapurna Panorama Trekking, is one of the most popular and relatively easy treks that meander through the beautiful ethnic villages of Annapurna Region. Invigorating through some rhododendron forests, Poon Hill Trekking in Nepal will let you feel the Himalayan Panorama while providing you the opportunities to get close to the local Culture. However, Poon Hill Trek is obviously best known for the views from Poon Hill. Being popularly known as the Photographer's Paradise, you can capture some of the best snaps of impressive Annapurna and Dhaulagiri ranges. Poon Hill offers you the striking panorama of huge Himalayas including Annapurna South, Annapurna I, Annapurna II, III, and IV, Dhaulagiri, Lamjung Himal, Gangapurna, and Manaslu ranges among few others. The phenomenal sunrise from Poon Hill is just unmissable. A provocative glimpse of high mountains surrounding you can mesmerize anyone who's the part of this awesome trek.\n" +
                "In addition to that, Poon Hill Trekking will also let you witness terraced slopes, warm villages, beautiful paddy fields, and wonderful culture and lifestyle of ethnic people like Gurungs, and Magars. Ghorepani and Ghandruk are two of the largest Gurung settlements in the Annapurna Region. There's a unique please of trekking in Annapurna foothillsalong with the charming settlements of ethnic communities of Nepal.\n"));
        destinationArrayLists.add(new Destination("Sarangkot", "Boudhanath Stupa (or Bodnath Stupa) is the largest stupa in Nepal and the holiest Tibetan Buddhist temple outside Tibet. It is the center of Tibetan culture in Kathmandu and rich in Buddhist symbolism. "));
        destinationArrayLists.add(new Destination("Kopan Monastery", "Boudhanath Stupa (or Bodnath Stupa) is the largest stupa in Nepal and the holiest Tibetan Buddhist temple outside Tibet. It is the center of Tibetan culture in Kathmandu and rich in Buddhist symbolism. "));
        destinationArrayLists.add(new Destination("Phewa Lake", "Boudhanath Stupa (or Bodnath Stupa) is the largest stupa in Nepal and the holiest Tibetan Buddhist temple outside Tibet. It is the center of Tibetan culture in Kathmandu and rich in Buddhist symbolism. "));
        destinationArrayLists.add(new Destination("World Peace Stupa", "Boudhanath Stupa (or Bodnath Stupa) is the largest stupa in Nepal and the holiest Tibetan Buddhist temple outside Tibet. It is the center of Tibetan culture in Kathmandu and rich in Buddhist symbolism. "));
        destinationArrayLists.add(new Destination("Budhanilkantha", "Boudhanath Stupa (or Bodnath Stupa) is the largest stupa in Nepal and the holiest Tibetan Buddhist temple outside Tibet. It is the center of Tibetan culture in Kathmandu and rich in Buddhist symbolism. "));

        return destinationArrayLists;
    }

    @Override
    public void onResume() {
        super.onResume();

    }
}
