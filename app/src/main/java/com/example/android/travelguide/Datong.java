package com.example.android.travelguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Datong extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);

        ArrayList<Attraction> datong = new ArrayList<Attraction>();
        datong.add(new Attraction(
                "云冈石窟","中国四大石窟艺术宝库之一，雕刻融合了中西艺术风格",R.drawable.yun_gang_shi_ku));
        datong.add(new Attraction("衡山","道教圣地，自古为兵家据险以守之地",R.drawable.heng_shan));
        datong.add(new Attraction("悬空寺","2010年的《时代》周刊，将悬空寺纳入“全球十大奇险建筑”",R.drawable.xuan_kong_si));
        datong.add(new Attraction("华严寺","我国现存年代较早、保存较完整的一座辽金寺庙建筑群",R.drawable.hua_yan_si));
        datong.add(new Attraction("大同土林","目前华北地区唯一已知的土林景点",R.drawable.tu_lin));

        AttractionAdapter adapter = new AttractionAdapter(Datong.this,datong);
        ListView listview = (ListView)findViewById(R.id.list);
        listview.setAdapter(adapter);

    }
}
