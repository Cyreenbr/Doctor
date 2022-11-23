package com.example.doctor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.android.material.button.MaterialButton;

public class Inscrit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscrit);

        EditText username = (EditText) findViewById(R.id.username);

        MaterialButton registerbtn = (MaterialButton) findViewById(R.id.Registerbtn);

         //registerbtn.setOnClickListener(new view.OnClickListener() );
    }
}