package org.trinity.asean;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.card_1) CardView card_1;
    @BindView(R.id.card_2) CardView card_2;
    @BindView(R.id.card_3) CardView card_3;

//    belom ada, entar aja
//    @BindView(R.id.card_4) CardView card_4;
//    @BindView(R.id.card_5) CardView card_5;
//    @BindView(R.id.card_6) CardView card_6;
//    @BindView(R.id.card_7) CardView card_7;
//    @BindView(R.id.card_8) CardView card_8;
//    @BindView(R.id.card_9) CardView card_9;
//    @BindView(R.id.card_10) CardView card_10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

//        implement on click listener dan pindah menggunakan intent

//        card_1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, filipina.class);
//            }
//        });
//        card_2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, indonesia.class);
//            }
//        });
//        card_3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i = new Intent(MainActivity.this, malaysia.class);
//            }
//        });
    }
}
