package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.calculator.expression.ExpressionHandle;

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
            btn_eql,
            btn_ES;
    EditText display;
    ExpressionHandle eh = new ExpressionHandle();
    private Boolean is = false;
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
        btn_ES = (Button) findViewById(R.id.EC);
        display = (EditText) findViewById(R.id.display);

        btn_zero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                eh.handleDisplayExpression("0");
                display.setText(eh.getExpression());
            }
        });
        btn_one.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                eh.handleDisplayExpression("1");
                display.setText(eh.getExpression());
            }
        });
        btn_two.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                eh.handleDisplayExpression("2");
                display.setText(eh.getExpression());
            }
        });
        btn_three.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                eh.handleDisplayExpression("3");
                display.setText(eh.getExpression());
            }
        });
        btn_four.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                eh.handleDisplayExpression("4");
                display.setText(eh.getExpression());
            }
        });
        btn_five.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                eh.handleDisplayExpression("5");
                display.setText(eh.getExpression());
            }
        });
        btn_six.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                eh.handleDisplayExpression("6");
                display.setText(eh.getExpression());
            }
        });
        btn_seven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                eh.handleDisplayExpression("7");
                display.setText(eh.getExpression());
            }
        });
        btn_eight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                eh.handleDisplayExpression("8");
                display.setText(eh.getExpression());
            }
        });
        btn_nine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                eh.handleDisplayExpression("9");
                display.setText(eh.getExpression());
            }
        });
        btn_add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){
                eh.handleDisplayExpression("+");
                display.setText(eh.getExpression());
            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){
                eh.handleDisplayExpression("-");
                display.setText(eh.getExpression());
            }
        });
        btn_mul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){
                eh.handleDisplayExpression("*");
                display.setText(eh.getExpression());
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){
                eh.handleDisplayExpression("/");
                display.setText(eh.getExpression());
            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void  onClick(View v){
                display.setText("0");
                eh.clear();
            }
        });
        btn_float.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                eh.handleDisplayExpression(".");
                display.setText(eh.getExpression());
            }
        });
        btn_eql.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                display.setText(eh.getValueToString());
            }
        });

        btn_ES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this,EngineeringCalculator.class);
                startActivity(it);
                finish();
            }
        });

    }
}
