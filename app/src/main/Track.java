package com.example.android.junglistsapp;



/**
 * Created by Dyzio on 16/03/2018.
 */

public class Track {

    private String mArtistName;

    private String mTrackTitle;

    private int mImageDrawable;

    private int mPlayDrawable;

    public Track(String mTrackTitle, String mArtistName, int mImageDrawable, int mPlayDrawable) {
        this.mArtistName = mArtistName;
        this.mTrackTitle = mTrackTitle;
        this.mImageDrawable = mImageDrawable;
        this.mPlayDrawable = mPlayDrawable;
    }

    public String getmTrackTitle() {
        return mTrackTitle;
    }

    public void setmTrackTitle(String mTrackTitle) {
        this.mTrackTitle = mTrackTitle;
    }

    public String getmArtistName() {
        return mArtistName;
    }

    public void setmArtistName(String mArtistName) {
        this.mArtistName = mArtistName;
    }

    public int getmImageDrawable() {
        return mImageDrawable;
    }

    public void setmImageDrawable(int mImageDrawable) {
        this.mImageDrawable = mImageDrawable;
    }

    public int getmPlayDrawable() {
        return mPlayDrawable;
    }
    public void setmPlayDrawable(int mPlayDrawable) {
        this.mPlayDrawable = mPlayDrawable;
    }

}
