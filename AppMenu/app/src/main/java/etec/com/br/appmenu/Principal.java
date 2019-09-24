package etec.com.br.appmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {

    Button menu, botao1, botao2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        menu = (Button) findViewById(R.id.btnMenu);
        botao1 = (Button) findViewById(R.id.btnT2);
        botao2 = (Button) findViewById(R.id.btnT3);


        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if((botao1.getVisibility()==View.VISIBLE)&&(botao2.getVisibility()==View.VISIBLE)){
                        botao1.setVisibility(View.INVISIBLE);
                        botao2.setVisibility(View.INVISIBLE);
                }
                else
                {       botao1.setVisibility(View.VISIBLE);
                        botao2.setVisibility(View.VISIBLE);
                }
            }
        });
        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irT2 = new Intent(Principal.this, Tela2.class);
                startActivity(irT2);
                botao1.setVisibility(View.INVISIBLE);
                botao2.setVisibility(View.INVISIBLE);
            }
        });
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irT3 = new Intent(Principal.this, Tela3.class);
                startActivity(irT3);
                botao1.setVisibility(View.INVISIBLE);
                botao2.setVisibility(View.INVISIBLE);
            }
        });
    }
}
