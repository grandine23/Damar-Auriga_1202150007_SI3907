package com.androidhehe.riga.damarauriga_1202150007_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mMenu;
    private EditText mPorsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMenu = (EditText) findViewById(R.id.makan_apa);
        mPorsi = (EditText) findViewById(R.id.porsi);

    }

    public void launchEatbus(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        String Menu = mMenu.getText().toString();
        String Porsi = mPorsi.getText().toString();

        intent.putExtra("harga", "50000");
        intent.putExtra("Menu", Menu);

        intent.putExtra("Porsi", Porsi);

        intent.putExtra("Tempat", "Eatbus");

        startActivity(intent);
    }

    public void launchAbnormal(View view) {

        Intent intent = new Intent(this, SecondActivity.class);
        String Menu = mMenu.getText().toString();
        String Porsi = mPorsi.getText().toString();

        intent.putExtra("harga", "30000");
        intent.putExtra("Menu", Menu);

        intent.putExtra("Porsi", Porsi);

        intent.putExtra("Tempat", "Abnormal");

        startActivity(intent);


    }
}
