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
        intent.putExtra(App.Nome, nome);
        //Telefone
        EditText editTextTelefone = (EditText) findViewById(R.id.editTextTelefone);
        String telefone = editTextTelefone.getText().toString();
        intent.putExtra(App.Telefone, telefone);

        startActivity(intent);
    }
}
