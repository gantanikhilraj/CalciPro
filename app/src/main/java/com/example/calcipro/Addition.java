package com.example.calcipro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Addition extends AppCompatActivity {
        private EditText numb1;
    private EditText numb2;
    private TextView result2;
    private Button add;
    private EditText result;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);
        numb1=(EditText) findViewById(R.id.num1);
        numb2=(EditText) findViewById(R.id.num2);
        result2= (TextView) findViewById(R.id.ans2);
        add=(Button) findViewById(R.id.anssumbtn);
//        result=(EditText) findViewById(R.id.ans2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(numb1.getText().toString())){
                    numb1.setError("Please Enter Number");
                    return;
                }if (TextUtils.isEmpty(numb2.getText().toString())){
                    numb2.setError("Please enter Number ");
                    return ;
                }
                else {
                float number1=Float.parseFloat(numb1.getText().toString());
                float number2=Float.parseFloat(numb2.getText().toString());
                float sum=number1+number2;
                result2.setText("Answer is:  "+String.valueOf(sum));
            }
        }
    });
}
//    private EditText numb1, numb2;
//    EditText result;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_addition);
//        numb1 = findViewById(R.id.num1);
//        numb2 = findViewById(R.id.num2);
//        TextWatcher textWatcher = new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
//                if (!numb1.getText().toString().equals("") && !numb2.getText().toString().equals("")) {
//                    float temp1 = Float.parseFloat(numb1.getText().toString());
//                    float temp2 = Float.parseFloat(numb2.getText().toString());
//                    result.setText(String.valueOf(temp1 + temp2));
//                }
//            }
//
//            @Override
//            public void afterTextChanged(Editable editable) {
//
//            }
//        };
//        numb1.addTextChangedListener(textWatcher);
//        numb2.addTextChangedListener(textWatcher);
//    }
}