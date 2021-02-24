package com.example.multiplescreens;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

// App goals: Simple maze with navigation, text prompts, inventory.

public class MainActivity extends AppCompatActivity {

    Button forwardButton;
    Button inspectButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        forwardButton = (Button)findViewById(R.id.Button1);
        inspectButton = (Button)findViewById(R.id.Button2);

        // (switch screen/activity) opens next room
        forwardButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, RoomA.class);
                startActivity(intent);
            }
        });

        // (text prompt) inspects current room
    }




}