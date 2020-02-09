package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2 = (TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message");
        double myNum = 0;
        try {
            myNum = Double.parseDouble(str);
            myNum = myNum * 0.77;
        } catch(NumberFormatException nfe) {

        }
        textView2.setText("£" + String.valueOf(myNum));
    }
}
