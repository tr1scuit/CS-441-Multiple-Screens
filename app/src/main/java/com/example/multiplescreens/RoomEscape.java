package com.example.multiplescreens;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

import java.util.ArrayList;

public class RoomEscape extends AppCompatActivity {

    private int roomNumber = 12;

    Button endButton;
    Button invButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_escape);

        endButton = (Button)findViewById(R.id.ButtonEnd);
        invButton = (Button)findViewById(R.id.ButtonInventory);
        
        endButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                new AlertDialog.Builder(RoomEscape.this)
                        .setTitle("Restart?")
                        .setMessage(RoomHandler.getInstance().get(roomNumber).getDescription())
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                InventoryHandler.resetInstance();
								RoomHandler.resetInstance();
						        Intent intent = new Intent(RoomEscape.this, MainActivity.class);
                                startActivity(intent);
								finish();
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();

            }
        });
        invButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                new AlertDialog.Builder(RoomEscape.this)
                        .setTitle("Inventory:")
                        .setMessage("GOLD: " + InventoryHandler.getInstance().getGold() +"\n"
                                +  "ITEMS: " + InventoryHandler.getInstance().getInventory())
                        .setNegativeButton("Okay", null)
                        .show();

            }
        });

    }

}