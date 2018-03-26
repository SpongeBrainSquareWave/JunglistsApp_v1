package com.example.android.junglistsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Dyzio on 14/03/2018.
 */
public class TracksActivity extends AppCompatActivity {

    private ListView listView;

    private TrackAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tracklist);


        listView = (ListView) findViewById(R.id.list);

        ArrayList<Track> tracks = new ArrayList<Track>();
        tracks.add(new Track("The Callin", "True Tactix", R.drawable.true_tactix_the_calling, R.mipmap.play_button_image));
        tracks.add(new Track("Steve", "bob", R.drawable.true_tactix_the_calling, R.mipmap.play_button_image));
        tracks.add(new Track("sadasd", "True Tactix", R.drawable.true_tactix_the_calling, R.mipmap.play_button_image));
        tracks.add(new Track("The Callin", "asdasd", R.drawable.true_tactix_the_calling, R.mipmap.play_button_image));
        tracks.add(new Track("The Callin", "True Tactix", R.drawable.true_tactix_the_calling, R.mipmap.play_button_image));
        tracks.add(new Track("The Callin", "True Tactix", R.drawable.true_tactix_the_calling, R.mipmap.play_button_image));
        tracks.add(new Track("The Callin", "True Tactix", R.drawable.true_tactix_the_calling, R.mipmap.play_button_image));
        tracks.add(new Track("The Callin", "True Tactix", R.drawable.true_tactix_the_calling, R.mipmap.play_button_image));
        tracks.add(new Track("The Callin", "True Tactix", R.drawable.true_tactix_the_calling, R.mipmap.play_button_image));
        tracks.add(new Track("The Callin", "True Tactix", R.drawable.true_tactix_the_calling, R.mipmap.play_button_image));
        tracks.add(new Track("The Callin", "True Tactix", R.drawable.true_tactix_the_calling, R.mipmap.play_button_image));
        tracks.add(new Track("The Callin", "True Tactix", R.drawable.true_tactix_the_calling, R.mipmap.play_button_image));
        tracks.add(new Track("The Callin", "True Tactix", R.drawable.true_tactix_the_calling, R.mipmap.play_button_image));
        tracks.add(new Track("The Callin", "True Tactix", R.drawable.true_tactix_the_calling, R.mipmap.play_button_image));
        tracks.add(new Track("The Callin", "True Tactix", R.drawable.true_tactix_the_calling, R.mipmap.play_button_image));
        tracks.add(new Track("The Callin", "True Tactix", R.drawable.true_tactix_the_calling, R.mipmap.play_button_image));


        mAdapter = new TrackAdapter(this, tracks);


        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(TracksActivity.this, "This is my Toast message!",
                        Toast.LENGTH_LONG).show();

            }
        });
    }

}