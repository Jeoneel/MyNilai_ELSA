package com.example.coba_coba;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class layout2 extends AppCompatActivity {
    EditText inputnim, inputnama,inputpresensi, inputtugas, inpututs, inputuas;
    String lnim,lnama;
    Double lpresensi,ltugas,luts,luas;
    Button btn;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutkedua);

            inputnim = (EditText) findViewById(R.id.txnim);
            inputnama = (EditText) findViewById(R.id.txnama);
            inputpresensi = (EditText) findViewById(R.id.txpresensi);
            inputtugas = (EditText) findViewById(R.id.txtugas);
            inpututs = (EditText) findViewById(R.id.txuts);
            inputuas = (EditText) findViewById(R.id.txuas);

            Button btn = (Button) findViewById(R.id.button_submit);
            btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lnim = inputnim.getText().toString();
                lnama= inputnama.getText().toString();
                lpresensi = Double.parseDouble(inputpresensi.getText().toString());
                ltugas = Double.parseDouble(inputtugas.getText().toString());
                luts = Double.parseDouble(inpututs.getText().toString());
                luas = Double.parseDouble(inputuas.getText().toString());
                Intent i = getIntent();
                i = new Intent( layout2.this,layout3.class);
                Bundle b = new Bundle();
                b.putString("parse_nim",lnim);
                b.putString("parse_nama",lnama);
                b.putDouble("parse_presensi",lpresensi);
                b.putDouble("parse_tugas",ltugas);
                b.putDouble("parse_uts",luts);
                b.putDouble("parse_uas",luas);

                i.putExtras(b);
                startActivity(i);
            }
        });

    }
}