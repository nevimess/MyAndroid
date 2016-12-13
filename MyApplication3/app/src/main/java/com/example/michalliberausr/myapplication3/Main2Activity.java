package com.example.michalliberausr.myapplication3;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final MediaPlayer player = MediaPlayer.create(Main2Activity.this,R.raw.terran);

        Button scButton1 = (Button)findViewById(R.id.sc_return);

        player.start();

        scButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player.stop();
                finish();
            }
        });
    }
}
