package com.example.android.travelguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Pingyao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        ArrayList<Attraction> pingyao = new ArrayList<Attraction>();
        pingyao.add(new Attraction(
                "平遥古城","晚清时期中国的金融中心，也是我国保存最为完好的古城之一",R.drawable.ping_yao_gu_cheng));
        pingyao.add(new Attraction("乔家大院","《大红灯笼高高挂》的拍摄地",R.drawable.qiao_jia_da_yuan));
        pingyao.add(new Attraction("平遥古城墙","距今已有六百多年的历史，保留了古香古色的韵味，登高可以俯揽全城景色”",R.drawable.gu_cheng_qiang));
        pingyao.add(new Attraction("古县衙","始建于北魏，是中国目前尚存的古代衙署中保存得最好的一座",R.drawable.gu_xian_ya));
        pingyao.add(new Attraction("明清一条街","位于平遥古城的中轴线上，街道两旁有很多神奇独特的小店",R.drawable.yi_tiao_jie));

        AttractionAdapter adapter = new AttractionAdapter(Pingyao.this,pingyao);
        ListView listview = (ListView)findViewById(R.id.list);
        listview.setAdapter(adapter);
    }
}
