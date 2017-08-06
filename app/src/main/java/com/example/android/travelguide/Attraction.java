package com.example.android.travelguide;

import java.io.Serializable;
/**
 * Created by Hansson on 2017/8/5.
 */

public class Attraction implements Serializable {
    public String mTitle;
    public String mIntroduction;
    public int mImageResourceId;

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
