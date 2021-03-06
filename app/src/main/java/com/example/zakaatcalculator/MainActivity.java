package com.example.zakaatcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText et1;
    EditText et2;
    EditText et3;
    EditText et4;
    EditText et5;
    EditText et6;
    EditText et7;
    EditText et8;
    TextView resultTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        et5 = findViewById(R.id.et5);
        et6 = findViewById(R.id.et6);
        et7 = findViewById(R.id.et7);
        et8 = findViewById(R.id.et8);
        resultTv = findViewById(R.id.zakatTv);
    }

    public void reset(View view) {
        et1.setText(String.valueOf(0));
        et2.setText(String.valueOf(0));
        et3.setText(String.valueOf(0));
        et4.setText(String.valueOf(0));
        et5.setText(String.valueOf(0));
        et6.setText(String.valueOf(0));
        et7.setText(String.valueOf(0));
        et8.setText(String.valueOf(0));
        resultTv.setText(String.valueOf(0));
    }

    public void calculate(View view) {
        float finalValue = 0;
        if(!et1.getText().toString().isEmpty()){
            finalValue += Float.parseFloat(et1.getText().toString());
        }
        if(!et2.getText().toString().isEmpty()){
            finalValue += Float.parseFloat(et2.getText().toString());
        }
        if(!et3.getText().toString().isEmpty()){
            finalValue += Float.parseFloat(et3.getText().toString());
        }
        if(!et4.getText().toString().isEmpty()){
            finalValue += Float.parseFloat(et4.getText().toString());
        }
        if(!et5.getText().toString().isEmpty()){
            finalValue += Float.parseFloat(et5.getText().toString());
        }
        if(!et6.getText().toString().isEmpty()){
            finalValue += Float.parseFloat(et6.getText().toString());
        }
        if(!et7.getText().toString().isEmpty()){
            finalValue -= Float.parseFloat(et7.getText().toString());
        }
        if(!et8.getText().toString().isEmpty()){
            finalValue -= Float.parseFloat(et8.getText().toString());
        }
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        resultTv.setText(String.valueOf(numberFormat.format(finalValue * 0.025)));
    }
}