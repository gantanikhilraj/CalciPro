package com.example.calcipro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Multi extends AppCompatActivity {
    private EditText multinum1;
    private EditText multinum2;
    private Button ansmultibtn;
    private TextView ansmulti;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi);
        multinum1=(EditText) findViewById(R.id.multinum1);
        multinum2=(EditText) findViewById(R.id.multinum2);
        ansmultibtn=(Button) findViewById(R.id.ansmultibtn);
        ansmulti=(TextView) findViewById(R.id.ansmulti);
        ansmultibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(multinum1.getText().toString())) {
                    multinum1.setError("Please Enter Number");
                    return;
                }
                if (TextUtils.isEmpty(multinum2.getText().toString())) {
                    multinum2.setError("Please Enter Number");
                    return;
                } else {
                    float number1 = Float.parseFloat(multinum1.getText().toString());
                    float number2 = Float.parseFloat(multinum2.getText().toString());
                    float multi = number1 * number2;
                    ansmulti.setText("Answer is:  " + String.valueOf(multi));
                }
            }
        });
    }
}