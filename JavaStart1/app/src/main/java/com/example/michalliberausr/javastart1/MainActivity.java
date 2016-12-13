package com.example.michalliberausr.javastart1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;

public class MainActivity extends AppCompatActivity {

    RatingBar ocena1;
    RatingBar ocena2;
    RatingBar ocena3;
    Button przycisk;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();

        ocena1 = (RatingBar)findViewById(R.id.ratingBar);
        ocena2 = (RatingBar)findViewById(R.id.ratingBar2);
        ocena3 = (RatingBar)findViewById(R.id.ratingBar3);
        przycisk = (Button)findViewById(R.id.button);

        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,Main2Activity.class);

                String suma = ocena1.getRating() + " " + ocena2.getRating() + " " +ocena3.getRating() + " =" + (ocena1.getRating()+ocena2.getRating()+ocena3.getRating());
                intent.putExtra("suma",suma);
                startActivity(intent);
            }
        });
    }
}
