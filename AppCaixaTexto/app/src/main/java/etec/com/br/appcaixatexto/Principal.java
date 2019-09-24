package etec.com.br.appcaixatexto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Principal extends AppCompatActivity {


    EditText nomeDigitado;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        nomeDigitado = (EditText) findViewById(R.id.edtNome);
        botao = (Button) findViewById(R.id.btnEnvia);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nome;
                nome = nomeDigitado.getText().toString();
                Toast.makeText(Principal.this, "Nome digitado: " + nome, Toast.LENGTH_LONG).show();
            }
        });
    }
}
