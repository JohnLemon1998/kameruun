package com.example.kameruun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonPushMe;
    private Button buttonPushMe2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPushMe = (Button) findViewById(R.id.btn_pushme);
        buttonPushMe2 = (Button) findViewById(R.id.btn_pushme2);
        buttonPushMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                buttonPushMe.setText("ボタンが押されました");
                buttonPushMe2.setText("next");
            }
        });
        buttonPushMe2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                buttonPushMe2.setText("ボタンが押されました");
                buttonPushMe.setText("next");
            }
        });
    }
}