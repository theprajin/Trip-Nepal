package com.infotechnocation.tripnepal.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.infotechnocation.tripnepal.R;

/**
 * Created by Prajin Bajracharya on 2/2/2017.
 */

public class MapsFragment extends Fragment implements OnMapReadyCallback {

    GoogleMap googleMap;
    MapView mMapView;
    View mView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_maps, container, false);
        return mView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mMapView = (MapView) mView.findViewById(R.id.map);
        if (mMapView != null) {
            mMapView.onCreate(null);
            mMapView.onResume();;
            mMapView.getMapAsync(this);
        }


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        MapsInitializer.initialize(getContext());
        googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);

        googleMap.addMarker(new MarkerOptions().position(new LatLng(27.7109, 85.3254)).title("Marker in Kathmandu"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(27.7105, 85.3487)).title("Marker in Pashupati Nath Temple"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(27.6727, 85.3253)).title("Marker in Patan Durbar Square"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(27.6721, 85.4282)).title("Marker in Bhaktapur Durbar Square"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(27.7043, 85.3074)).title("Marker in Kathmandu Durbar Square"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(27.7150, 85.2905)).title("Marker in Swayambhu Nath"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(27.7214, 85.3619)).title("Marker in Boudha Nath"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(27.7033, 85.4324)).title("Marker in Changu Narayan Temple"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(27.6792, 83.5070)).title("Marker in Lumbini"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(27.5341, 84.4525)).title("Marker in Chitwan National Park"));
        googleMap.addMarker(new MarkerOptions().position(new LatLng(27.9783, 86.6611)).title("Marker in Sagarmatha National Park"));


        CameraPosition Kathmandu = CameraPosition.builder().target(new LatLng(27.7109, 85.3254)).zoom(10).bearing(0).tilt(45).build();

        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(Kathmandu));
    }
}
