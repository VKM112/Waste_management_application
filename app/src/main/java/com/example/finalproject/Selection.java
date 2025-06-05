package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Selection extends AppCompatActivity {

    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);

        myImageButton = (ImageButton) findViewById(R.id.waste);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Selection.this,plastic.class);
                startActivity(intent);
            }
        });
        myImageButton = (ImageButton) findViewById(R.id.waste1);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Selection.this,organic.class);
                startActivity(intent);
            }
        });
        myImageButton = (ImageButton) findViewById(R.id.waste2);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Selection.this,electronic.class);
                startActivity(intent);
            }
        });
        myImageButton = (ImageButton) findViewById(R.id.waste3);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Selection.this,medical.class);
                startActivity(intent);
            }
        });


    }
}