package com.msg91.sendotp.sample;

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

public class addtrain extends AppCompatActivity {
    Button btb;
    EditText tx1,tx2,tx3,tx4,tx5,tx6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtrain);
        btb=findViewById(R.id.button);
        tx1=findViewById(R.id.editText);
        tx2=findViewById(R.id.editText2);
        tx3=findViewById(R.id.editText3);
        tx4=findViewById(R.id.editText4);
        tx5=findViewById(R.id.editText5);
        tx6=findViewById(R.id.editText6);
        btb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(tx1.getText().toString().isEmpty()||tx2.getText().toString().isEmpty()||tx3.getText().toString().isEmpty()||tx4.getText().toString().isEmpty()||tx5.getText().toString().isEmpty()||tx6.getText().toString().isEmpty()))
                {

                    StringRequest stringRequest = new StringRequest(Request.Method.POST,"https://hastalavistaresto.000webhostapp.com/RailwayRes/railadd.php",
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {

//If we are getting success from server
                                    if(response.equals("Success"))
                                    {
                                        Toast.makeText(addtrain.this,"Succesfully Added",Toast.LENGTH_LONG).show();
                                    }
                                    else
                                    {
                                        Toast.makeText(addtrain.this,"Unsuccessfull attempt",Toast.LENGTH_SHORT).show();
                                    }
                                    try {
                                        JSONArray jsonArray=new JSONArray(response);
                                        for(int i=0;i<jsonArray.length();i++){
                                            JSONObject json_obj = jsonArray.getJSONObject(i);

                                        }
                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }

                                }
                            },
                            new Response.ErrorListener() {
                                @Override
                                public void onErrorResponse(VolleyError error) {
//You can handle error here if you want
                                }

                            }){
                        @Override
                        protected Map<String, String> getParams() throws AuthFailureError {
                            Map<String,String> params = new HashMap<>();
//Adding parameters to request

                            params.put("Tno",tx1.getText().toString());
                            params.put("Tname",tx2.getText().toString());
                            params.put("Tsource",tx3.getText().toString());
                            params.put("Tdest",tx4.getText().toString());
                            params.put("Tdate",tx5.getText().toString());
                            params.put("Tcost",tx6.getText().toString());

//returning parameter
                            return params;
                        }
                    };

//Adding the string request to the queue
                    RequestQueue requestQueue = Volley.newRequestQueue(addtrain.this);
                    requestQueue.add(stringRequest);

                }
                else
                {
                    Toast.makeText(addtrain.this,"enter values correctly", Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}