package br.tecpuc.festaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    CheckBox checkBox;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.editText = (EditText) findViewById(R.id.editText);
        this.checkBox = (CheckBox) findViewById(R.id.checkBox);
        this.checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        this.checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        this.checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        this.textView2 = (TextView) findViewById(R.id.textView2);
    }

    public void calcularPedido(View view) {
        String aux = editText.getText().toString();
        int numero_pessoas = Integer.parseInt(aux);
        String mensagem = "Número de Pessoas: " + numero_pessoas + "\n";
        double preco = 0.00;
        if(checkBox.isChecked()){
            preco += numero_pessoas * 4.65;
            mensagem += numero_pessoas + " Pessoa(s) x 70gramas de Bolo ="  + numero_pessoas * 70 + "gramas de Bolo\n";
        }
        if(checkBox2.isChecked()){
            preco += numero_pessoas * 6.10;
            mensagem += numero_pessoas + " Pessoa(s) x 5 Unidades de Doces ="  + numero_pessoas * 5 + " Unidades de Doces\n";
        }
        if(checkBox3.isChecked()){
            preco += numero_pessoas * 5.80;
            mensagem += numero_pessoas + " Pessoa(s) x 10 Unidades de Salgadinhos ="  + numero_pessoas * 10 + " Unidades de Salgadinhos\n";
        }
        if(checkBox4.isChecked()){
            preco += numero_pessoas * 2.77;
            mensagem += numero_pessoas + " Pessoa(s) x 600ml de Refrigerante =" + numero_pessoas * 70 + "ml de Refrigerante\n";
        }
        mensagem += "Valor Total do pedido: R$" + preco;
        textView2.setText(mensagem);
    }
}
