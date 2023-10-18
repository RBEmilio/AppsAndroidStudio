package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity2 extends AppCompatActivity {

    private Spinner sp1;
    private String url = "https://docs.oracle.com/javase/8/docs/api/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sp1 = (Spinner) findViewById(R.id.Spinner1);

        String [] opciones = {"toString", " java. math",  "java. math."};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opciones);
        sp1.setAdapter(adapter);

    }

    public void atras(View view){

        Intent siguiente = new Intent(this, MainActivity.class);

        startActivity(siguiente);

    }

    public void pagina(View view){



        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        startActivity(intent);

    }

}