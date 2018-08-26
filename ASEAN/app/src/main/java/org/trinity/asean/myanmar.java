package org.trinity.asean;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class myanmar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myanmar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Informasi Negara");
    }
}
