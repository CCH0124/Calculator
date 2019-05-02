package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EngineeringCalculator extends AppCompatActivity {
    Button btn_ES;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.engineering_calculator);

        btn_ES = (Button) findViewById(R.id.EC);
        btn_ES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(EngineeringCalculator.this,MainActivity.class);
                startActivity(it);
                finish();
            }
        });
    }


}
