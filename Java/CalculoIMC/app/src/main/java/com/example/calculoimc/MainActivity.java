package com.example.calculoimc;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    TextView peso;
    TextView altura;

    private TextView textViewResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.peso = (EditText) findViewById(R.id.peso);
        this.altura = (EditText) findViewById(R.id.altura);
        this.textViewResultado = (TextView) findViewById(R.id.resultado);
    }

    public void Calc(View view) {

        String pes = peso.getText().toString();
        String alt = altura.getText().toString();
        Float peso = Float.parseFloat(pes);
        Float altura = Float.parseFloat(alt);

        Float result = peso / (altura * altura);
        DecimalFormat formatNumber = new DecimalFormat("0.00");

        textViewResultado.setText(String.valueOf(formatNumber.format(result)));

    }


}