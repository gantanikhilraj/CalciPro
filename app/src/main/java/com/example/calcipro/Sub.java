package com.example.calcipro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Sub extends AppCompatActivity {
    private EditText numb1;
    private EditText numb2;
    private Button sub;
    private TextView result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        numb1 = (EditText) findViewById(R.id.subnum1);
        numb2 = (EditText) findViewById(R.id.subnum2);
        sub = (Button) findViewById(R.id.anssubbtn);
        result = (TextView) findViewById(R.id.subans);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(numb1.getText().toString())) {
                    numb1.setError("Please Enter Number");
                    return;
                }
                if (TextUtils.isEmpty(numb2.getText().toString())) {
                    numb2.setError("Please enter Number ");
                    return;
                } else {
                    float number1 = Float.parseFloat(numb1.getText().toString());
                    float number2 = Float.parseFloat(numb2.getText().toString());
                    float sub = number1 - number2;
                    result.setText("Answer is:  " + String.valueOf(sub));
                }
            }
        });
    }
}