package com.example.michalliberausr.myapplication3;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final MediaPlayer mediaPlayer = MediaPlayer.create(Main3Activity.this,R.raw.humantrack1);

        Button button = (Button)findViewById(R.id.wc_return);
        mediaPlayer.start();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.stop();
                finish();
            }
        });


    }
}
