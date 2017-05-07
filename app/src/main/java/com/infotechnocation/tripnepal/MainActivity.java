package com.infotechnocation.tripnepal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.infotechnocation.tripnepal.adapters.HeritageRVAdapter;
import com.infotechnocation.tripnepal.entity.Heritage;
import com.infotechnocation.tripnepal.fragments.DestinationFragment;
import com.infotechnocation.tripnepal.fragments.HeritageFragment;
import com.infotechnocation.tripnepal.fragments.MapsFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("World Heritage List");
        //setActionBarTitle("World Heritage List");



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

      /**  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }); */

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        /**if (savedInstanceState == null) {
            navigationView.getMenu().performIdentifierAction(R.id.content_from, 0);
        }*/

        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.content_from, new HeritageFragment()).commit();




    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.maps_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        FragmentManager fm = getSupportFragmentManager();
       switch (item.getItemId()){
           case R.id.action_maps:
               fm.beginTransaction().replace(R.id.content_from, new MapsFragment()).commit();
               break;
           case R.id.actions_list:
               fm.beginTransaction().replace(R.id.content_from, new HeritageFragment()).commit();
               break;
           default:

       }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        FragmentManager fm = getSupportFragmentManager();

        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_heritage) {
            fm.beginTransaction().replace(R.id.content_from, new HeritageFragment()).commit();

        } else if (id == R.id.nav_poonhill) {
            int position = 0;
            Intent intent = new Intent(MainActivity.this, DestinationActivity.class);
            intent.putExtra("thisposition",position);
            startActivity(intent);

        } else if (id == R.id.nav_sarangkot) {
            int position = 1;
            Intent intent = new Intent(MainActivity.this, DestinationActivity.class);
            intent.putExtra("thisposition",position);
            startActivity(intent);

        } else if (id == R.id.nav_kopan) {
            int position = 2;
            Intent intent = new Intent(MainActivity.this, DestinationActivity.class);
            intent.putExtra("thisposition",position);
            startActivity(intent);

        } else if (id == R.id.nav_phewa){
            int position = 3;
            Intent intent = new Intent(MainActivity.this, DestinationActivity.class);
            intent.putExtra("thisposition",position);
            startActivity(intent);

        } else if (id == R.id.nav_worldStupa){
            int position = 4;
            Intent intent = new Intent(MainActivity.this, DestinationActivity.class);
            intent.putExtra("thisposition",position);
            startActivity(intent);

        } else if (id==R.id.nav_budhanikantha){
            int position = 5;
            Intent intent = new Intent(MainActivity.this, DestinationActivity.class);
            intent.putExtra("thisposition",position);
            startActivity(intent);

        } else if (id==R.id.nav_gorkhadurbar){
            int position = 6;
            Intent intent = new Intent(MainActivity.this, DestinationActivity.class);
            intent.putExtra("thisposition",position);
            startActivity(intent);

        }



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void setActionBarTitle(String title) {
        getSupportActionBar().setTitle(title);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //DestinationActivity mDestinationActivity= new DestinationActivity();

       /** if (mDestinationActivity.YES==0){
            FragmentManager fm = getSupportFragmentManager();
            fm.beginTransaction().replace(R.id.content_from, new DestinationFragment()).commit();
        }*/

    }
}
