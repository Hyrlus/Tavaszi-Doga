package com.example.wifihazifeladat;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class Main2Activity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private WifiManager wifiManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        Locale locale = new Locale("hun");
        Locale.setDefault(locale);
        Configuration config = new Configuration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config,
                getBaseContext().getResources().getDisplayMetrics());
        setContentView(R.layout.activity_main2);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId())
                {
                    case R.id.Wifi_On:
                        wifiManager.setWifiEnabled(true);
                        Toast.makeText(Main2Activity.this, "Wifi On", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.Wifi_Off:
                        wifiManager.setWifiEnabled(false);
                        Toast.makeText(Main2Activity.this, "Wifi Off", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.Back_Arrow:
                        Intent v_activity = new Intent(Main2Activity.this,MainActivity.class);
                        startActivity(v_activity);
                        finish();
                        break;
                }


                return false;
            }
        });

    }
    public void init(){

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigation);
        wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        Locale current = getResources().getConfiguration().locale;
        ((Locale) current).toString();
    }
}
