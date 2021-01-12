package com.cookandroid.baseapp;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;



import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    //AppCompatActivity 클래스의 상속을 받아서  MainActivity 클래스 정의
    //가장 기본이 되는 클래스이면 이 클래스에서 화면을 표시.

    Button button1;
    CheckBox checkBox;


    //Override된 onCreate메서드로 가장 기본인 메소드이다.
    //C언어의 main이라 생각하면 된다.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //activity_main.xml파일을 의미한다.

        //변수에 대입할 때는 각 클래스의 이름으로 캐스팅 해야 한다.
        //레이아웃파일에 들어있는 문자열, 버튼 등의 id, 이미지 파일의 id는 모두
        //R클래스 파일에 자동으로 등록된다.
        button1 = (Button)findViewById(R.id.button1);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //메세지를 잠시 나타내주는 메소드로, 앞으로 자주 사용할 것이다.
                //파라미터는 메세지가 출력될 컨텍스트, 메시지 내용, 출력할 시간.
                Toast.makeText(getApplicationContext(), "버튼을 눌렀어요",
                        //getApplicationContext()는 현재 어플리케이션의 컨텍스트를 구해준다.
                        Toast.LENGTH_SHORT).show();
            }
        });
        checkBox.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                checkBox.setText("SOMANG");
                checkBox.setBackgroundColor(Color.BLUE);
            }
        });
    }


}