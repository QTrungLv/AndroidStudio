package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    TextView number = null;
    Button toast = null;
    Button count = null;

    int countNumber = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        number = findViewById(R.id.numberCount);
        number.setText(""+countNumber);
        toast = findViewById(R.id.toast);
        count = findViewById(R.id.count);

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(number != null){
                    countNumber++;
                    number.setText("" + countNumber);

                }

            }
        });


    }
}