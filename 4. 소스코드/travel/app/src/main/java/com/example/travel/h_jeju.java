package com.example.travel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class h_jeju extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.h_jeju);

        Button b = (Button)findViewById(R.id.Button1);
        Button c = (Button)findViewById(R.id.Button2);
        Button d = (Button)findViewById(R.id.Button3);

        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(h_jeju.this,
                        h_jeju_jejusi.class);
                startActivity(intent);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(h_jeju.this,
                        h_jeju_west.class);
                startActivity(intent);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(h_jeju.this,
                        h_jeju_east.class);
                startActivity(intent);
            }
        });
    }
}
