package com.androidhehe.riga.damarauriga_1202150007_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Intent intent = getIntent();
        String showMenu = intent.getStringExtra("Menu");
        String showHarga = intent.getStringExtra("harga");
        String showTempat = intent.getStringExtra("Tempat");
        String showPorsi = intent.getStringExtra("Porsi");


        int bil = Integer.valueOf(showPorsi) * Integer.valueOf(showHarga);
        TextView Menu = (TextView) findViewById(R.id.sh_menu);
        TextView Porsi = (TextView) findViewById(R.id.sh_porsi);
        TextView Tempat = (TextView) findViewById(R.id.nama_tempat);
        TextView Harga = (TextView) findViewById(R.id.sh_harga);


        Menu.setText(showMenu);
        Porsi.setText(showPorsi);
        Tempat.setText(showTempat);

                Harga.setText(String.valueOf(bil));

        if (bil > 65500) {

            Toast toast = Toast.makeText(this, "Jangan disini bre Makan malemnya, lu ora ada duit", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this, "disini aja bre rada murahan dikit", Toast.LENGTH_LONG);
            toast.show();
        }

    }
}