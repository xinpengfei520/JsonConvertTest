package com.xpf.jsonconverttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

public class FromJsonTest extends AppCompatActivity {

    private Button btnJsonUtil;
    private Button btnGsonFromJson;
    private String json = "{\"name\":\"Jack\",\"gender\":\"Man\",\"age\":23,\"other\":\"tall\",\"hobby\":\"basketball\"}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_from_json_test);
        btnJsonUtil = (Button) findViewById(R.id.btnJsonUtil);
        btnGsonFromJson = (Button) findViewById(R.id.btnGsonFromJson);
        initListener();
    }

    private void initListener() {
        btnJsonUtil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                JSONObject jsonObject = JsonUtil.fromJson(json);
                try {
                    String name = jsonObject.getString("name");
                    int age = jsonObject.getInt("age");
                    String gender = jsonObject.getString("gender");
                    String hobby = jsonObject.getString("hobby");
                    String other = jsonObject.getString("other");
                    Log.e("TAG", "name:" + name + ",age:" + age + ",gender:" + gender + ",hobby:" + hobby + ",other:" + other);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        btnGsonFromJson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                InfoBean infoBean = new Gson().fromJson(json, InfoBean.class);
                String name = infoBean.getName();
                int age = infoBean.getAge();
                String gender = infoBean.getGender();
                String hobby = infoBean.getHobby();
                String other = infoBean.getOther();
                Log.e("TAG", "name:" + name + ",age:" + age + ",gender:" + gender + ",hobby:" + hobby + ",other:" + other);
            }
        });
    }

}
