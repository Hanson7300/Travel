package com.example.android.travelguide;

/**
 * Created by Hansson on 2017/8/5.
 */

public class Attraction  {
    private String mTitle;
    private String mIntroduction;
    private int mImageResourceId;

    public Attraction(String title, String introduction, int imageResourceId) {
        this.mTitle = title;
        this.mIntroduction = introduction;
        this.mImageResourceId = imageResourceId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getIntroduction() {
        return mIntroduction;
    }
}
