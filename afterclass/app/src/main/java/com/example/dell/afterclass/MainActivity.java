package com.example.dell.afterclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edittext1, edittext2;
    Button button1, button2, button3, button4;
    TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext1 = (EditText) findViewById(R.id.edittext1);
        edittext2 = (EditText) findViewById(R.id.edittext2);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        hasil = (TextView) findViewById(R.id.hasil);

        //hasil perkalian
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String angka1 = edittext1.getText().toString();
                String angka2 = edittext2.getText().toString();

                int  intangka1 = Integer.parseInt(angka1);
                int  intangka2 = Integer.parseInt(angka2);
                int hasilkali = intangka1*intangka2;
                hasil.setText(hasilkali);
            }
        });
        //hasil pembagian
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String angka1 = edittext1.getText().toString();
                String angka2 = edittext2.getText().toString();

                int  intangka1 = Integer.parseInt(angka1);
                int  intangka2 = Integer.parseInt(angka2);
                int hasilbagi = intangka1/intangka2;
                hasil.setText(hasilbagi);
            }
        });
        //hasil penambahan
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String angka1 = edittext1.getText().toString();
                String angka2 = edittext2.getText().toString();

                int  intangka1 = Integer.parseInt(angka1);
                int  intangka2 = Integer.parseInt(angka2);
                int hasiltambah = intangka1+intangka2;
                hasil.setText(hasiltambah);
            }
        });
        //hasil pengurangan
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String angka1 = edittext1.getText().toString();
                String angka2 = edittext2.getText().toString();

                int  intangka1 = Integer.parseInt(angka1);
                int  intangka2 = Integer.parseInt(angka2);
                int hasilkurang = intangka1-intangka2;
                hasil.setText(hasilkurang);
            }
        });

    }
}
