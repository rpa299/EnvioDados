package pt.ipg.enviodados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enviarDados(View view) {
        Intent intent = new Intent(this, activity_LerDados.class);
        //Nome
        EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
        String nome = editTextNome.getText().toString();
        if(nome.length() == 0){
            editTextNome.setError("Preencha um nome");
            editTextNome.requestFocus();
            return;
        }
        intent.putExtra(App.Nome, nome);

        //Telefone
        EditText editTextTelefone = (EditText) findViewById(R.id.editTextTelefone);
        String telefone = editTextTelefone.getText().toString();
        if(telefone.length() < 9){
            editTextTelefone.setError("Telefone Invalido");
            editTextTelefone.requestFocus();
            return;
        }
        intent.putExtra(App.Telefone, telefone);

        //Email
        EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        String email = editTextEmail.getText().toString();
        if(email.length() == 0){
            editTextEmail.setError("Preencha um Email");
            editTextEmail.requestFocus();
            return;
        }
        intent.putExtra(App.Email, email);

        //Idade
        EditText editTextIdade = (EditText) findViewById(R.id.editTextIdade);
        String idade = editTextIdade.getText().toString();
        if(idade.length() == 0){
            editTextIdade.setError("Preencha uma Idade");
            editTextIdade.requestFocus();
            return;
        }
        intent.putExtra(App.Idade, idade);

        //Peso
        EditText editTextPeso = (EditText) findViewById(R.id.editTextPeso);
        String peso = editTextPeso.getText().toString();
        if(peso.length() == 0){
            editTextPeso.setError("Preencha um peso");
            editTextPeso.requestFocus();
            return;
        }
        intent.putExtra(App.Peso, peso);

        //Altura
        EditText editTextAltura = (EditText) findViewById(R.id.editTextAltura);
        String altura = editTextAltura.getText().toString();
        if(altura.length() == 0){
            editTextAltura.setError("Preencha uma Altura");
            editTextAltura.requestFocus();
            return;
        }
        intent.putExtra(App.Altura, altura);

        startActivity(intent);
    }
}
