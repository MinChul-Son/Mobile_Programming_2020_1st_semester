package com.sch.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.ActionBar;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements ActionBar.TabListener{

    ActionBar.Tab tabSong, tabArtist, tabAlbum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar bar= getSupportActionBar();
        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        tabSong=bar.newTab();
        tabSong.setText("음악별");
        tabSong.setTabListener(this);
        bar.addTab(tabSong);

        tabArtist=bar.newTab();
        tabArtist.setText("가수별");
        tabArtist.setTabListener(this);
        bar.addTab(tabArtist);

        tabAlbum=bar.newTab();
        tabAlbum.setText("앨범별");
        tabAlbum.setTabListener(this);
        bar.addTab(tabAlbum);

    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, androidx.fragment.app.FragmentTransaction ft) {

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, androidx.fragment.app.FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, androidx.fragment.app.FragmentTransaction ft) {

    }
}
