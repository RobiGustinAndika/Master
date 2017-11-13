package com.example.root.ladapai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class Map extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }

    public void sumatera(View view) {
        Intent intent = new Intent(Map.this,MainActivity.class);
        startActivity(intent);
    }
}
