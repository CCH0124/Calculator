package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn_zero,
            btn_one,
            btn_two,
            btn_three,
            btn_four,
            btn_five,
            btn_six,
            btn_seven,
            btn_eight,
            btn_nine,
            btn_add,
            btn_sub,
            btn_div,
            btn_mul,
            btn_float,
            btn_clear,
            btn_eql;
    EditText display;
    float mValueOne, mValueTwo;
    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;

    private void isZero(EditText num){
        if(num.getText().toString().equals("0")){
            num.setText(null);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_zero = (Button) findViewById(R.id.zero);
        btn_one = (Button) findViewById(R.id.one);
        btn_two = (Button) findViewById(R.id.two);
        btn_three = (Button) findViewById(R.id.three);
        btn_four = (Button) findViewById(R.id.four);
        btn_five = (Button) findViewById(R.id.five);
        btn_six = (Button) findViewById(R.id.six);
        btn_seven = (Button) findViewById(R.id.seven);
        btn_eight = (Button) findViewById(R.id.eight);
        btn_nine = (Button) findViewById(R.id.nine);
        btn_add = (Button) findViewById(R.id.buttonadd);
        btn_sub = (Button) findViewById(R.id.buttonsub);
        btn_div = (Button) findViewById(R.id.buttondiv);
        btn_mul = (Button) findViewById(R.id.buttonmul);
        btn_float = (Button) findViewById(R.id.buttonfloat);
        btn_clear = (Button) findViewById(R.id.buttonClear);
        btn_eql = (Button) findViewById(R.id.buttoneql);
        display = (EditText) findViewById(R.id.display);

        btn_zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if (display.getText().toString().equals("0")){
                    display.setText("0");
                } else {
                    display.setText(display.getText() + "0");
                }
            }
        });

        btn_one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isZero(display);
                display.setText(display.getText() + "1");
            }
        });

        btn_two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isZero(display);
                display.setText(display.getText() + "2");
            }
        });

        btn_three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isZero(display);
                display.setText(display.getText() + "3");
            }
        });

        btn_four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isZero(display);
                display.setText(display.getText() + "4");
            }
        });

        btn_five.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isZero(display);
                display.setText(display.getText() + "5");
            }
        });

        btn_six.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isZero(display);
                display.setText(display.getText() + "6");
            }
        });

        btn_seven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isZero(display);
                display.setText(display.getText() + "7");
            }
        });

        btn_eight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isZero(display);
                display.setText(display.getText() + "8");
            }
        });

        btn_nine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isZero(display);
                display.setText(display.getText() + "9");
            }
        });

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (display == null) {
                    display.setText("");
                } else {
                    mValueOne = Float.parseFloat(display.getText() + "");
                    crunchifyAddition = true;
                    display.setText(null);
                }
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(display.getText() + "");
                mSubtract = true;
                display.setText(null);
            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(display.getText() + "");
                crunchifyMultiplication = true;
                display.setText(null);
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(display.getText() + "");
                crunchifyDivision = true;
                display.setText(null);
            }
        });

        btn_eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(display.getText() + "");

                if (crunchifyAddition == true) {
                    display.setText(mValueOne + mValueTwo + "");
                    crunchifyAddition = false;
                }

                if (mSubtract == true) {
                    display.setText(mValueOne - mValueTwo + "");
                    mSubtract = false;
                }

                if (crunchifyMultiplication == true) {
                    display.setText(mValueOne * mValueTwo + "");
                    crunchifyMultiplication = false;
                }

                if (crunchifyDivision == true) {
                    display.setText(mValueOne / mValueTwo + "");
                    crunchifyDivision = false;
                }
            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("0");
            }
        });

        btn_float.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText(display.getText() + ".");
            }
        });
    }
}
