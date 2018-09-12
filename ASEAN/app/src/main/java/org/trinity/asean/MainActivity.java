package org.trinity.asean;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    CardView card_1;
    CardView card_2;
    CardView card_3;
    CardView card_4;
    CardView card_5;
    CardView card_6;
    CardView card_7;
    CardView card_8;
    CardView card_9;
    CardView card_10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card_1 = findViewById(R.id.card_1);
        card_2 = findViewById(R.id.card_2);
        card_3 = findViewById(R.id.card_3);
        card_4 = findViewById(R.id.card_4);
        card_5 = findViewById(R.id.card_5);
        card_6 = findViewById(R.id.card_6);
        card_7 = findViewById(R.id.card_7);
        card_8 = findViewById(R.id.card_8);
        card_9 = findViewById(R.id.card_9);
        card_10 = findViewById(R.id.card_10);

        card_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, filipina.class);
                startActivity(i);
            }
        });
        card_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, indonesia.class);
                startActivity(i);
            }
        });
        card_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, malaysia.class);
                startActivity(i);
            }
        });
        card_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, singapura.class);
                startActivity(i);
            }
        });
        card_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, thailand.class);
                startActivity(i);
            }
        });
        card_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, brunei.class);
                startActivity(i);
            }
        });
        card_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, vietnam.class);
                startActivity(i);
            }
        });
        card_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, laos.class);
                startActivity(i);
            }
        });
        card_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, myanmar.class);
                startActivity(i);
            }
        });
        card_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, kamboja.class);
                startActivity(i);
            }
        });
    }
}
