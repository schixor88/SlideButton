package com.prabhupay.slidebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.prabhupay.sliderbuttonpack.CardHolder;

public class MainActivity extends AppCompatActivity {

    CardHolder cardHolder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardHolder = findViewById(R.id.cardHolder);
        cardHolder.setValue("This is me");

    }
}
