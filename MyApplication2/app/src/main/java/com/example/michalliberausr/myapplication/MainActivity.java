package com.example.michalliberausr.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nazwa;
    TextView imie;
    EditText input;
    RadioGroup radio;
    RatingBar ocena;
    Button przycisk;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = getApplicationContext();

        nazwa = (TextView)findViewById(R.id.nazwa);
        imie = (TextView)findViewById(R.id.imie_wynik);
        input = (EditText)findViewById(R.id.input);
        radio = (RadioGroup)findViewById(R.id.radiogroup);
        ocena = (RatingBar)findViewById(R.id.ocena_wynik);
        przycisk = (Button)findViewById(R.id.przycisk);

        nazwa.setText("Zmieniona nazwa");

        przycisk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context,Subactivity.class);

                RadioButton radioButton = (RadioButton)radio.findViewById(radio.getCheckedRadioButtonId());
                String imieString = imie.getText().toString();

                intent.putExtra("imie",imieString);
                intent.putExtra("plec",radioButton.getText());
                intent.putExtra("ocena",ocena.getRating());

                startActivity(intent);
            }
        });
    }
}
