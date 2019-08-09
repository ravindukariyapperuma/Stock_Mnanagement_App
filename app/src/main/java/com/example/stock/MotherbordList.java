package com.example.stock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MotherbordList extends AppCompatActivity {
    ImageButton button4;
    Button button3;
    Button button2;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motherbord_list);

        button4 = findViewById(R.id.addnew);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),AddItem.class);
                startActivity(intent);
            }
        });

        button3 = findViewById(R.id.edititem_btn);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),update_delete_item.class);
                startActivity(intent);
            }
        });

        button2 = findViewById(R.id.push_item_btn);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Push_item.class);
                startActivity(intent);
            }
        });

        button1 = findViewById(R.id.pull_item_btn);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Pull_item.class);
                startActivity(intent);
            }
        });

    }
}
