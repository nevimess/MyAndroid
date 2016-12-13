package com.example.michalliberausr.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by MichalLiberaUsr on 2016-12-12.
 */

public class Subactivity extends AppCompatActivity {
    TextView imie;
    TextView plec;
    TextView ocena;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subactivity);
        Bundle bundle = getIntent().getExtras();

        imie = (TextView)findViewById(R.id.imie_wynik);
        plec = (TextView)findViewById(R.id.plec_wynik);
        ocena = (TextView)findViewById(R.id.ocena_wynik);

        String imieString = bundle.getString("imie");
        String plecString = bundle.getString("plec");
        String ocenaString = bundle.getFloat("ocena")+" gwiazdek";

        imie.setText(imieString);
        plec.setText(plecString);
        ocena.setText(ocenaString);
    }
}
