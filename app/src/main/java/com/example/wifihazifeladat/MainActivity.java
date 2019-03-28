package com.example.wifihazifeladat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button KoviMain_btn,Hmain_btn,Nmain_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        KoviMain_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent kovi_activity = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(kovi_activity);
                finish();
            }
        });

        Hmain_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent harmadik_activity = new Intent(MainActivity.this,Main3Activity.class);
                startActivity(harmadik_activity);
                finish();
            }
        });
        Nmain_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent negyedik_activity = new Intent(MainActivity.this,Main4Activity.class);
                startActivity(negyedik_activity);
                finish();
            }
        });

        init();


    }
    public void init(){

        KoviMain_btn = (Button) findViewById(R.id.KoviMain_btn);
        Hmain_btn = (Button) findViewById(R.id.Hmain_btn);
        Nmain_btn =(Button) findViewById(R.id.Nmain_btn);



    }
}
