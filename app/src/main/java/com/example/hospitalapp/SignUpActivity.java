package com.example.hospitalapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUpActivity extends AppCompatActivity {
    EditText et3,et4,et5,et6,et7,et8,et9;
    AppCompatButton b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        et3=(EditText) findViewById(R.id.name);
        et4=(EditText) findViewById(R.id.add);
        et5=(EditText) findViewById(R.id.pin);
        et6=(EditText) findViewById(R.id.mob);
        et7=(EditText) findViewById(R.id.username);
        et8=(EditText) findViewById(R.id.password1);
        et9=(EditText) findViewById(R.id.password2);
        b3=(AppCompatButton) findViewById(R.id.btn3);
        b4=(AppCompatButton) findViewById(R.id.btn4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(in);
            }
        });



    }
}