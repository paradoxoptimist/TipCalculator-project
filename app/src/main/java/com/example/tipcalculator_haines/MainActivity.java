package com.example.tipcalculator_haines;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.tipcalculator.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //input for amount
    //input for people splitting check
    //radio buttons for preset tip amounts
    //last radio button for custom tip
    //button to reset vals
    //button to calculate tip
    //  ^^^sends user to activity 2, only displays a tip ammt summ and button to go back
    //amounts (tip, total, total per person) all textview
    //retain through rotation
    //no hardcoded strings or dimensions in .java
    //pull from like strings.xml and shit
    //error message if bill < $1, total people < 1, tip % < 1
}