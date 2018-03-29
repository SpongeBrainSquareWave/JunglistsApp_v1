    package com.example.android.junglistsapp;

    import android.app.Activity;
    import android.content.Context;
    import android.content.Intent;
    import android.support.annotation.NonNull;
    import android.support.annotation.Nullable;
    import android.view.LayoutInflater;
    import android.view.View;
    import android.view.ViewGroup;
    import android.widget.AdapterView;
    import android.widget.ArrayAdapter;
    import android.widget.ImageView;
    import android.widget.TextView;

    import com.example.android.junglistsapp.R;
    import com.example.android.junglistsapp.Track;

    import java.util.ArrayList;
    import java.util.List;

    /**
     * Created by Dyzio on 11/03/2018.
     */

    public class TrackAdapter extends ArrayAdapter<Track> {

        private Context mContext;
        private List<Track> trackList = new ArrayList<>();

        public TrackAdapter(@NonNull Context context, ArrayList<Track> list) {
            super(context, 0, list);
            mContext = context;
            trackList = list;
        }


        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View listItem = convertView;
            if (listItem == null)
                listItem = LayoutInflater.from(mContext).inflate(R.layout.track, parent, false);

            Track currentTrack = trackList.get(position);


            TextView trackName = (TextView) listItem.findViewById(R.id.track_textview);
            trackName.setText(currentTrack.getmTrackTitle());

            TextView artistName = (TextView) listItem.findViewById(R.id.artist_textview);
            artistName.setText(currentTrack.getmArtistName());


            ImageView trackImage = (ImageView) listItem.findViewById(R.id.track_image);
            trackImage.setImageResource(currentTrack.getmImageDrawable());

            ImageView playButton =(ImageView) listItem.findViewById(R.id.play_button_textview);
            playButton.setImageResource(currentTrack.getmPlayDrawable());
            playButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent nowPlaying = new Intent(getContext(), NowPlaying.class);
                    mContext.startActivity(nowPlaying);
                }
            });

            return listItem;
        }

    }



