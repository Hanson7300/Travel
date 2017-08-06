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
                Arrays.asList(getString(R.string.place_pingyao),getString(R.string.place_wutai),
                        getString(R.string.place_taiyuan),getString(R.string.place_datong),
                        getString(R.string.place_hukou))
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
                        ArrayList<Attraction> pingyao = new ArrayList<Attraction>();
                        pingyao.add(new Attraction(
                                getString(R.string.pingyao_1_1),getString(R.string.pingyao_1_2),R.drawable.ping_yao_gu_cheng));
                        pingyao.add(new Attraction(getString(R.string.pingyao_2_1),getString(R.string.pingyao_2_2),R.drawable.qiao_jia_da_yuan));
                        pingyao.add(new Attraction(getString(R.string.pingyao_3_1),getString(R.string.pingyao_3_2),R.drawable.gu_cheng_qiang));
                        pingyao.add(new Attraction(getString(R.string.pingyao_4_1),getString(R.string.pingyao_4_2),R.drawable.gu_xian_ya));
                        pingyao.add(new Attraction(getString(R.string.pingyao_5_1),getString(R.string.pingyao_5_2),R.drawable.yi_tiao_jie));
                        Bundle pingyao_bundle= new Bundle();
                        pingyao_bundle.putSerializable(getString(R.string.place),pingyao);
                        Intent pingyaoIntent = new Intent(MainActivity.this,Place_attractions.class);
                        pingyaoIntent.putExtras(pingyao_bundle);
                        pingyaoIntent.putExtra(getString(R.string.actionbar),getResources().getString(R.string.pingyao));
                        startActivity(pingyaoIntent);
                        break;
                    case 1:
                        ArrayList<Attraction> wutai = new ArrayList<Attraction>();
                        wutai.add(new Attraction(
                                getString(R.string.wutai_1_1),getString(R.string.wutai_1_2),R.drawable.wu_ye_miao));
                        wutai.add(new Attraction(getString(R.string.wutai_2_1),getString(R.string.wutai_2_2),R.drawable.dai_luo_ding));
                        wutai.add(new Attraction(getString(R.string.wutai_3_1),getString(R.string.wutai_3_2),R.drawable.pu_sa_ding));
                        wutai.add(new Attraction(getString(R.string.wutai_4_1),getString(R.string.wutai_4_2),R.drawable.xian_tong_si));
                        wutai.add(new Attraction(getString(R.string.wutai_5_1),getString(R.string.wutai_5_2),R.drawable.ta_yuan_si));
                        Bundle wutai_bundle= new Bundle();
                        wutai_bundle.putSerializable(getString(R.string.place),wutai);
                        Intent wutaiIntent = new Intent(MainActivity.this,Place_attractions.class);
                        wutaiIntent.putExtras(wutai_bundle);
                        wutaiIntent.putExtra(getString(R.string.actionbar),getResources().getString(R.string.wutai_mountain));
                        startActivity(wutaiIntent);
                        break;
                    case 2:
                        ArrayList<Attraction> taiyuan = new ArrayList<Attraction>();
                        taiyuan.add(new Attraction(
                                getString(R.string.taiyuan_1_1),getString(R.string.taiyuan_1_2),R.drawable.jin_ci));
                        taiyuan.add(new Attraction(getString(R.string.taiyuan_2_1),getString(R.string.taiyuan_2_2),R.drawable.bo_wu_guan));
                        taiyuan.add(new Attraction(getString(R.string.taiyuan_3_1),getString(R.string.taiyuan_3_2),R.drawable.meng_shan_da_fo));
                        taiyuan.add(new Attraction(getString(R.string.taiyuan_4_1),getString(R.string.taiyuan_4_2),R.drawable.yong_zuo_si));
                        taiyuan.add(new Attraction(getString(R.string.taiyuan_5_1),getString(R.string.taiyuan_5_2),R.drawable.fen_he_park));
                        Bundle taiyuan_bundle= new Bundle();
                        taiyuan_bundle.putSerializable(getString(R.string.place),taiyuan);
                        Intent taiyuanIntent = new Intent(MainActivity.this,Place_attractions.class);
                        taiyuanIntent.putExtras(taiyuan_bundle);
                        taiyuanIntent.putExtra(getString(R.string.actionbar),getResources().getString(R.string.taiyuan));
                        startActivity(taiyuanIntent);
                        break;
                    case 3:
                        ArrayList<Attraction> datong = new ArrayList<Attraction>();
                        datong.add(new Attraction(
                                getString(R.string.datong_1_1),getString(R.string.datong_1_2),R.drawable.yun_gang_shi_ku));
                        datong.add(new Attraction(getString(R.string.datong_2_1),getString(R.string.datong_2_2),R.drawable.heng_shan));
                        datong.add(new Attraction(getString(R.string.datong_3_1),getString(R.string.datong_3_2),R.drawable.xuan_kong_si));
                        datong.add(new Attraction(getString(R.string.datong_4_1),getString(R.string.datong_4_2),R.drawable.hua_yan_si));
                        datong.add(new Attraction(getString(R.string.datong_5_1),getString(R.string.datong_5_2),R.drawable.tu_lin));
                        Bundle datong_bundle= new Bundle();
                        datong_bundle.putSerializable(getString(R.string.place),datong);
                        Intent datongIntent = new Intent(MainActivity.this,Place_attractions.class);
                        datongIntent.putExtras(datong_bundle);
                        datongIntent.putExtra(getString(R.string.actionbar),getResources().getString(R.string.datong));
                        startActivity(datongIntent);
                        break;
                    case 4:
                        ArrayList<Attraction> hukou = new ArrayList<Attraction>();
                        hukou.add(new Attraction(
                                getString(R.string.hukou_1_1),getString(R.string.hukou_1_2),R.drawable.di_zhi_park));
                        hukou.add(new Attraction(getString(R.string.hukou_2_1),getString(R.string.hukou_2_2),R.drawable.zhong_shi_area));
                        Bundle hukou_bundle= new Bundle();
                        hukou_bundle.putSerializable(getString(R.string.place),hukou);
                        Intent hukouIntent = new Intent(MainActivity.this,Place_attractions.class);
                        hukouIntent.putExtras(hukou_bundle);
                        hukouIntent.putExtra(getString(R.string.actionbar),getResources().getString(R.string.hukou));
                        startActivity(hukouIntent);
                        break;
                }
            }
        });

    }
}
