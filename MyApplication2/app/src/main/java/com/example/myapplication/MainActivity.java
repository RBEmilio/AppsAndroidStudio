package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView tx1;
    private TextView tx2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx1 = (TextView) findViewById(R.id.Nombre);
        tx2 = (TextView) findViewById(R.id.Apellidos);
    }

    public void siguiente(View view){

        Intent siguiente = new Intent(this, MainActivity2.class);

        startActivity(siguiente);

    }
}