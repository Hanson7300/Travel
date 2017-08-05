package com.example.android.travelguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Hukou extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        ArrayList<Attraction> hukou = new ArrayList<Attraction>();
        hukou.add(new Attraction(
                "壶口瀑布国家地质公园","黄河壶口瀑布国家地质公园是一个具有极高科普、旅游、观赏价值和文化底蕴的综合性地质公园",R.drawable.di_zhi_park));
        hukou.add(new Attraction("中市景区","可欣赏黄土高原地貌景观",R.drawable.zhong_shi_area));


        AttractionAdapter adapter = new AttractionAdapter(Hukou.this,hukou);
        ListView listview = (ListView)findViewById(R.id.list);
        listview.setAdapter(adapter);
    }
}
