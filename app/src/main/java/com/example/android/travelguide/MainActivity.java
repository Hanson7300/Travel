package com.example.android.travelguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        final ArrayList<String> placeNames = new ArrayList<String>(
                Arrays.asList("平遥","五台山","太原","大同","壶口")
        );

        ArrayAdapter placeAdapter =
                new ArrayAdapter<String>(this,R.layout.places_for_mian,placeNames);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(placeAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent pingyaoIntent = new Intent(MainActivity.this,Pingyao.class);
                        startActivity(pingyaoIntent);
                        break;
                    case 1:
                        Intent wutaiIntent = new Intent(MainActivity.this,Wutai_Mountain.class);
                        startActivity(wutaiIntent);
                        break;
                    case 2:
                        Intent taiyuanIntent = new Intent(MainActivity.this,Taiyuan.class);
                        startActivity(taiyuanIntent);
                        break;
                    case 3:
                        Intent datongIntent = new Intent(MainActivity.this,Datong.class);
                        startActivity(datongIntent);
                        break;
                    case 4:
                        Intent hukouIntent = new Intent(MainActivity.this,Hukou.class);
                        startActivity(hukouIntent);
                        break;
                }
            }
        });

    }
}
