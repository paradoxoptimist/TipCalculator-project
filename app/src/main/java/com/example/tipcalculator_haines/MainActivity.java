package com.example.tipcalculator_haines;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tipcalculator.R;

public class MainActivity extends AppCompatActivity {

    private TextView tipAmount;
    private TextView total;
    private TextView totalPerPerson;

    private EditText inputTotalAmount;
    private EditText inputNumOfPeople;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipAmount = findViewById(R.id.tipAmount);
        total = findViewById(R.id.total);
        totalPerPerson = findViewById(R.id.numOfPeople);

        inputTotalAmount = findViewById(R.id.inputTotal);
        inputNumOfPeople = findViewById(R.id.inputNumOfPeople);



    }


}