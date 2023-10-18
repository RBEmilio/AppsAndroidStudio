package com.example.primerproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private String result;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.ed2);

        et2 = (EditText) findViewById(R.id.ed1);

        tv1 = (TextView) findViewById(R.id.result);

        rb1 = (RadioButton) findViewById(R.id.Dividir);

        rb2 = (RadioButton)findViewById(R.id.multiplicar);

        rb3 = (RadioButton) findViewById(R.id.suma);

        rb4 = (RadioButton) findViewById(R.id.resta);

        result = null;
    }

    public void resultado (View view){

        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();


        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        if(rb1.isChecked()){
            int dividir = num1/num2;
            result = String.valueOf(dividir);

        } else if (rb2.isChecked()) {

            int mult = num1*num2;
            result = String.valueOf(mult);

        } else if (rb3.isChecked()) {

            int suma = num1+num2;
            result = String.valueOf(suma);

        }else if(rb4.isChecked()){

            int resta= num1-num2;
            result = String.valueOf(resta);

        }else{

            String error = "Error";
        }

        tv1.setText(result);

    }

        /*int matematicas = 5;

        int quimica = 5;

        int fisica = 5;

        int resultado = 0;

        resultado = (matematicas + quimica + fisica) / 3;

        if(resultado >=5){

            Toast.makeText(this, "Aprobado", Toast.LENGTH_LONG).show();

        } else if(resultado <5){

            Toast.makeText(this, "Suspenso", Toast.LENGTH_LONG).show();

        }

    }

    /*@Override

    protected void onStart() {

        super.onStart();

        Toast.makeText(this, "OnStart", Toast.LENGTH_SHORT).show();

// La actividad está a punto de hacerse visible.

    }

    @Override

    protected void onResume() {

        super.onResume();

        Toast.makeText(this, "Abierta", Toast.LENGTH_SHORT).show();

// La actividad se ha vuelto visible (ahora se "reanuda").

    }

    @Override

    protected void onPause() {

        super.onPause();

        Toast.makeText(this, "Abierta en segundo plano", Toast.LENGTH_SHORT).show();

// Enfocarse en otra actividad (esta actividad está a punto de ser "detenida").

    }

    /*@Override

    protected void onStop() {

        super.onStop();

        Toast.makeText(this, "OnStop", Toast.LENGTH_SHORT).show();

// La actividad ya no es visible (ahora está "detenida")

    }

    @Override

    protected void onDestroy() {

        super.onDestroy();

        Toast.makeText(this, "OnDestroy", Toast.LENGTH_SHORT).show();
    }*/

}