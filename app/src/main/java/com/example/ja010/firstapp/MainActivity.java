package com.example.ja010.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butt();
    }
    void butt(){
        b1 =(Button)findViewById(R.id.b1);
        b2 =(Button)findViewById(R.id.b2);
        b3 =(Button)findViewById(R.id.b3);
        b4 =(Button)findViewById(R.id.b4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a1 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(a1);
            }
        });

    }

}
