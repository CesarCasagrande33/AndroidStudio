package com.example.applanchonete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chkBoxXSalada;
    CheckBox chkBoxXRibs;
    CheckBox chkBoxMisto;
    CheckBox chkBoxBatataP;
    CheckBox chkBoxBatataG;
    CheckBox chkBoxRefri300;
    CheckBox chkBoxRefri600;
    CheckBox chkBoxChopp300;
    CheckBox chkBoxChopp600;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkBoxXSalada = (CheckBox) findViewById(R.id.checkBox);
        chkBoxXRibs = findViewById(R.id.checkBox2);
        chkBoxMisto = findViewById(R.id.checkBox3);
        chkBoxBatataP = findViewById(R.id.checkBox4);
        chkBoxBatataG = findViewById(R.id.checkBox5);
        chkBoxRefri300 = findViewById(R.id.checkBox6);
        chkBoxRefri600 = findViewById(R.id.checkBox7);
        chkBoxChopp300 = findViewById(R.id.checkBox8);
        chkBoxChopp600 = findViewById(R.id.checkBox9);
    }

    public void onCheckBoxClick (View view)
    {
        boolean checado = ((CheckBox) view).isChecked();

        switch (view.getId())
        {
            case R.id.checkBox:
                if (checado)
                {

                    Toast.makeText( this, "Você selecionou X-Salada", Toast.LENGTH_SHORT).show();
                }
             else
                {
                    Toast.makeText( this,  "Você desmarcou X-Salada", Toast.LENGTH_SHORT).show();
                }
             break;

            case R.id.checkBox2:
                if (checado)
                {
                    Toast.makeText( this,  "Você selecionou X-Ribs duplo", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText( this,  "Você desmarcou X-Ribs duplo", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.checkBox3:
                if (checado)
                {
                    Toast.makeText( this,  "Você selecionou Misto", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText( this,  "Você desmarcou Misto", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.checkBox4:
                if (checado)
                {
                    Toast.makeText( this,  "Você selecionou Batata pequena", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText( this,  "Você desmarcou Batata pequena", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.checkBox5:
                if (checado)
                {
                    Toast.makeText( this,  "Você selecionou Batata grande", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText( this,  "Você desmarcou Batata grande", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.checkBox6:
                if (checado)
                {
                    Toast.makeText( this,  "Você selecionou Refri 300ml", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText( this,  "Você desmarcou Refri 300ml", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.checkBox7:
                if (checado)
                {
                    Toast.makeText( this,  "Você selecionou Refri 600ml", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText( this,  "Você desmarcou Refri 600ml", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.checkBox8:
                if (checado)
                {
                    Toast.makeText( this,  "Você selecionou Chopp 300ml", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText( this,  "Você desmarcou Chopp 300ml", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.checkBox6:
                if (checado)
                {
                    Toast.makeText( this,  "Você selecionou Chopp 600ml", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText( this,  "Você desmarcou Chopp 600ml", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    public void onCalcularClick(View visao)
    {
        String mensagem = "";
        Float valor = 0;

        boolean chkXS = chkBoxXSalada.isChecked();
        boolean chkXR = chkBoxXRibs.isChecked();
        boolean chkMQ = chkBoxMisto.isChecked();
        boolean chkBP = chkBoxBatataP.isChecked();
        boolean chkBG = chkBoxBatataG.isChecked();
        boolean chkR3 = chkBoxRefri300.isChecked();
        boolean chkR6 = chkBoxRefri600.isChecked();
        boolean chkC3 = chkBoxChopp300.isChecked();
        boolean chkC6 = chkBoxChopp600.isChecked();


        if (chkXS)
        {
            valor = valor + 17,50f;
            mensagem = mensagem + "X-Salada:" + chr(13);
        }

        if (chkXR)
        {
            valor = valor + 29,50f;
            mensagem = mensagem + "X-Ribs duplo:" + chr(13);
        }

        if (chkMQ)
        {
            valor = valor + 9,90f;
            mensagem = mensagem + "Misto Quente:" + chr(13);
        }

        if (chkBP)
        {
            valor = valor + 9,50f;
            mensagem = mensagem + "Batata Pequena:" + chr(13);
        }

        if (chkBG)
        {
            valor = valor + 18,50f;
            mensagem = mensagem + "Batata Grande:" + chr(13);
        }

        if (chkR3)
        {
            valor = valor + 6,00f;
            mensagem = mensagem + "Refri 300ml:" + chr(13);
        }

        if (chkR6)
        {
            valor = valor + 9,00f;
            mensagem = mensagem + "Refri 600ml:" + chr(13);
        }

        if (chkC3)
        {
            valor = valor + 9,00f;
            mensagem = mensagem + "Chopp 300ml:" + chr(13);
        }

        if (chkC6)
        {
            valor = valor + 12,00f;
            mensagem = mensagem + "Chopp 600ml:" + chr(13);
        }
        mensagem = mensagem + "Total: " + String.valueOf(valor);

        Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
    }

}
