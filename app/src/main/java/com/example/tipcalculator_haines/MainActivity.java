package com.example.tipcalculator_haines;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.tipcalculator.R;

public class MainActivity extends AppCompatActivity {

    private TextView tipAmount;
    private TextView total;
    private TextView totalPerPerson;

    private EditText inputTotalAmount;
    private EditText inputNumOfPeople;

    private Button calculate;
    private Button reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tipAmount = findViewById(R.id.tipAmount);
        total = findViewById(R.id.total);
        totalPerPerson = findViewById(R.id.numOfPeople);

        inputTotalAmount = findViewById(R.id.inputTotal);
        inputNumOfPeople = findViewById(R.id.inputNumOfPeople);



        public void onRadioButtonClicked(View view) {
            boolean checked = ((RadioButton) view).isChecked();

            switch(view.getId()) {
                case R.id.percent5:
                    if (checked)
                        // 5 percent tip
                        break;
                case R.id.percent10:
                    if (checked)
                        // 10 percent tip
                        break;
                case R.id.pencent15:
                    if (checked)
                        // 15 percent tip
                        break;
                case R.id.percent20:
                    if (checked)
                        // 20 percent tip
                        break;
                case R.id.percentCustom:
                    if (checked)
                        // find a way to add custom input
                        break;
            }
        }

        //okay so like, we do calculation here
        //baby shit
        //send that to activity 2
        //which has a go back button to come back here


    }


}