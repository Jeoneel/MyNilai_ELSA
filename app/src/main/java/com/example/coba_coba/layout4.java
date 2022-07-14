package com.example.coba_coba;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class layout4 extends AppCompatActivity {
TextView tampilmatkul,tampilnim,tampilnama,tampilakhir,tampilgrade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutfinal);

        tampilmatkul = (TextView) findViewById(R.id.tampilmatkul);
        tampilnim = (TextView) findViewById(R.id.tampilnim);
        tampilnama = (TextView) findViewById(R.id.tampilnama);
        tampilakhir = (TextView) findViewById(R.id.tampilakhir);
        tampilgrade = (TextView) findViewById(R.id.tampilgrade);

        Intent intent = getIntent();
        String lnim = intent.getStringExtra("NIM").toString();
        String lnama = intent.getStringExtra("NAMA").toString();
        double lpresensi = intent.getFloatExtra("PRESENSI",0);
        double ltugas = intent.getFloatExtra("TUGAS",0);
        double luts = intent.getFloatExtra("UTS",0);
        double luas = intent.getFloatExtra("UAS",0);

        double pres = (double) (lpresensi*0.10);
        double tgs = (double) (ltugas*0.30);
        double uts = (double) (luts*0.30);
        double uas = (double) (luas*0.30);

        double hasil = pres+tgs+uts+uas;

        tampilnim.setText(lnim);
        tampilnama.setText(lnama);
        tampilakhir.setText(String.valueOf(hasil));

        if(hasil >= 80 && hasil <=100){
            tampilgrade.setText("GRADE A");
        }
        else if (hasil >=65 && hasil  <=80){
            tampilgrade.setText("GRADE B");
        }
        else if (hasil >=55 && hasil  <=65){
            tampilgrade.setText("GRADE C");
        }
        else if (hasil >=40 && hasil  <55){
            tampilgrade.setText("GRADE D");
        }
        else {
            tampilgrade.setText("GRADE E");
        }

    }
}
