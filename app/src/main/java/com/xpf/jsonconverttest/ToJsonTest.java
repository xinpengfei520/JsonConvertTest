package com.xpf.jsonconverttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.HashMap;

public class ToJsonTest extends AppCompatActivity {

    private Button btnJsonUtil;
    private Button btnGsonToJson;
    private TextView tvJson;
    private HashMap<String, Object> map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_json_test);
        btnJsonUtil = (Button) findViewById(R.id.btnJsonUtil);
        btnGsonToJson = (Button) findViewById(R.id.btnGsonToJson);
        tvJson = (TextView) findViewById(R.id.tvJson);
        initData();
        initListener();
    }

    private void initListener() {
        btnJsonUtil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String json = JsonUtil.toJson(map);
                Log.e("TAG", "json1===" + json);
                tvJson.setText(json);
            }
        });
        btnGsonToJson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String json = new Gson().toJson(map);
                Log.e("TAG", "json2===" + json);
                tvJson.setText(json);
            }
        });
    }

    private void initData() {
        map = new HashMap<>();
        map.put("name", "Jack");
        map.put("age", 23);
        map.put("hobby", "basketball");
        map.put("gender", "Man");
        map.put("other", "tall");
    }
}
