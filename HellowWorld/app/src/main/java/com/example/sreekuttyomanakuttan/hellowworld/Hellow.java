package com.example.sreekuttyomanakuttan.hellowworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Hellow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView txt=new TextView(this);
        txt.setText("Hellow SREEKANTH");
        setContentView(txt);
    }
}
