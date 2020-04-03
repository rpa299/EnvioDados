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
        String Nome = intent.getStringExtra(App.Nome);
        TextView textViewNome = (TextView) findViewById(R.id.textViewVerNome);
        textViewNome.setText(Nome);
    }
}
