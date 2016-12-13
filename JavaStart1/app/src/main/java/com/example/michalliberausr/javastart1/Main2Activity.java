package com.example.michalliberausr.javastart1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class Main2Activity extends AppCompatActivity {

    TextView wynik;
    Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        wynik = (TextView)findViewById(R.id.wynik);
        bundle = getIntent().getExtras();
        String result = bundle.getString("suma");

        wynik.setText(result + " gwiazdek");

    }
}
