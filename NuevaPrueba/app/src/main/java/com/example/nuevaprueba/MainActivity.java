package com.example.nuevaprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView et1;
    private EditText et2;
    private EditText et3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (TextView) findViewById(R.id.texto);
        et2 = (EditText)findViewById(R.id.txt_mail);
        et3 = (EditText)findViewById(R.id.telefono);

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);

        et1.setText(preferences.getString("nombre",""));
        et2.setText(preferences.getString("mail", ""));
        et3.setText(preferences.getString("telefono",""));
    }


    public void guardar(View view){

        SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);
        SharedPreferences.Editor obj_editor = preferencias.edit();
        obj_editor.putString("nombre", et1.getText().toString());
        obj_editor.putString("mail", et2.getText().toString());
        obj_editor.putString("telefono", et3.getText().toString());
        obj_editor.commit();
        finish();

    }

}