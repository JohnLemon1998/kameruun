package com.example.kameruun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button buttonPushMe;
    private Button buttonPushMe2;
    private ImageView imageAndroid;

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
                imageAndroid.setImageResource(R.drawable.droid2);
                buttonPushMe2.setText("戻すにはこちらを押してください");

            }
        });
        imageAndroid = (ImageView) findViewById(R.id.iv_android);

        buttonPushMe2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                buttonPushMe2.setText("ボタンが押されました");
                imageAndroid.setImageResource(R.drawable.droid1);
                buttonPushMe.setText("戻すにはこちらを押してください");

            }
        });
    }
}