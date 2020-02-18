package com.msg91.sendotp.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class options extends AppCompatActivity {
Button btnny,btmmy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        btnny=findViewById(R.id.button);
        btmmy=findViewById(R.id.button2);
        btmmy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irose=new Intent(getApplicationContext(),MainActivityhome.class);
                startActivity(irose);
            }
        });
        btnny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iapple=new Intent(getApplicationContext(),addtrain.class);
                startActivity(iapple);
            }
        });
    }
}
