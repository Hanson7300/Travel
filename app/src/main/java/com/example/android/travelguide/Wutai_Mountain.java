package com.example.android.travelguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Wutai_Mountain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view);
        ArrayList<Attraction> wutai = new ArrayList<Attraction>();
        wutai.add(new Attraction(
                "五爷庙","五台山香火最旺的寺庙之一，终年香客络绎不绝格",R.drawable.wu_ye_miao));
        wutai.add(new Attraction("黛螺顶","始建于明代成化年间，供奉了五座文殊菩萨的法像，又名“小朝台",R.drawable.dai_luo_ding));
        wutai.add(new Attraction("菩萨顶","五台山中规模最大的黄教寺院，是五台山十座黄庙之首”",R.drawable.pu_sa_ding));
        wutai.add(new Attraction("显通寺","与洛阳白马寺同为中国最早的寺庙，是全山寺院之首",R.drawable.xian_tong_si));
        wutai.add(new Attraction("塔院寺","五台山的标志性建筑大白塔的所在地",R.drawable.ta_yuan_si));

        AttractionAdapter adapter = new AttractionAdapter(Wutai_Mountain.this,wutai);
        ListView listview = (ListView)findViewById(R.id.list);
        listview.setAdapter(adapter);
    }
}
