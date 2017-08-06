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

        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.attractions,parent,false);
            holder = new ViewHolder();
            holder.imageView = (ImageView) convertView.findViewById(R.id.imageView);
            holder.place_name = (TextView) convertView.findViewById(R.id.place_name_text_view);
            holder.introduction = (TextView) convertView.findViewById(R.id.introduction_text_view);
            convertView.setTag(holder);
        }
        else{
            holder = (ViewHolder)convertView.getTag();
        }
        Attraction currentAttration = getItem(position);
        holder.imageView.setImageResource(currentAttration.getImageResourceId());
        holder.place_name.setText(currentAttration.getTitle());
        holder.introduction.setText(currentAttration.getIntroduction());
        return convertView;
    }
    static class ViewHolder {
        TextView place_name;
        TextView introduction;
        ImageView imageView;
    }
}
