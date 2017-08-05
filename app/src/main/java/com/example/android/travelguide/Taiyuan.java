package com.example.android.travelguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Taiyuan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        ArrayList<Attraction> taiyuan = new ArrayList<Attraction>();
        taiyuan.add(new Attraction(
                "晋祠景区","中国现存最早的皇家园林，难老泉、侍女像、圣母像被誉为“晋祠三绝”",R.drawable.jin_ci));
        taiyuan.add(new Attraction("山西博物院","山西省最大的文物展示中心，藏有众多精品文物，荟萃了全省文物精华",R.drawable.bo_wu_guan));
        taiyuan.add(new Attraction("蒙山大佛","太原八景蒙山晓月所在地，为太原市文物保护单位”",R.drawable.meng_shan_da_fo));
        taiyuan.add(new Attraction("永祚寺","被誉为“晋阳奇观”，是太原的标志",R.drawable.yong_zuo_si));
        taiyuan.add(new Attraction("汾河公园","市民最喜欢的晨练地，黄昏和夜景尤其漂亮，古时太原“汾河晚渡”即在此处",R.drawable.fen_he_park));

        AttractionAdapter adapter = new AttractionAdapter(Taiyuan.this,taiyuan);
        ListView listview = (ListView)findViewById(R.id.list);
        listview.setAdapter(adapter);
    }
}
