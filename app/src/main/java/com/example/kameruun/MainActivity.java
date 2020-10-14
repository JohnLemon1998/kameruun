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
        buttonPushMe.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                buttonPushMe.setText("ボタンが押されました");
                imageAndroid.setImageResource(R.drawable.droid2);

            }
        });
        imageAndroid = (ImageView) findViewById(R.id.iv_android);
    }
}