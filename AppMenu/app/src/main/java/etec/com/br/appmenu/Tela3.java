package etec.com.br.appmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Tela3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela3);
    }
    @Override
    public void onBackPressed(){
        Toast.makeText(this,"Utilize o botão voltar do aplicativo", Toast.LENGTH_LONG).show();
    }
}
