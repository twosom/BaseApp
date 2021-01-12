package com.cookandroid.baseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuizActivity extends AppCompatActivity {

    Button btn911, btnGal, btnNate, btnFin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        //btnNate관련 명령어들
        btnNate = (Button) findViewById(R.id.btnNate);
        btnNate.setBackgroundColor(Color.GRAY);
        Intent nate = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.nate.com"));
        btnNate.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(nate);
            }
        });

        //btn911관련 메소드들.
        btn911 = (Button) findViewById(R.id.btn911);
        btn911.setBackgroundColor(Color.GREEN);
        Intent phoneCall_911 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/911"));
        btn911.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(phoneCall_911);
            }
        });

        //btnGal 관련 메소드들.
        btnGal = (Button) findViewById(R.id.btnGal);
        btnGal.setBackgroundColor(Color.RED);
        Intent gallery = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));
        btnGal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(gallery);
            }
        });

        //btnFin 관련 메소드들.
        btnFin = (Button) findViewById(R.id.btnFin);
        btnFin.setBackgroundColor(Color.YELLOW);
        btnFin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}