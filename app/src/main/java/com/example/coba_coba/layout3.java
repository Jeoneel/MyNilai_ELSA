package com.example.coba_coba;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;


    public class layout3 extends AppCompatActivity {
        TextView tampilpresensi,tampiltugas,tampiluts,tampiluas;
        Double tpresensi,ttugas,tuts,tuas;
        Button button_akhir;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.layoutketiga);
            tampilpresensi = (TextView) findViewById(R.id.txpresensibobot);
            tampiltugas = (TextView) findViewById(R.id.txtugasbobot);
            tampiluts = (TextView) findViewById(R.id.txutsbobot);
            tampiluas = (TextView) findViewById(R.id.txuasbobot);

            Bundle b = getIntent().getExtras();
            tpresensi = b.getDouble("perse_presensi");
            ttugas = b.getDouble("perse_tugas");
            tuts = b.getDouble("perse_uts");
            tuas = b.getDouble("perse_uas");

            tampilpresensi.setText(" " + tpresensi);
            tampiltugas.setText(" " + ttugas);
            tampiluts.setText("" + tuts);
            tampiluas.setText(" " + tuas);


            Button btn = (Button) findViewById(R.id.button_akhir);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = getIntent();
                    i = new Intent(layout3.this, layout4.class);
                    startActivity(i);
                }
            });
        }
    }