package com.example.multiplescreens;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class RoomA extends AppCompatActivity {

    Button forwardButton;
    Button leftButton;
    Button rightButton;
    Button backButton;
    Button inspectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_a);

        forwardButton = (Button)findViewById(R.id.ButtonFront);
        leftButton = (Button)findViewById(R.id.ButtonLeft);
        rightButton = (Button)findViewById(R.id.ButtonRight);
        backButton = (Button)findViewById(R.id.ButtonBack);
        inspectButton = (Button)findViewById(R.id.ButtonInspect);

        backButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(RoomA.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}