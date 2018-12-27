package com.rashmi.rrp.colapsingtoolbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView mBanking, mAdd, mKeep, mLinks, mWifi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBanking = findViewById(R.id.banking);
        mAdd = findViewById(R.id.add);
        mKeep = findViewById(R.id.keep);
        mLinks = findViewById(R.id.links);
        mWifi = findViewById(R.id.wifi);

        mBanking.setOnClickListener(this);
        mAdd.setOnClickListener(this);
        mKeep.setOnClickListener(this);
        mLinks.setOnClickListener(this);
        mWifi.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent;

        switch (v.getId()){
            case R.id.banking: intent = new Intent(MainActivity.this, Bank.class);
                startActivity(intent);
                break;
            case R.id.add: intent = new Intent(MainActivity.this, Add.class);
                startActivity(intent);
                break;
            case R.id.keep: intent = new Intent(MainActivity.this, Keep.class);
                startActivity(intent);
                break;
            case R.id.links: intent = new Intent(MainActivity.this, Links.class);
                startActivity(intent);
                break;
            case R.id.wifi: intent = new Intent(MainActivity.this, WiFi.class);
                startActivity(intent);
                break;
            default: break;
        }

    }
}
