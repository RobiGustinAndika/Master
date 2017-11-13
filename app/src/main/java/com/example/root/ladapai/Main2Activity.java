package com.example.root.ladapai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.MediaPlayer;

public class Main2Activity extends AppCompatActivity {

    MediaPlayer audioBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        audioBackground = MediaPlayer.create(this, R.raw.oke);
        //Set looping ke true untuk mengulang audio jika telah selesai
        audioBackground.setLooping(false);
        //Set volume audio agar berbunyi
        audioBackground.setVolume(1,1);
        //Memulai audio
        audioBackground.start();
    }

    protected void onPause() {
        super.onPause();
        if (this.isFinishing()){
            audioBackground.stop();
        }
    }


}

