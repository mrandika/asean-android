package org.trinity.asean;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class thailand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thailand);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Informasi Negara");
    }
}
