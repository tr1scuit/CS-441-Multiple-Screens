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

public class RoomG extends AppCompatActivity {

    private int roomNumber = 6;


    Button rButton;
    Button bButton;
    Button inspButton;
    Button invButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_g);


        rButton = (Button)findViewById(R.id.ButtonRight);
        bButton = (Button)findViewById(R.id.ButtonBack);
        inspButton = (Button)findViewById(R.id.ButtonInspect);
        invButton = (Button)findViewById(R.id.ButtonInventory);



        rButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(RoomG.this, RoomH.class);
                startActivity(intent);
            }
        });

        bButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(RoomG.this, MainActivity.class);
                finish();
            }
        });

        inspButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                new AlertDialog.Builder(RoomG.this)
                        .setTitle("Inspect Room")
                        .setMessage(RoomHandler.getInstance().get(roomNumber).getDescription())
                        .setNeutralButton("Loot Gold", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                InventoryHandler.getInstance().addGold(RoomHandler.getInstance().get(roomNumber).takeCoin());
                            }
                        })
                        .setPositiveButton("Take Items", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                ArrayList<String> temp = RoomHandler.getInstance().get(roomNumber).takeThings();
                                for(int j = 0; j < temp.size(); j++){
                                    InventoryHandler.getInstance().addItem(temp.get(j));
                                }
                            }
                        })
                        .setNegativeButton("Okay", null)
                        .show();

            }
        });
        invButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                new AlertDialog.Builder(RoomG.this)
                        .setTitle("Inventory:")
                        .setMessage("GOLD: " + InventoryHandler.getInstance().getGold() +"\n"
                                +  "ITEMS: " + InventoryHandler.getInstance().getInventory())
                        .setNegativeButton("Okay", null)
                        .show();

            }
        });

    }

}