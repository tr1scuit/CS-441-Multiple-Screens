package com.example.multiplescreens;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class RoomA extends AppCompatActivity {

    Button fButton;
    Button lButton;
    Button rButton;
    Button bButton;
    Button inButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room_a);

        fButton = (Button)findViewById(R.id.ButtonFront);
        lButton = (Button)findViewById(R.id.ButtonLeft);
        rButton = (Button)findViewById(R.id.ButtonRight);
        bButton = (Button)findViewById(R.id.ButtonBack);
        inButton = (Button)findViewById(R.id.ButtonInspect);


        bButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(RoomA.this, MainActivity.class);
                finish();
            }
        });

    }
}