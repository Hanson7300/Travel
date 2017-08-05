package com.example.android.travelguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hansson on 2017/8/5.
 */

public class AttractionAdapter extends ArrayAdapter<Attraction> {

    public AttractionAdapter(Context context, ArrayList<Attraction> collections) {
        super(context, 0, collections);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView==null) {
        listItemView= LayoutInflater.from(getContext()).inflate(R.layout.attractions,parent,false);
        }

        Attraction currentAttration = getItem(position);

        TextView place_name = (TextView)listItemView.findViewById(R.id.place_name_text_view);
        place_name.setText(currentAttration.getTitle());

        TextView introduction =(TextView)listItemView.findViewById(R.id.introduction_text_view);
        introduction.setText(currentAttration.getIntroduction());

        ImageView image = (ImageView)listItemView.findViewById(R.id.imageView);
        image.setImageResource(currentAttration.getImageResourceId());

        return listItemView;
    }
}
