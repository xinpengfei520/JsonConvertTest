package com.xpf.jsonconverttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnToJson;
    private Button btnFromJson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnToJson = (Button) findViewById(R.id.btnToJson);
        btnFromJson = (Button) findViewById(R.id.btnFromJson);

        btnToJson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ToJsonTest.class));
            }
        });
        btnFromJson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FromJsonTest.class));
            }
        });
    }
}
