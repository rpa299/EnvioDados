package pt.ipg.enviodados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activity_LerDados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__ler_dados);

        Intent intent = getIntent();
        //Nome
        String Nome = intent.getStringExtra(App.Nome);
        TextView textViewVerNome = (TextView) findViewById(R.id.textViewVerNome);
        textViewVerNome.setText(Nome);
        //Telefone
        String Telefone = intent.getStringExtra(App.Telefone);
        TextView textViewVerTelefone = (TextView) findViewById(R.id.textViewVerTelefone);
        textViewVerTelefone.setText(Telefone);
        //Email
        String Email = intent.getStringExtra(App.Email);
        TextView textViewVerEmail = (TextView) findViewById(R.id.textViewVerEmail);
        textViewVerEmail.setText(Email);
        //Idade
        String Idade = intent.getStringExtra(App.Idade);
        TextView textViewVerIdade = (TextView) findViewById(R.id.textViewVerIdade);
        textViewVerIdade.setText(Idade);
        //Peso
        String Peso = intent.getStringExtra(App.Peso);
        TextView textViewVerPeso = (TextView) findViewById(R.id.textViewVerPeso);
        textViewVerPeso.setText(Peso);
        //Altura
        String Altura = intent.getStringExtra(App.Altura);
        TextView textViewVerAltura = (TextView) findViewById(R.id.textViewVerAltura);
        textViewVerAltura.setText(Altura);
    }
}
