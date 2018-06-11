package br.com.utp.brothersnetworks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.utp.brothersnetworks.activities.LoginActivity_;
import br.com.utp.brothersnetworks.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity.onCreate");

        // TODO: Validar se o usuario ja esta logado

        // Cria uma intenção de iniciar a LoginActivity e inicia ela
        LoginActivity_.intent(this).start();
        finish();   // Termina a activity main


    }
}
