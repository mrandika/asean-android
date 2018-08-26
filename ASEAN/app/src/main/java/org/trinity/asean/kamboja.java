package org.trinity.asean;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class kamboja extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kamboja);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Informasi Negara");
    }
}
