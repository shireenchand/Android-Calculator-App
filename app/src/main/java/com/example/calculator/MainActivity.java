package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button plus;
    private Button minus;
    private Button mul;
    private Button div;
    private Button equal;
    private Button clear;
    private TextView output;
    private TextView input;
    private String operation;
    private double val1 = Double.NaN;
    private double val2;
    private double r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupid();

    }

    private void setupid() {
        one = (Button) findViewById(R.id.button1);
        two = (Button) findViewById(R.id.button2);
        three = (Button) findViewById(R.id.button3);
        four = (Button) findViewById(R.id.button4);
        five = (Button) findViewById(R.id.button5);
        six = (Button) findViewById(R.id.button6);
        seven = (Button) findViewById(R.id.button7);
        eight = (Button) findViewById(R.id.button8);
        nine = (Button) findViewById(R.id.button9);
        zero = (Button) findViewById(R.id.button0);
        plus = (Button) findViewById(R.id.buttonplus);
        minus = (Button) findViewById(R.id.buttonminus);
        mul = (Button) findViewById(R.id.buttonmult);
        div = (Button) findViewById(R.id.buttondiv);
        clear = (Button) findViewById(R.id.buttonAC);
        input = (TextView) findViewById(R.id.source);
        output = (TextView) findViewById(R.id.result);
    }

    public void onClickZero(View v) {
        String prev = ((TextView) findViewById(R.id.source)).getText().toString();
        ((TextView) findViewById(R.id.source)).setText(prev + "0");
    }

    public void onClickOne(View v) {
        String prev = ((TextView) findViewById(R.id.source)).getText().toString();
        ((TextView) findViewById(R.id.source)).setText(prev + "1");
    }

    public void onClickTwo(View v) {
        String prev = ((TextView) findViewById(R.id.source)).getText().toString();
        ((TextView) findViewById(R.id.source)).setText(prev + "2");
    }

    public void onClickThree(View v) {
        String prev = ((TextView) findViewById(R.id.source)).getText().toString();
        ((TextView) findViewById(R.id.source)).setText(prev + "3");
    }

    public void onClickFour(View v) {
        String prev = ((TextView) findViewById(R.id.source)).getText().toString();
        ((TextView) findViewById(R.id.source)).setText(prev + "4");
    }

    public void onClickFive(View v) {
        String prev = ((TextView) findViewById(R.id.source)).getText().toString();
        ((TextView) findViewById(R.id.source)).setText(prev + "5");
    }

    public void onClickSix(View v) {
        String prev = ((TextView) findViewById(R.id.source)).getText().toString();
        ((TextView) findViewById(R.id.source)).setText(prev + "6");
    }

    public void onClickSeven(View v) {
        String prev = ((TextView) findViewById(R.id.source)).getText().toString();
        ((TextView) findViewById(R.id.source)).setText(prev + "7");
    }

    public void onClickEight(View v) {
        String prev = ((TextView) findViewById(R.id.source)).getText().toString();
        ((TextView) findViewById(R.id.source)).setText(prev + "8");
    }

    public void onClickNine(View v) {
        String prev = ((TextView) findViewById(R.id.source)).getText().toString();
        ((TextView) findViewById(R.id.source)).setText(prev + "9");
    }


    public void onClickPlus(View v) {
        operation = "+";
        compute(operation);
        ((TextView) findViewById(R.id.source)).setText(null);

    }


    public void onClickMinus(View v) {
        operation = "-";
        compute(operation);
        ((TextView) findViewById(R.id.source)).setText(null);

    }

    public void onClickMul(View v) {
        operation = "x";
        compute(operation);
        ((TextView) findViewById(R.id.source)).setText(null);

    }

    public void onClickDiv(View v) {
        operation = "/";
        compute(operation);
        ((TextView) findViewById(R.id.source)).setText(null);

    }

    public void onClickEqual(View v) {
        compute(operation);
        ((TextView) findViewById(R.id.source)).setText(null);
        ((TextView) findViewById(R.id.result)).setText(String.valueOf(r));
    }

    public void onClickClear(View v){
        ((TextView) findViewById(R.id.result)).setText(null);
        val1 = Double.NaN;
        val2 = Double.NaN;
    }

    public void compute(String op) {
        if (!Double.isNaN(val1)) {
            val2 = Double.parseDouble(((TextView) findViewById(R.id.source)).getText().toString());
            Log.d("check",String.valueOf(val2));
            if (op == "+") {
                r = val1 + val2;
            }
            if (op == "-") {
                r = val1 - val2;
            }
            if (op == "x") {
                r = val1 * val2;
            }
            if (op == "/") {
                r = val1 / val2;
            }
        }
        else{
            Log.d("check","done3");
            Log.d("check","done4");
            val1 = Double.parseDouble(((TextView) findViewById(R.id.source)).getText().toString());
            Log.d("check",String.valueOf(val1));
        }

    }
}