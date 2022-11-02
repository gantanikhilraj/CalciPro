package com.example.calcipro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Division extends AppCompatActivity {
    private EditText numb1;
    private EditText numb2;
    private Button result;
    private TextView answer;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_division);
//        multinum1=(EditText) findViewById(R.id.multinum1);
        numb1=(EditText) findViewById(R.id.divnum1);
        numb2=(EditText) findViewById(R.id.divnum2);
        result=(Button) findViewById(R.id.ansdivbtn);
        answer=(TextView) findViewById(R.id.ansdiv);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(numb1.getText().toString())) {
                    numb1.setError("Please Enter Number");
                    return;
                }
                if (TextUtils.isEmpty(numb2.getText().toString())) {
                    numb2.setError("Please Enter Number");
                    return;
                } else {
                    float number1 = Float.parseFloat(numb1.getText().toString());
                    float number2 = Float.parseFloat(numb2.getText().toString());
                    float div = number1 / number2;
                    answer.setText("Answer is:  " + String.valueOf(div));
                }
            }
        });
    }
}