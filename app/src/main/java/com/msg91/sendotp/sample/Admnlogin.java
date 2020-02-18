package com.msg91.sendotp.sample;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Admnlogin extends AppCompatActivity {
    EditText admnname, admnpass;
    Button btbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admnlogin);
        admnname = findViewById(R.id.admnlogin_email);
        admnpass = findViewById(R.id.admnlogin_pass);
        btbtn = findViewById(R.id.login_proceedo);
        btbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(admnname.getText().toString().equals("admin")&&admnpass.getText().toString().equals("admin")) {
                    Intent iore = new Intent(getApplicationContext(),options.class);
                    startActivity(iore);
                }
                else
                {
                    Toast.makeText(Admnlogin.this,"not an admin",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

