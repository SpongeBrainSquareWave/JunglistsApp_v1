package com.example.android.junglistsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Dyzio on 25/03/2018.
 */

public class NowPlaying extends AppCompatActivity {

    ImageView trackImageView;
    TextView trackArtistTextView;
    TextView trackTitleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);
        Intent incoming = getIntent();

        if (incoming == null)
            return;

        ImageView backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent backIntent = new Intent(NowPlaying.this, TracksActivity.class);
                    backIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                    startActivity(backIntent);
                }
        });

        ImageView menuButton = findViewById(R.id.menu_button);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent menuIntent = new Intent(NowPlaying.this, MainActivity.class);
                menuIntent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                startActivity(menuIntent);
            }
        });
        trackImageView = findViewById(R.id.track_image_view);
        trackArtistTextView = findViewById(R.id.artist_name_text_view);
        trackTitleTextView= findViewById(R.id.track_title_text_view);


        trackArtistTextView.setText(incoming.getStringExtra("ARTIST_NAME"));
        trackTitleTextView.setText(incoming.getStringExtra("TRACK_TITLE"));
        trackImageView.setImageResource(incoming.getIntExtra("TRACK_IMAGE", 0));


    }
}
