package com.example.android.travelguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Place_attractions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();

        String  actionBar= getIntent().getStringExtra("ActionBar");
        getSupportActionBar().setTitle(actionBar);

        ArrayList<Attraction> put_in_array_list=
                (ArrayList<Attraction>)bundle.getSerializable("place");

        AttractionAdapter adapter = new AttractionAdapter(Place_attractions.this,put_in_array_list);
        ListView listview = (ListView)findViewById(R.id.list);
        listview.setAdapter(adapter);


    }
}