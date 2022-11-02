package com.example.calcipro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ApplicationExitInfo;
import android.content.Intent;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button sumbtn;
    private Button subbtn;
    private Button multibtn;
    private Button dibbtn;
    private ImageView linkin;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sumbtn=(Button) findViewById(R.id.sumbtn);
        subbtn=(Button)findViewById(R.id.subbtn);
        multibtn=(Button)findViewById(R.id.multibtn);
        dibbtn=(Button)findViewById(R.id.divbtn);
//        linkin=(ImageView)findViewById(R.id.linkedin);

        sumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAddition();
            }
        });
        subbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSub();
            }
        });
        multibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMulti();
            }
        });
        dibbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDivision();
            }
        });
//        linkin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                gotoUrl("https://www.linkedin.com/in/nikhil-raj-ganta-5b551724a/");
//            }
//        });

    }
    public void openAddition(){
        Intent intent=new Intent(this,Addition.class);
        startActivity(intent);
    }
    public void openSub(){
        Intent intent=new Intent(this,Sub.class);
        startActivity(intent);
    }
    public void openMulti(){
        Intent intent=new Intent(this,Multi.class);
        startActivity(intent);
    }
    public void openDivision(){
        Intent intent=new Intent(this,Division.class);
        startActivity(intent);
    }
//    private void gotoUrl(String s){
//        Uri uri=Uri.parse(s);
//        startActivity(new Intent((Intent.ACTION_VIEW),uri));
//    }
}